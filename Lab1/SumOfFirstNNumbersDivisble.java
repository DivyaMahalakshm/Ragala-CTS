import java.util.Scanner;
public class SumOfFirstNNumbersDivisble {

	public static void main(String[] args) {


		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values upto which u want to calculate the sum");
		num=sc.nextInt();
		int total=calculateSum(num);
		System.out.println("Sum of first  N Natural numbers divisible by 3 or 5 are: " +total );
		
	}
	public static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			
			if((n%3==0)||(n%5==0))
			      {
				        sum=sum+i;
					}
	
		}
		return sum;
	}

}
