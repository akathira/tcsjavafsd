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

  productId: number = 127676;

  description: string = "Apple Mac Book - Retina eye";

  qty: number = 0;

  price: number = 200000;

  availabe: string = 'green';

  notavailable: string = 'red';

  delivery: string = 'red';

  isMember = true;

  isqtyavailable = this.qty > 0;

  orderedqty: number = 0;

  takeOrder():void{
    console.log(this.orderedqty+" Order(s) Placed");
  }

  products = [
    {"id":1,"name":"Licensed Frozen Hat","description":"Incidunt et magni","price":"170.00","quantity":56840},
    {"id":2,"name":"Rustic Concrete Chicken","description":"Sint libero mollitia","price":"302.00","quantity":9358},
    {"id":3,"name":"Fantastic Metal Computer","description":"In consequuntur cupiditat","price":"279.00","quantity":90316},
    {"id":4,"name":"Refined Concrete Chair","description":"Saepe nemo praesentium","price":"760.00","quantity":5899}
];

items: Item[]=[
  new Item(1,"Iphone","smart phone",78900,5),
  new Item(2,"Samsung phone","smart phone",90900,5),
  new Item(3,"onePlus","smart phone",20900,5),
]

}

