import { Component, OnInit } from '@angular/core';
import { Item } from '../item';
import { CreateItemService } from '../create-item.service';


@Component({
  selector: 'app-registration',
  templateUrl: './create-item.component.html',
  styleUrls: ['./create-item.component.css']
})
export class CreateItemComponent implements OnInit {


  item: Item=new Item("",0,0,"");
  message:any;
  items: any;
  data: any;

  constructor(private service:CreateItemService) { }

  ngOnInit() {
  }


  public addItemNow(){
    let resp=this.service.addItem(this.item);
    // resp.subscribe( resp => this.message(JSON.parse(resp['_body'])));
  }

  removeItemNow() {
    let resp=this.service.removeItem(this.item);
  }

  readItemNow() {
    let resp= this.service.readItem(this.item);
    // resp.subscribe((data)=>this.items=data);

  }

  updateItemNow() {

  }
}
