import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { catchError, throwError } from 'rxjs';
import { ProductService } from '../../product.service';
import { Product } from '../../model/Product';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-findbyid',
  templateUrl: './findbyid.component.html',
  styleUrl: './findbyid.component.css'
})
export class FindbyidComponent {
  
  searchTerm: string = '';
  searchResult: any; // Variable to hold the search result
 
 
products : Product[] = [];
  constructor(private dataService: ProductService) { }

  search(): void {
    if (this.searchTerm.trim() !== '') {
      this.dataService.getProductbyId(this.searchTerm).subscribe((result: any) => {
        this.searchResult = result;
      });
    }
  }


}
