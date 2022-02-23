import java.util.*;
class DigitPrinting{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		String num1=Integer.toString(num);
		for(int i=0;i<num1.length();i++){
			System.out.println(num1.charAt(i));
		}
	}
}