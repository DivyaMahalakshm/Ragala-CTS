import java.util.*;
public class StringTokenizerDemo {

	public static void main(String[] args)
	{   
		int convert;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integers with gap");
		String  input =sc.nextLine();
		StringTokenizer st=new StringTokenizer(input," ");
		while(st.hasMoreTokens())
		{
			String temp=st.nextToken();
			convert=Integer.parseInt(temp);
			System.out.println(convert);
			sum=sum+convert;
			
		}
		System.out.println("Sum of integers is: " +sum);

	}

}
