import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

// Service for item creation

@Injectable({
  providedIn: 'root'
})
export class CreateItemService {

  constructor(private http:HttpClient) { }


  // POST the item to REST endpoint
  public addItem(item){
  //todo: port better be dynamic
    let res = this.http.post("http://localhost:8080/items", item );
    res.subscribe( res => console.log('--==>> ' + JSON.stringify(res)));
    return res;
  }

  removeItem(item) {
    let res = this.http.delete("http://localhost:8080/items/" + item.itemNo);
    res.subscribe( res => console.log('--==>> ' + JSON.stringify(res)));
    return res;
  }

  readItem(item) {
    let res = this.http.get("http://localhost:8080/items/" + item.itemNo);
    res.subscribe( res => console.log('--==>> ' + JSON.stringify(res)));
    return res;
    // let res = this.http.get("http://localhost:8080/items/");
    // res.subscribe( res => console.log('--==>> ' + JSON.stringify(res)));
    // return res;
  }
}
