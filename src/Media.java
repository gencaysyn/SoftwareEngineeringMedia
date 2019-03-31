import java.util.ArrayList;

public class Media {
private String type,name;
private int media_id;
private ArrayList<News> news = new ArrayList<News>();

public Media(String type, String name, int media_id, ArrayList<News> news) {
	super();
	this.type = type;
	this.name = name;
	this.media_id = media_id;
	this.news = news;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getMedia_id() {
	return media_id;
}

public void setMedia_id(int media_id) {
	this.media_id = media_id;
}

public ArrayList<News> getNews() {
	return news;
}

public void setNews(ArrayList<News> news) {
	this.news = news;
}



}
