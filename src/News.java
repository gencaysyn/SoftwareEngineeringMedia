import java.util.Date;

public class News {
	private String content;
	private Date release_day;
	private int customer_id,media_id;

	public News(String content, Date release_day, int customer_id, int media_id) {
		super();
		this.content = content;
		this.release_day = release_day;
		this.customer_id = customer_id;
		this.media_id = media_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRelease_day() {
		return release_day;
	}

	public void setRelease_day(Date release_day) {
		this.release_day = release_day;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getMedia_id() {
		return media_id;
	}

	public void setMedia_id(int media_id) {
		this.media_id = media_id;
	}
	
	
	
}
