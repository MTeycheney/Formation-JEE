import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PonyDetailComponent } from './pony-detail.component';

describe('PonyDetailComponent', () => {
  let component: PonyDetailComponent;
  let fixture: ComponentFixture<PonyDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PonyDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PonyDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
