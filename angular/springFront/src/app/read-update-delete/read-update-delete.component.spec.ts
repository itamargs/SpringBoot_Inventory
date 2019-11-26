import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReadUpdateDeleteComponent } from './read-update-delete.component';

describe('ReadUpdateDeleteComponent', () => {
  let component: ReadUpdateDeleteComponent;
  let fixture: ComponentFixture<ReadUpdateDeleteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReadUpdateDeleteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReadUpdateDeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
