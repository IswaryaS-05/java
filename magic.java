package training;
import java.util.Scanner;
public class magic {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of people who watched show 1:");
		int shows1=scanner.nextInt();
		System.out.println("Enter the average rating of show 1:");
		float ratings1=scanner.nextFloat();
		System.out.println("Enter the number of people who watched show 2:");
		int shows2=scanner.nextInt();
		System.out.println("Enter the average rating of show 2:");
		float ratings2=scanner.nextFloat();
		System.out.println("Enter the number of people who watched show 3:");
		int shows3=scanner.nextInt();
		System.out.println("Enter the average rating of show 3:");
		float ratings3=scanner.nextFloat();
		float overallshows1=(shows1/100)*(ratings1/10);
		float overallshows2=(shows2/100)*(ratings2/10);
		float overallshows3=(shows3/100)*(ratings3/10);
		float overall=overallshows1+overallshows2+overallshows3;
		System.out.println("The overall average rating of the show is : "+overall);
}
}