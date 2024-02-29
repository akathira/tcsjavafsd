export class Item{
    itemCode:number;
    name:string;
    description:string;
    price:number;
    qty:number;

    constructor(itemCode:number,
        name:string,
        description:string,
        price:number,
        qty:number,
    ){
        this.itemCode=itemCode;
    this.name=name;
    this.description=description;
    this.price=price;
    this.qty=qty;

    }
}