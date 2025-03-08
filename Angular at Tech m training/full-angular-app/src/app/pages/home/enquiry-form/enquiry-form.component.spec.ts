import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EnqiryFormComponent } from "./enquiry-form.component"

describe('EnquiryFormComponent', () => {
  let component: EnqiryFormComponent;
  let fixture: ComponentFixture<EnqiryFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EnqiryFormComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EnqiryFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
