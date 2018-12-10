import { Component, OnInit } from '@angular/core';
import { Pony } from '../pony';
import { PonyService } from '../pony.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pony-form',
  templateUrl: './pony-form.component.html',
  styleUrls: ['./pony-form.component.css']
})
export class PonyFormComponent implements OnInit {
  model: Pony; 
  
  constructor(private service: PonyService, private router: Router) {
    this.model = new Pony();
   }

  ngOnInit() {
  }

  onSubmit()
  {
    this.service.addPony(this.model);
    this.router.navigate(['/Ponies']);
  }
}
