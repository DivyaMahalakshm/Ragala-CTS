import java.util.Scanner;
import java.util.Arrays;
public class SecondSmallestElementInArray 
   {

	public static void main(String[] args) 
	 {
		System.out.println("Enter  number of elements u want to enter into an array");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		System.out.println("Enter Elements into an array");
		int array[]=new int[num];
		    for(int i=0;i<num;i++)
		     {
			    array[i]=sc.nextInt();
		     }
		
		int Sortedarray[]=SecondSmallestElementInArray.getSecondSmallest(array);
		System.out.println("----------Sorted array is-----------");
		System.out.println(Arrays.toString(Sortedarray));
		SecondSmallestElementInArray.displayoutput(Sortedarray);
		

	}
	public static int[] getSecondSmallest(int array[])
	{
		int inputarray[]=array;
		System.out.println("Input array is ");
		System.out.println(Arrays.toString(inputarray));
		int temp=0;
		for(int i=0;i<inputarray.length;i++) 
		{
			for(int j=0;j<inputarray.length;j++)
					{
				       if(array[i]>array[j])
				       {
				          temp=array[i];
				           array[i]=array[j];
				           array[j]=temp;
				       }
					}
		}
		return inputarray;
	
	}
	public static void displayoutput(int Sortedarray[])
	{
		System.out.println("Smallest Element in the Array is " +Sortedarray[Sortedarray.length-1]);
		System.out.println(" Second Smallest Element in the Array is " +Sortedarray[Sortedarray.length-2]);
		
	}
    
}
