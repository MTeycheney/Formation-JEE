import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PonyDetailComponent } from './pony-detail/pony-detail.component';
import { PoniesComponent } from './ponies/ponies.component';
import { RaceDetailComponent } from './race-detail/race-detail.component';
import { RacesComponent } from './races/races.component';
import { RouterModule, Routes, Router} from '@angular/router';
import { PonyFormComponent } from './pony-form/pony-form.component';
import { Form, FormsModule } from '@angular/forms';
import { RaceFormComponent } from './race-form/race-form.component';
import { from } from 'rxjs';
import {PickListModule} from 'primeng/picklist'; 
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import { PonyReactiveFormComponent } from './pony-reactive-form/pony-reactive-form.component';
import { RaceReactiveFormComponent } from './race-reactive-form/race-reactive-form.component';
import { PonyTransformPipe } from './pony-transform.pipe';

const route: Routes = 
[
  {path: '', component: RacesComponent},
  {path: 'Ponies', component: PoniesComponent},
  {path: 'Races', component: RacesComponent},
  {path: 'addPonies', component: PonyFormComponent},
  {path: 'addPoniesV2', component: PonyReactiveFormComponent},
  {path: 'addRace', component: RaceFormComponent},
  {path: 'addRaceV2', component: RaceReactiveFormComponent},
];


@NgModule({
  declarations: [
    AppComponent,
    PonyDetailComponent,
    PoniesComponent,
    RaceDetailComponent,
    RacesComponent,
    PonyFormComponent,
    RaceFormComponent,
    PonyReactiveFormComponent,
    RaceReactiveFormComponent,
    PonyTransformPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(route),
    FormsModule,
    NgbModule,
    PickListModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
