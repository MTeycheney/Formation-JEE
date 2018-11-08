import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RaceReactiveFormComponent } from './race-reactive-form.component';

describe('RaceReactiveFormComponent', () => {
  let component: RaceReactiveFormComponent;
  let fixture: ComponentFixture<RaceReactiveFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RaceReactiveFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RaceReactiveFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
