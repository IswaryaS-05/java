package training;

public class Square {
	public static void main(String[] args) {
		int sum=0,sumOfSquare=0,difference=0,squareOfSum=0;
		for(int i=1;i<=100;i++)
		{
			sum=sum+i;               //1+2+3+...+100
			sumOfSquare += (i * i);  //1+4+9
			squareOfSum =sum*sum;    
		}
		difference=squareOfSum - sumOfSquare;
		System.out.println(difference);
		
		
		
	}

}


