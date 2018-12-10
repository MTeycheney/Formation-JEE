import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Race } from '../race';

@Component({
  selector: 'app-race-detail',
  templateUrl: './race-detail.component.html',
  styleUrls: ['./race-detail.component.css']
})
export class RaceDetailComponent implements OnInit
{

  @Input() race: Race;
  @Output() onClick = new EventEmitter<Race>();

  constructor()
  { 
    
  }

  ngOnInit()
  {

  }

  addVote(race: Race)
  {
    this.onClick.emit(race);
  }

}
