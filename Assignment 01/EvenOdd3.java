import java.util.*;
interface check{
	public void isEven(int x);
}
class checking implements check{
	public void isEven(int x){
		if(x%2==0){
			System.out.println("Number is even");
		}
		else{
			System.out.println("Number is odd");
		}
	}
}
class EvenOdd3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		check ch=new checking();
		ch.isEven(num);
	}
}