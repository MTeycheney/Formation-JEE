import { Injectable } from '@angular/core';
import { Pony } from './pony';
import { PONIES } from './ponies-mock';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PonyService { // equivalent a la DAO

  ponies: Array<Pony>;
  constructor() { 
      this.ponies = [];
      this.ponies = PONIES;
  }

  getAllPonies(): Observable<Array<Pony>>
  {
      return of(this.ponies);
  }

  addPony(p: Pony) : void
  {
    this.ponies.push(p);
  }
}
