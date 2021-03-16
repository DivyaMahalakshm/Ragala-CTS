import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) 
	{
int i, number, count; 
		
		System.out.println(" enter number upto which u want to calculate prime numbers");	
		Scanner sc = new Scanner(System.in);   
		 int choice= sc.nextInt();
		for(number = 1; number <=choice ; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }  
		}
	}
}

