import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TeamSizeComponent } from './team-size.component';

describe('TeamSizeComponent', () => {
  let component: TeamSizeComponent;
  let fixture: ComponentFixture<TeamSizeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [TeamSizeComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(TeamSizeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
