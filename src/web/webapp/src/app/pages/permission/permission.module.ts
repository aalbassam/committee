import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PermissionAddComponent } from './permission-add/permission-add.component';
import { ModuleAddComponent } from './module-add/module-add.component';
import { ModuleListComponent } from './module-list/module-list.component';
import { ModuleUpdateComponent } from './module-update/module-update.component';
import { PermissionRoutingModule } from './permission-routing.module';
import { ReactiveFormsModule } from '@angular/forms';
import {MatDialogModule} from '@angular/material/dialog';
import { IconModalComponent } from './shared/icon-modal/icon-modal.component';

@NgModule({
  declarations: [PermissionAddComponent, ModuleAddComponent, ModuleListComponent, ModuleUpdateComponent, IconModalComponent],
  imports: [
    CommonModule,
    PermissionRoutingModule,
    ReactiveFormsModule,
    MatDialogModule
  ], entryComponents : [
    IconModalComponent
  ]
})
export class PermissionModule { }
