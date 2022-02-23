import java.util.*;
class Palindrom{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int rev=0;
		int rem=0;
		int temp=num;
		while(temp!=0){
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==num){
			System.out.println("The given number "+num+" is a palindrom number");
		}
		else{
			System.out.println("The given number "+num+" is not a palindrom number");
		}
	}
}