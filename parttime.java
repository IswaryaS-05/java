package training;
import java.util.Scanner;
public class parttime {
	   public static void main(String[] args) {
		   int sal,weekday=0,weekend=0,temp;
		   Scanner sc = new Scanner(System.in);	
	       sal = sc.nextInt();
	      
	      int temp1= sal-800;
	      int temp2 = temp1/130;
	      System.out.println(temp2);
	      weekday = 10+ temp2;
	      System.out.println(weekday);
	      
	   
	    		 
	   }
}
