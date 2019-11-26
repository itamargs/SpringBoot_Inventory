// Item object to pass into the POST request for the REST endpoint

export class Item {
  constructor(
    public name:string,
    public itemNo:number,
    public amount:number,
    public inventory_code:string
  ){}
}



