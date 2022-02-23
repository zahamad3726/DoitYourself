import java.util.*;
class LCM{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		int gcd=1;
		int LCM;
		//LCM=(num1*num2)/GCD
		//Will calculate GCD first
		for(int i=1;i<=num1 &&i<=num2;i++){
			if(num1%i==0 && num2%i==0){
				gcd=i;
			}
		}
		LCM=(num1*num2)/gcd;
		System.out.println("LCM of "+num1+" and "+num2+" is "+LCM);
	}
}