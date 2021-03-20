
import java.util.Scanner;

public class PrintDurationOfDaysMonthsYears {

	public static void main(String[] args){
		@SuppressWarnings({"resource"})
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date");
		String str1=sc.next();
		
		String str[]=str1.split("/");
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		
		}
		String date=String.valueOf(java.time.LocalDate.now());
		String str2[]=date.split("-");
		for(int i=0;i<str2.length;i++)
		{
			System.out.println(str2[i]);
		}
		int str3[]=new int[3];
		for(int i=0;i<str2.length;i++)
		{
			str3[i]=Integer.parseInt(str[i])-Integer.parseInt(str2[i]);
			System.out.println(Math.abs(str3[i]));
		}
		
		
	}
	
}

		
	   