import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PonyFormComponent } from './pony-form.component';

describe('PonyFormComponent', () => {
  let component: PonyFormComponent;
  let fixture: ComponentFixture<PonyFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PonyFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PonyFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
