import { Component, OnInit } from '@angular/core';
import { PermissionService } from '../permission.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-module-list',
  templateUrl: './module-list.component.html',
  styleUrls: ['./module-list.component.scss']
})

export class ModuleListComponent implements OnInit {
  constructor(private _permissionService : PermissionService, private _router : Router) {}

 modules;

 ngOnInit(): void {
   this._permissionService.findAllModules().subscribe(result => {
     console.log(result);
     this.modules = result;
   })
 }

 updateModule(id){
   this._router.navigate(['/permissions/update-module/'+id]);
 }

 goToModuleLink(link){
   window.location.href = link;
 }

}
