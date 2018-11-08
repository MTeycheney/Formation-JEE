import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { PonyService } from '../pony.service';
import { Router } from '@angular/router';
import { Pony } from '../pony';

@Component({
  selector: 'app-pony-reactive-form',
  templateUrl: './pony-reactive-form.component.html',
  styleUrls: ['./pony-reactive-form.component.css']
})

export class PonyReactiveFormComponent implements OnInit {

  ponyForm = this.fb.group
  ({
    name: ['nom', Validators.required],
    age: ['1', Validators.required],
    color: ['vert', Validators.required],
    weight: ['1', Validators.required]
  });

  constructor(private fb: FormBuilder, private service: PonyService, private router: Router)
  {

  }

  ngOnInit()
  {

  }

  onSubmit()
  {
    let p: Pony = this.ponyForm.value;
    this.service.addPony(p);
    this.router.navigate(['/Ponies']);
  }
}
