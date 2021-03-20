import java.util.Scanner;
public class CheckPositiveStringOrNot 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String str=sc.nextLine();
		checkPositiveString(str);
		
		
	}	


	public static void checkPositiveString(String s)
	{ 
		
		 char[] ch = new char[s.length()];
		 for(int i=0;i<s.length();i++)
		 {
			 ch[i]=s.charAt(i);
		 }
		 for (int i = 0; i < s.length()-1; i++)
		 { 
			 
			 if(ch[i]<ch[i+1])
			 {
				 //String str = Character.toString(s.charAt(i));
				 System.out.println("Positive string");
			 }
	
			 
			 else
			 {
				 System.out.println("Not a Positive string"); 
			 }
		 }
		 
		 
	}

}
