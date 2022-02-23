import java.util.*;
interface Leap{
	public void isLeapYear(int x);
}
class checkingLeapYear implements Leap{
	public void isLeapYear(int x){
		if((x%4==0 && x%100!=0))
			System.out.println("Yes!!! "+x+" is a leap year");
		else if((x%100==0 && x%400==0)){
			System.out.println("Yes!!! "+x+" is a leap year");
		}
		else{
			System.out.println("Noo!!! "+x+" is not a leap year");
		}
	}
}
class LeapYear{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int yr=sc.nextInt();
		Leap lp=new checkingLeapYear();
		lp.isLeapYear(yr);
	}
}