import java.util.Scanner;
import java.util.Arrays;
public class PrintPosNegZeroOddEvenNumber {

	public static void main(String[] args) {
		int zerocount=0,positivecount=0,negativecount=0,oddcount=0,evencount=0;
		System.out.println("Enter number of Elements u want to Enter into an array");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Enter input values into array");
		int array[]=new int[num];
		for(int i=0;i<num;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("------The elements u Entered are------ ");
		for(int i=0;i<num;i++)
		{
			System.out.println(array[i]);
		}
		for(int i=0;i<num;i++)
		{
		    if(array[i]==0)
		     {
			   zerocount++;
		     }
		   else if(array[i]>0 && array[i]%2==0 )
		    {
			  positivecount++;
			  evencount++;
		    }
		  else if(array[i]<=0)
		    {
			  negativecount++;
		    }
		 else if (array[i]%2!=0)
		   {
			  oddcount++;
		   }
		
		
	 }
		System.out.println("Number of Zeros presnt in an array are" +zerocount);
		System.out.println("Number of Positive Numbers presnt in an array are" +positivecount);
		System.out.println("Number of Negative Numbers presnt in an array are" +negativecount);
		System.out.println("Number of Odd Numbers presnt in an array are" +oddcount);
		System.out.println("Number of Even Numbers presnt in an array are" +evencount);



		


	}

}
