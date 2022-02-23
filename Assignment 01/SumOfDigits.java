import java.util.*;
class SumOfDigits{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		int rem;
		while(num>0){
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("The sum of digits of given number is "+sum);
	}
}