import { Component, OnInit } from '@angular/core';
import { Race } from '../race';
import { RaceService } from '../race.service';

@Component({
  selector: 'app-races',
  templateUrl: './races.component.html',
  styleUrls: ['./races.component.css']
})
export class RacesComponent implements OnInit
{
  races: Array<Race>;
  votes: Array<number>;

  constructor(private service: RaceService)
  {
    this.votes = new Array<number>();
    this.service.getAllRaces().subscribe(r =>
    {
      this.races = r;
      for (const i in this.races)
      {
        this.votes.push(0);
      }
    });
  }

  ngOnInit()
  {

  }

  onClickParent(race: Race)
  {
    const index = this.races.indexOf(race);
    this.votes[index] +=1;
    
  }

}
