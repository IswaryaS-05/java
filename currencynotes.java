package training;

import java.util.Scanner;

public class currencynotes {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 
       
        int a,a1,a2,a3,a4,a5,a6;
		a=scanner.nextInt();
		a1=a/100;
		a=a%100;
		a2=a/50;
		a=a%50;
		a3=a/10;
		a=a%10;
		a4=a/5;
		a=a%5;
		a5=a/2;
		a=a%2;
		a6=a;
	    int sum=a1+a2+a3+a4+a5+a6;
	    System.out.println(sum);
	   
	   
	}

}
