import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateItemComponent } from './create-item/create-item.component';
import { ReadUpdateDeleteComponent } from './read-update-delete/read-update-delete.component';
import {CreateItemService} from "./create-item.service";
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";

//The root module of the application
// runs (bootstrap) the AppComponent

@NgModule({
  declarations: [
    AppComponent,
    CreateItemComponent,
    ReadUpdateDeleteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
  ],
  providers: [CreateItemService],
  bootstrap: [AppComponent]
})
export class AppModule { }
