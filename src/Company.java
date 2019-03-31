import java.util.ArrayList;

public class Company {
private String name;
private ArrayList<Customer> customers = new ArrayList<Customer>();
private ArrayList<Report> reports = new ArrayList<Report>();
private ArrayList<Media> medias = new ArrayList<Media>();
private Manager ceo;




public Company(String name, ArrayList<Customer> customers, ArrayList<Report> reports, ArrayList<Media> medias,
		Manager ceo) {
	super();
	this.name = name;
	this.customers = customers;
	this.reports = reports;
	this.medias = medias;
	this.ceo = ceo;
}




public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public ArrayList<Customer> getCustomers() {
	return customers;
}




public void setCustomers(ArrayList<Customer> customers) {
	this.customers = customers;
}




public ArrayList<Report> getReports() {
	return reports;
}




public void setReports(ArrayList<Report> reports) {
	this.reports = reports;
}




public ArrayList<Media> getMedias() {
	return medias;
}




public void setMedias(ArrayList<Media> medias) {
	this.medias = medias;
}




public Manager getCeo() {
	return ceo;
}




public void setCeo(Manager ceo) {
	this.ceo = ceo;
}




public void addCustomer(String name, String surname, String type, int customer_id, ArrayList<Report> reports) {
	Customer cust = new Customer(name,surname,type,customer_id,reports);
	this.customers.add(cust);
}

public void addMedia(String type, String name, int media_id, ArrayList<News> news) {
	Media med = new Media(type,name,media_id,news);
	this.medias.add(med);
}

public void addReport(int customer_id, int report_id, int price, ArrayList<News> news, String type) {
	Report rep = new Report(customer_id,report_id,price,news,type);
	this.reports.add(rep);
	
}


}
