import java.util.*;
class GCD{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		int gcd=1;
		for(int i=1;i<=num1 && i<=num2;i++){
			if(num1%i==0 && num2%i==0){
				gcd=i;
			}
		}
		System.out.println("The greatest common divisor of "+num1+" and "+num2+" is "+gcd);;
	}
}