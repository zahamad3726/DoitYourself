import java.util.*;
interface fact{
	public int calculateFactorial(int x);
}
class CalcFactorial implements fact{
	int fact=1;
	public int calculateFactorial(int x){
		for(int i=1;i<=x;i++){
			fact=fact*i;
		}
		return fact;
		
	}
	
}
class Factorial{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	fact fc=new CalcFactorial();
	System.out.println("The factorial of given number is "+fc.calculateFactorial(num));
	}
}