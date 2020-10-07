import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CommitteeRoutingModule } from './committee-routing.module';
import { ReactiveFormsModule } from '@angular/forms';
import {MatDialogModule} from '@angular/material/dialog';
import {CommitteeListComponent} from './committee-list/committee-list.component';

@NgModule({
  declarations: [CommitteeListComponent],
  imports: [
    CommonModule,
    CommitteeRoutingModule,
    ReactiveFormsModule,
    MatDialogModule
  ]
})
export class CommitteeModule { }
