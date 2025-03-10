import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-child-component', 
  templateUrl: './child-component.component.html',
  styleUrls: ['./child-component.component.css']
})
export class ChildComponentComponent {
  @Input() item: string = ''; //  Now Angular knows 'item' comes from the Parent Component
}
