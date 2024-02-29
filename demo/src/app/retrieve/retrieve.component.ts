import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../model/Product';

@Component({
  selector: 'app-retrieve',
  templateUrl: './retrieve.component.html',
  styleUrl: './retrieve.component.css'
})
export class RetrieveComponent implements OnInit {


  ngOnInit(): void{
    this.products=this.getProducts();
  }

  products: Product[]=[];

  constructor(private service : ProductService) {}

getProducts(): any{
  this.service.getProducts().subscribe((products) => {
    this.products=products;
    });

}
 

}
