import java.util.*;
class SmallestOfThree{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		System.out.println("Enter third number");
		int num3=sc.nextInt();
		
		int temp=num1>num2?num1:num2;
		int smallest=num3<temp?num3:temp;
		System.out.println("The smallest number is "+smallest);
		
		
	}
}