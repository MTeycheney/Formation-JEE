import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { RaceService } from '../race.service';
import { Router } from '@angular/router';
import { Race } from '../race';

@Component({
  selector: 'app-race-reactive-form',
  templateUrl: './race-reactive-form.component.html',
  styleUrls: ['./race-reactive-form.component.css']
})
export class RaceReactiveFormComponent implements OnInit {

  raceForm = this.fb.group
  ({
    location: ['ville', Validators.required],
    date: ['2018-05-11', Validators.required]
  })

  constructor(private fb: FormBuilder, private service: RaceService, private router: Router)
  {

  }

  ngOnInit()
  {

  }

  onSubmit()
  {
    let r: Race = this.raceForm.value;
    this.service.addRace(r);
    this.router.navigate(['/Races']);
  }
}
