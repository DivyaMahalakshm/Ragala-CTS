import java.util.Scanner;

public class FormNumberUsingConsecutiveDigits {
   
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		System.out.println("Entered number is:"+num);
		String str=Integer.toString(num);
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length()-1;i++)
		{
			char ch1=str.charAt(i);
			char ch2=str.charAt(i+1);
			int value=getDifference(ch1,ch2);
			sb.append(value);
		}
		sb.append(Integer.parseInt(String.valueOf(str.charAt(str.length()-1))));
         System.out.println(sb);
	}
	   public static int getDifference(char c1,char c2)
	     {
		   int conv1=Integer.parseInt(String.valueOf(c1));
		   int conv2=Integer.parseInt(String.valueOf(c2));
		   System.out.println(conv1);
		   return Math.abs(conv1-conv2);
			
		
	    }

}
