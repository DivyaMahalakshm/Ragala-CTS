import java.util.Scanner;
public class StringSortingInArray {

	public static void main(String[] args) {
		System.out.println("Enter astring");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] array=str.split(" ");
		int length=array.length;
		Sorting(array);
		for(int i=0;i<length;i++)
		{
			System.out.println("String in sorting order is " +array[i]);
		}
		
		

	}
	static void Sorting(String array[])
	{ 
		int len=array.length;
		for(int i=1;i<len;i++)
		{
			
          String word=array[i];
          int j=i-1;
            while(j>=0 && word.length()>array[j].length())
               {
        	
            	array[j+1]=array[j];
            	j--;
               }
            array[j+1]=word;
		}
		
	}

}
