import java.util.*;
class FactRec{
	public static int calculateFactorial(int x){
		
		if(x==0){
			return 1;
		}
		else{
			return x*calculateFactorial(x-1);
		}
	}
}

class FactorialUsingRecursion{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		FactRec fr=new FactRec();
		System.out.println("The factorial of "+num+ " is "+fr.calculateFactorial(num));
		
	}
}