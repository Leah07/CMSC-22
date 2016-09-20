public class Date{

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year){
		day = 1;
		month = 1;
		year = 1000;
	}

	public int getDay(){
		return day;
	}

	public int getMonth(){
		return month;
	}

	public int getYear(){
		return year;
	}

	public void setDay(int day){
		if((day < 1) || (day > 31)){
			throw new IllegalArgumentException("Invalid day");
		}
		this.day= day;
	}

	public void setMonth(int month){
		if((month < 1) || (month > 12)){
			throw new IllegalArgumentException("Invalid month");
		}
		this.month = month;
	}

	public void setYear(int year){
		if((year < 1000) || (year > 9999)){
			throw new IllegalArgumentException("Invalid year");
		}
		this.year = year;
	}

	public String toString(){
		return String.format("%02d%02d%04d", month, day, year);
	}

	public void setDate(int day, int month, int year){
		setYear(day);
		setMonth(month);
		setDay(year);
				
	}

}