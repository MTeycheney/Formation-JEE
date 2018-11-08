import { TestBed } from '@angular/core/testing';

import { PonyService } from './pony.service';

describe('PonyService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PonyService = TestBed.get(PonyService);
    expect(service).toBeTruthy();
  });
});
