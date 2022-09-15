package exceptionprogram4;

public class Category {
int categoryid;
String categoryname;
public int getCategoryid() {
	return categoryid;
}
public void setCategoryid(int categoryid) {
	this.categoryid = categoryid;
}
public String getCategoryname() {
	return categoryname;
}
public void setCategoryname(String categoryname) {
	this.categoryname = categoryname;
}

public Category(int categoryid, String categoryname) {
	super();
	this.categoryid = categoryid;
	this.categoryname = categoryname;
}
@Override
public String toString() {
	return "Category [categoryid=" + categoryid + ", categoryname=" + categoryname + "]";
}



}
