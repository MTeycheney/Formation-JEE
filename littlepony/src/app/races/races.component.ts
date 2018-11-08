import { Component, OnInit } from '@angular/core';
import { Race } from '../race';
import { RaceService } from '../race.service';

@Component({
  selector: 'app-races',
  templateUrl: './races.component.html',
  styleUrls: ['./races.component.css']
})
export class RacesComponent implements OnInit {
  races: Array<Race>;
  constructor(private service: RaceService) { 
    this.service.getAllRaces().subscribe(r => this.races = r);
  }

  ngOnInit() {
  }

}
