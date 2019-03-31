import java.util.ArrayList;

public class Report {
private int customer_id,report_id,price;
private ArrayList<News> news = new ArrayList<News>();
private String type;

public Report(int customer_id, int report_id, int price, ArrayList<News> news, String type) {
	super();
	this.customer_id = customer_id;
	this.report_id = report_id;
	this.price = price;
	this.news = news;
	this.type = type;
}

public int getCustomer_id() {
	return customer_id;
}

public void setCustomer_id(int customer_id) {
	this.customer_id = customer_id;
}

public int getReport_id() {
	return report_id;
}

public void setReport_id(int report_id) {
	this.report_id = report_id;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public ArrayList<News> getNews() {
	return news;
}

public void setNews(ArrayList<News> news) {
	this.news = news;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}


}
