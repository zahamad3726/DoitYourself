import java.util.*;
class ReverseNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		int rem=0;
		int rev=0;
		//char arr[]="";
		while(temp>0){
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println("The reverse of given number is "+rev);
	
	}
}