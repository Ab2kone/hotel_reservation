import { TestBed } from '@angular/core/testing';

import { GetHotelService } from './get-hotel.service';

describe('GetHotelService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: GetHotelService = TestBed.get(GetHotelService);
    expect(service).toBeTruthy();
  });
});
