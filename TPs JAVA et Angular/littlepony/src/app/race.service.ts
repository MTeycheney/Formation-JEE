import { Injectable } from '@angular/core';
import { Race } from './race';
import { RACES } from './race-mock';
import { of, Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class RaceService
{
  url: String = 'http://localhost:8085/api/races';
  races: Array<Race>;

  constructor()
  { 
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
