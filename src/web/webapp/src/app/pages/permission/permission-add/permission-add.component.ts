import { Component, OnInit } from '@angular/core';
import { Permission } from '../model/permission';
import { Employee } from '../model/Employee';
import { FormGroup, FormBuilder, FormControl, FormArray } from '@angular/forms';
import { PermissionService } from '../permission.service';
import { Module } from '../model/module';


@Component({
  selector: 'app-permission-add',
  templateUrl: './permission-add.component.html',
  styleUrls: ['./permission-add.component.scss']
})
export class PermissionAddComponent implements OnInit {

  modulesForm: FormGroup;
  allModules;
  selectedUser : Employee;
  empPermissions : Permission[];

  constructor(private _fb: FormBuilder, private _permissionService:PermissionService) { }


  private addCheckboxes() : FormArray{
    this.allModules.forEach(element => {
      console.log(this.empPermissions.includes(element.moduleId));
    });

    const array = this.allModules.map((module : Module) => {
      var hasPermission = false;
      this.empPermissions.forEach(element => {
        console.log(element.moduleId);
        if(module.moduleId=== element.moduleId){
          hasPermission = true;
        }
      })
        return new FormControl(hasPermission);
    });
    console.log(array);
    return new FormArray(array);
  }

  ngOnInit(): void { 
  }

  checkboxChanged(value){
    const sys = this.modulesForm.controls.systems as FormGroup;
          console.log(sys.controls);
    console.log(value);
    const el = value as HTMLElement;
    const checkboxId = el.getAttribute('ng-reflect-name');
    if(value.checked){
      this._permissionService.addModuleToUser(new Permission(this.selectedUser.empNid,this._getModuleId(checkboxId))).subscribe(result => {
        console.log(result);
      },error=> {
        console.log(error);
      });
    }else{
      this._permissionService.removeModuleFromUser(new Permission(this.selectedUser.empNid,this._getModuleId(checkboxId))).subscribe(result => {
        console.log(result);
      },error=> {
        console.log(error);
      });
    }
  }

  private _getModuleId(index){
    return this.allModules[index].moduleId;
  }

  getEmployeeById(id){
    console.log(id);
    this._permissionService.getEmployeeByNationalId(id).subscribe(result => {
      this.selectedUser = <Employee>result;
      this._permissionService.getUserModules(this.selectedUser.empNid).subscribe(permissions => {
        this.empPermissions = <Permission[]>permissions;
        console.log('user permissions ,', this.empPermissions);
          this._permissionService.findAllModules().subscribe(result => {
            this.allModules = <Module[]> result;
            this.modulesForm = this._fb.group({
              systems: this.addCheckboxes()
            });
            
          },error => {
            console.log(error);
          })
          },error => {
            console.log(error);
          });
    },error => {
      console.log(error);
    })
  }

  getUserPermissions(){
    if(this.selectedUser){
      
    }
  }

}
