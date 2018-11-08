import { Component, OnInit, Input } from '@angular/core';
import { Race } from '../race';

@Component({
  selector: 'app-race-detail',
  templateUrl: './race-detail.component.html',
  styleUrls: ['./race-detail.component.css']
})
export class RaceDetailComponent implements OnInit {

  @Input() race: Race;
  constructor() { 
    
  }

  ngOnInit() {
  }

}
