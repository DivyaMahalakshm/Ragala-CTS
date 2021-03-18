import java.util.Arrays;
import java.util.Scanner;
public class StringSortingAlphabetical {

	public static void main(String[] args) {
		System.out.println("Enter the Number of String Names u want to sort");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		String strarr[]=new String[n];
		System.out.println("Enter the String Names");
		Scanner inpstr=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
		strarr[i]=inpstr.nextLine();
		}
	    String Sorted=StringSortingAlphabetical.sortStrings(strarr);
		System.out.println("----------Sorted String  is-----------");
		System.out.println(Sorted);
		
	
		

	}
	public static String sortStrings(String arr[]) 
	{
		String inputarray[]=arr;
		System.out.println("Input String  is ");
		System.out.println(Arrays.toString(inputarray));
		String temp="";
		for(int i=0;i<inputarray.length;i++) 
		{
			for(int j=i+1;j<inputarray.length;j++)
					{
				       if(arr[i].compareTo(arr[j])>0)
				       {
				          temp=arr[i];
				           arr[i]=arr[j];
				           arr[j]=temp;
				       }
					}
		}
		return Arrays.toString(inputarray);
	
	}

}
