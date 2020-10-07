import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';

import {CommitteeListComponent} from './committee-list/committee-list.component';

const routes: Routes = [
    {
        path: '',
        redirectTo : 'committee-list',
        pathMatch : 'full'
    },
    {
        path: 'committee-list',
        component: CommitteeListComponent
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class CommitteeRoutingModule {
}
