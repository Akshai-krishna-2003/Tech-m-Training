import { Component } from '@angular/core';

@Component({
  selector: 'app-parent-component',
  templateUrl: './parent-component.component.html',
  styleUrls: ['./parent-component.component.css']
})
export class ParentComponentComponent {
  selectedItem: string = ''; // I think this will have selected component

  // Method to update selected item
  selectItem(item: string) {
    this.selectedItem = item;
  }
}
