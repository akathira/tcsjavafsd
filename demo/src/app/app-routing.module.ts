import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PostComponent } from './crud/post/post.component';
import { RetrieveComponent } from './retrieve/retrieve.component';
import { UpdateComponent } from './crud/update/update.component';
import { DeleteComponent } from './crud/delete/delete.component';
import { FetchComponent } from './crud/fetch/fetch.component';


const routes: Routes = [
  {path: 'post-product',component: PostComponent},
  {path: 'delete-product',component: DeleteComponent},
  {path: 'retrieve-product',component: RetrieveComponent},
  {path: 'update-product',component: UpdateComponent}
 
];
 

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
