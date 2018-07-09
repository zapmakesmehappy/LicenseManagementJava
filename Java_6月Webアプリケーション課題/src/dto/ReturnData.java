package dto;

public class ReturnData {
	private String name;
	private String lname;
	private int date;
	private String sof;

	public ReturnData(){

	}

	public ReturnData(String name, String lname, int date, String sof) {
		this.name = name;
		this.lname = lname;
		this.date = date;
		this.sof = sof;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getSof() {
		return sof;
	}

	public void setSof(String sof) {
		this.sof = sof;
	}


}
