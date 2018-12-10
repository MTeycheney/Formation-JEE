import { Injectable } from '@angular/core';
import { Pony } from './pony';
import { PONIES } from './ponies-mock';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Router } from '@angular/router';
import { RaceService } from './race.service';

@Injectable({
  providedIn: 'root'
})
export class PonyService
{ // equivalent a la DAO

  url: string = 'http://localhost:8085/api/ponies';
  httpOptions =
  {
    headers: new HttpHeaders({'Content-type': 'application/json'})
  };


  ponies: Array<Pony>;
  constructor(private http: HttpClient, private router: Router, private serviceRace: RaceService)
  { 
      this.ponies = [];
      this.ponies = PONIES;
  }


  getAllPonies(): Observable<Array<Pony>>
  {
      return  this.http.get<Array<Pony>>(this.url + '/', this.httpOptions);
  }

  addPony(p: Pony) : void
  {
    this.ponies.push(p);
  }
}
