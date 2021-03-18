import java.util.Scanner;
public class CheckPowerOfTwo {
	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter a Number to check it is a Power of Two or Not");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		boolean result=checkNumber(n);
		if(result)
		{
			System.out.println(n+ " is a Power of Two");
			
		}
		else
		{
		System.out.println( n+ " is a  Not Power of Two");
		}
		
	}
	public static boolean checkNumber(int num)
	{
		return (num>0)&& ((num & (num-1))==0);
	}

}
