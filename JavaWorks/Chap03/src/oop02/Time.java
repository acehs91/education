package oop02;

public class Time {
	// 상속을 위해 protected 외부접근 차단
	protected int hour;
	protected int min;
	protected int sec;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}

}
