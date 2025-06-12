package day1;
import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
		int a,b,c;
		Scanner input;
		input= new Scanner(System.in);
		System.out.println("a");
		a=input.nextInt();
		System.out.println("b");		
		b=input.nextInt();
		c=a+b;
		System.out.print("Addition of a="+a+" and b= "+b+" is "+c);

	}

}
