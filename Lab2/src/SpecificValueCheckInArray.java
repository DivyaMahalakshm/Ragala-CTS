import java.util.Arrays;
public class SpecificValueCheckInArray {

	public static void main(String[] args) {
		
		int array[]= {55,45,73,24,85,88,100,65,87,54};
		int find=24;
		boolean check=false;
		for(int element:array)
		{
			if(element==find)
			{
				check=true;
				break;
			}
		}
		if(check)
		{
			System.out.println(find+ " is there");
		}
		else
		{
			System.out.println(find+ "Not found");
		}
			

	}

}
