import { TestBed } from '@angular/core/testing';

import { CreateItemService } from './create-item.service';

describe('CreateUserService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CreateItemService = TestBed.get(CreateItemService);
    expect(service).toBeTruthy();
  });
});
