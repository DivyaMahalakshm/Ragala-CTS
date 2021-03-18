import java.util.Scanner;
public class DuplicateFindingInArray {

	public static void main(String[] args) {


		String array[]= {"Car", "Bike" ,"Cycle", "Phone","Laptop","Computer","Phone","Laptop","Car","Headset"};
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i].equals(array[j]))
				{
					System.out.println("Duplicate products are :" +array[i]);
				}
			}
		}
		

	}

}
