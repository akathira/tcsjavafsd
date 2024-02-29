import { Component, OnInit } from '@angular/core';
import { Product } from '../../model/Product';
import { ProductService } from '../../product.service';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrl: './post.component.css'
})
export class PostComponent implements OnInit{

  ngOnInit(): void{
  }
  product: Product = new Product();
  constructor(private productService: ProductService)
  {
  
  }

  onSubmit(){
    console.log(this.product);
    this.saveProduct();
  }
saveProduct(){
  this.productService.saveProduct(this.product).subscribe((data)=>{
    console.log(data);
  },
  error=>console.log(error));
}


}
