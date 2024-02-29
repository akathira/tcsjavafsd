import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpComponent } from './http/http.component';
import { HttpClientModule } from '@angular/common/http';
import { PostComponent } from './crud/post/post.component';
import { UpdateComponent } from './crud/update/update.component';
import { DeleteComponent } from './crud/delete/delete.component';
import { FetchComponent } from './crud/fetch/fetch.component';
import { RetrieveComponent } from './retrieve/retrieve.component';
import { FormsModule } from '@angular/forms';
import { FindbyidComponent } from './crud/findbyid/findbyid.component';


@NgModule({
  declarations: [
    AppComponent,
    HttpComponent,
    PostComponent,
    UpdateComponent,
    DeleteComponent,
    FetchComponent,
    RetrieveComponent,
    FindbyidComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, HttpClientModule, FormsModule
  ],
  providers: [
    provideClientHydration(), 
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
