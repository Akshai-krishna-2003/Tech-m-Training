import { Component, Input } from '@angular/core';
import { project } from '../../../model/project';

@Component({
  selector: 'app-project-card',
  templateUrl: './project-card.component.html',
  styleUrl: './project-card.component.css'
})
export class ProjectCardComponent {
  @Input() project:project={
    id: 0, name: '', description: '', image: '',
    status: '',
    startDate: '',
    endDate: '',
    teamSize: 0,
    category: '',
    technologies: [],
    client: '',
    progress: 0
  }
}
