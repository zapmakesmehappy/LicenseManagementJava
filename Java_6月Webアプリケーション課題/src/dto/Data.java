package dto;

public class Data {
	private int id;
	private int lid;
	private int date;
	private String sof;

	public Data(){

	}

	public Data(int id, int lid, int date, String sof) {
		this.id = id;
		this.lid = lid;
		this.date = date;
		this.sof = sof;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
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
