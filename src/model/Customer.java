package project1;

public class Customer {
String name;
int id;
String address;

public Customer(String name, int id, String address) {
	super();
	this.name = name;
	this.id = id;
	this.address = address;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}

