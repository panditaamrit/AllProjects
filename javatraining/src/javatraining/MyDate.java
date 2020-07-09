package javatraining;

public class MyDate {
	
	int day;
	int month;
	int year;
	public MyDate(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
		
		System.out.println("In param Constructor");
	}
	public MyDate(){
		
		System.out.println("In Constructor");
	}
	public void setDay(int d){
    day = d;
	System.out.println("setDay");
	}
	public void setMonth(int m){
		month = m;
		System.out.println("setMonth");
		}
		
	public void setYear(int y){
		  year = y;
		  System.out.println("setYear");
		}
	public int getDay(){
	    return day;
		}
		
	public int getMonth(){
		return  month;
		}
		
	public int getYear(){
		  return year;
		}
	
	public static void main(String args[]){
		  
		  MyDate date = new MyDate(20,5,2019);
		  System.out.println("Today is "+ date.getDay()+"/"+date.getMonth()+"/"+date.getYear());
		  
		  date.setDay(1);
	      date.setMonth(7);
	      date.setYear(2019);
		  
		  System.out.println("Today is "+ date.getDay()+"/"+date.getMonth()+"/"+date.getYear());
		  
		  
		   
		  }
}	







