import java.util.Scanner;
public class DifferenceOfSumOfSquaresAndSquareOfSum {
	public static void main(String[] args)
	{
	

		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values upto which u want to calculate the sum");
		num=sc.nextInt();
		int difference=calculateSum(num);
		System.out.println("Difference b/w Sum of Squres and Square of their sum is  " +difference);
		
	}
	public static int calculateSum(int n)
	{
		int sum=0;
		int diff=0;
		for(int i=1;i<=n;i++)
		{
			
            int sumofsquares=sum+i*i;
            sum=sum+i;
            int squareofsum=sum*sum;
            diff=squareofsum-sumofsquares;
            
		}
		return diff;
	}

}
