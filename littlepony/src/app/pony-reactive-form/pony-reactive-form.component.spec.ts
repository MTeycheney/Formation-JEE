import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PonyReactiveFormComponent } from './pony-reactive-form.component';

describe('PonyReactiveFormComponent', () => {
  let component: PonyReactiveFormComponent;
  let fixture: ComponentFixture<PonyReactiveFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PonyReactiveFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PonyReactiveFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
