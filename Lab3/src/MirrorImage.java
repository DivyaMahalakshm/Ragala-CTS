import java.util.Scanner;
public class MirrorImage {
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		getImage(str);
		

	}
	public static void getImage(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		System.out.println("Mirror image is");
		System.out.println(sb+"|"+sb.reverse());
		
	}
	

}
