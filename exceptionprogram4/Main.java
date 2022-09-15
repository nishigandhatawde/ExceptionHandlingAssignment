package exceptionprogram4;

public class Main {

	public static void main(String[] args) {
		
	
	Item i=new Item("laptop",500000);
	Category c=new Category(100,"electronics");
	ItemBought ib=new ItemBought(201,2);
	
	System.out.println(i);
	System.out.println(c);
	System.out.println(ib);
	

}
}