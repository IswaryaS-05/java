package training;

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int temp = 0;
        int sum = 0;

      do {
          temp = num1 + num2;
          num1 = num2;
          num2 = temp;
          if (num2 % 2 == 0) {
              sum = sum + num2;
          }
       
      } while (num2 < 4000000);

      System.out.println(sum);
      }
}