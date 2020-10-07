import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CommitteeService } from '../committee.service';

@Component({
  selector: 'app-committee-list',
  templateUrl: './committee-list.component.html',
  styleUrls: ['./committee-list.component.scss']
})


export class CommitteeListComponent implements OnInit {

  constructor(private committeeService: CommitteeService, private _router: Router) {}

  // modules;
  committees;

  ngOnInit(): void {
    this.committeeService.GetAllCommittees().subscribe(result => {
      console.log(result);
      this.committees = result;
    });
  }

  goToModuleLink(link) {
    window.location.href = link;
  }

}

