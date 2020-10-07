import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';

import { ModuleListComponent } from './module-list/module-list.component';
import { ModuleAddComponent } from './module-add/module-add.component';
import { ModuleUpdateComponent } from './module-update/module-update.component';
import { PermissionAddComponent } from './permission-add/permission-add.component';

const routes: Routes = [
    {
        path: '',
        redirectTo : 'module-list',
        pathMatch : 'full'
    },
    {
        path: 'add-module',
        component: ModuleAddComponent
    },
    {
        path: 'update-module/:id',
        component: ModuleUpdateComponent
    },
    {
        path: 'module-list',
        component: ModuleListComponent
    },
    {
        path: 'add-permission',
        component: PermissionAddComponent
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class PermissionRoutingModule {
}
