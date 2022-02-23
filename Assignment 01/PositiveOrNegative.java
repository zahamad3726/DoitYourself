import java.util.*;
interface checking{
	public void isPositive(int x);
}
class check implements checking{
		public void isPositive(int x){
			if(x==0)
				System.out.println("0 is neither positive nor negative number");
			else if(x>0)
				System.out.println(x+" is a positive number");
			else
				System.out.println(x+" is a negative number");
		}
}

class PositiveOrNegative{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		checking ch=new check();
		ch.isPositive(num);
		
	}
}