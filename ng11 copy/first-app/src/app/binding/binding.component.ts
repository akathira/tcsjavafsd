import { Component } from '@angular/core';
import {Item} from '../model/Item';


@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrl: './binding.component.css'
})

export class BindingComponent {

  ngOnDestroy(): void{
    console.log('from...onDestroy');
  }

  ngOnInit(): void{
    console.log('from..OnInit');
  }

  

  items: string[] = ['Item 1', 'Item 2', 'Item 3'];
  newItem: string = ''; // Add this line

  addItem(): void {
    if (this.newItem.trim() !== '') {
      this.items.push(this.newItem);
      this.newItem = ''; // Clear the input after adding an item
    }
  }


  

}

