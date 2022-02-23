import java.util.*;
class EvenOdd2{
	public static void isEven(int x){
		if(x%2==0){
			System.out.println("Number is even");
		}
		else{
			System.out.println("Number is odd");
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		isEven(num);
	}
}