import java.util.*;
class printing{
	public static void print(int x){
		if(x<=10){
			System.out.println(x);
			print(x+1);
		}
		
	}
}
class OneToTen{
	public static void main(String args[]){
		int num=1;
		printing pr=new printing();
		pr.print(num);
	}
}