package exceptionprogram4;

public class Item {
String itemname;
int price;
public String getItemname() {
	return itemname;
}
public void setItemname(String itemname) {
	this.itemname = itemname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

public Item(String itemname, int price) {
	super();
	this.itemname = itemname;
	this.price = price;
}
@Override
public String toString() {
	return "Item [itemname=" + itemname + ", price=" + price + "]";
}



}
