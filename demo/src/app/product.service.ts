import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './model/Product';
import { catchError, throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) { 
    

    }
  

  getProducts(): Observable<Product[]>{
    return this.http.get<Product[]>("http://localhost:9080/product/api.1.0/allproducts");
  }
  

  saveProduct(product: Product): Observable<object>

  {
    return this.http.post("http://localhost:9080/product/api.1.0/addproduct",product);
  }

  getProductbyId(id : String): Observable<Product[]> {
    return this.http.get<Product[]>("http://localhost:9080/product/api.1.0/productid/"+id+"").pipe(
      catchError(error => {
        console.error('Error parsing response:', error);
        return throwError('Something went wrong; please try again later.');
      })
    );
    }
  }