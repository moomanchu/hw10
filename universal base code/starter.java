import pkg.*;
import java.util.ArrayList;
import java.util.Random;

public class starter{

	public static boolean isprime(int a){
		boolean b = false;
		for(int n=1;n<a;n++){
			if(a%n==0 && n!=a && n!=1){
				b = false;
				break;
			}
			else{
				b = true;
			}
		}
		return b;
	}
	
	public static boolean isntprime(int a){//try and do it with recursion
		if(a
		return ;
	}
	
	public static void main(String args[]) {
		EasyReader e = new EasyReader();
		System.out.print("Enter a number from 1 to 1000: ");
		int i = e.readInt();
		System.out.println(isprime(i));
		//System.out.println(10%2);
	}
	
}
