package object06;

public class Jumun {
	public Jumun(int num, String id, String date, String name, String serial, String address) {
		this.num=num;
		this.id=id;
		this.date=date;
		this.name=name;
		this.serial=serial;
		this.address=address;
	}
	
	int num;
	String id;
	String date;
	String name;
	String serial;
	String address;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date=date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial=serial;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
}
