import java.util.ArrayList;

public class Customer {
private String name,surname,type;
private int customer_id;
private ArrayList<Report> reports = new ArrayList<Report>();
public Customer(String name, String surname, String type, int customer_id, ArrayList<Report> reports) {
	super();
	this.name = name;
	this.surname = surname;
	this.type = type;
	this.customer_id = customer_id;
	this.reports = reports;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getCustomer_id() {
	return customer_id;
}
public void setCustomer_id(int customer_id) {
	this.customer_id = customer_id;
}
public ArrayList<Report> getReports() {
	return reports;
}
public void setReports(ArrayList<Report> reports) {
	this.reports = reports;
}


}
