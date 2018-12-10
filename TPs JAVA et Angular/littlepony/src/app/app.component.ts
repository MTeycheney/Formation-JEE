import { Component } from '@angular/core';
import { User } from './user';
import { TrustedStyleString } from '@angular/core/src/sanitization/bypass';
import { Validators, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent
{
  title = 'littlepony';
  currentUser = new User('toto');
  connected: boolean;
  identifiant: string;

  logForm = this.fb.group
  ({
    user: ['user', Validators.required],
    password: ['password', Validators.required]
  });


  constructor(private fb: FormBuilder, private router: Router)
  {
    if(sessionStorage.getItem('user') !== null)
    {
      this.identifiant = sessionStorage.getItem('user');
      this.connected = true;
    }
    else
    {
      this.connected = false;
    }
    
  }

  onSubmitConnection()
  {    
    //this.password = this.logForm.value.password;
    this.connected = true;
    sessionStorage.setItem('user', this.identifiant);
    this.identifiant = this.logForm.value.user;
    console.log(sessionStorage);
    this.router.navigate(['.']);
  }

  onSubmitDeconnection()
  {
    this.connected = false;
    sessionStorage.removeItem('user');
    sessionStorage.removeItem('password');
    this.router.navigate(['.']);
  }
}


