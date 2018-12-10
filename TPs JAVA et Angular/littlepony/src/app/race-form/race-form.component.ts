import { Component, OnInit } from '@angular/core';
import { Race } from '../race';
import { RaceService } from '../race.service';
import { PonyService } from '../pony.service';
import { Router } from '@angular/router';
import { Pony } from '../pony';
import {NgbDateStruct, NgbCalendar} from '@ng-bootstrap/ng-bootstrap';
@Component({
  selector: 'app-race-form',
  templateUrl: './race-form.component.html',
  styleUrls: ['./race-form.component.css']
})
export class RaceFormComponent implements OnInit {
  model: Race;
  ponies: Array<Pony>;
  dateModel: NgbDateStruct;
  date: {year: number, month: number, day: number};
  constructor(private service: RaceService,
    private poneyService: PonyService,
    private calendar: NgbCalendar,
    private router: Router) {
      this.model = new Race();
      this.poneyService.getAllPonies().subscribe(p => this.ponies = p);
     }

  ngOnInit() {
  }

  onSubmit() {
    this.model.date = new Date(this.dateModel.year, this.dateModel.month, this.dateModel.day);
    (this.model);
    this.service.addRace(this.model);
    this.router.navigate(['/']);
  }

}