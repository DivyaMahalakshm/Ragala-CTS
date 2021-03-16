import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n, fib1 = 0, fib2= 0, fib3= 1;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter value of n:");
	        n = s.nextInt();
	        System.out.print("Fibonacci Series:");
	        for(int i = 1; i <= n; i++)
	        {
	            fib1 = fib2;
	            fib2 = fib3;
	            fib3= fib1+fib2;
	            System.out.print(fib1+" ");
	        }

	}

}
