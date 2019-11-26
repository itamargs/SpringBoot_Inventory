import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ReadUpdateDeleteComponent} from "./read-update-delete/read-update-delete.component";
import { CreateItemComponent } from './create-item/create-item.component';



// add routing for the components
const routes: Routes = [
  {path: "", redirectTo:"add", pathMatch:"full"},
  {path: "add", component:CreateItemComponent},
  {path: "read-update-delete", component:ReadUpdateDeleteComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
