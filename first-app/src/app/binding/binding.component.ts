import { Component } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrl: './binding.component.css'
})
export class BindingComponent {

  topic = 'Angular 15';

productId:number=127676;
description: string = "Apple Mac Book - Retina eye";
qty : number=0;
price:number = 200000;
available :  string = 'green';
notavailable :  string = 'red';
delivery : string = 'red';
isMember=true;
isqtyavailable=this.qty>0;
orderedqty:number=0;
}

