import { Injectable } from '@angular/core';
import { Race } from './race';
import { RACES } from './race-mock';
import { of, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RaceService {

  races: Array<Race>;
  constructor() { 
    this.races = [];
    this.races = RACES;
  }

  getAllRaces(): Observable<Array<Race>>
  {
    return of(this.races);
  }

  addRace(r: Race)
  {
      this.races.push(r);
  }
}
