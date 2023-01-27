//Scenario 1

package CaseStudy4Day3;

public class Travel2 {
	private char travelType;
	private String source;
	private String destination;
	private String date;
	private String time;
	public char getTravelType() {
		return travelType;
	}
	public void setTravelType(char travelType) {
		this.travelType = travelType;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Travel2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Travel2(char travelType, String source, String destination, String date, String time) {
		super();
		this.travelType = travelType;
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.time = time;
	}
	@Override
	public String toString() {
		return "Travel2 [travelType=" + travelType + ", source=" + source + ", destination=" + destination + ", date="
				+ date + ", time=" + time + "]";
	}
	

}
