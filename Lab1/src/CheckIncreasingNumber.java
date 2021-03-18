import java.util.Scanner;
public class CheckIncreasingNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number to check whether it is an increasing number or not");
		int num;
		Scanner sc =new Scanner(System.in);
		num=sc.nextInt();
		boolean increasingnum=checkNumber(num);
		System.out.println( increasingnum+ " is an increasing number");

	}
	public static boolean checkNumber(int n)
	{
		boolean increasing=false;
		while(n>0)
		{
			int lastdigit= n%10;
			n=n/10;
			int nextlastdigit=n/10;
			if(nextlastdigit<=lastdigit)
			{
			  increasing=true;
			}
			else
			{
				increasing=false;
			}
		
		}
		return increasing;
	}

}
