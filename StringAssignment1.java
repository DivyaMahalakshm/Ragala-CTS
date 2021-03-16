
public class StringAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello My dear Friends";
		String array[]=str.split(" ");
		for(int i=0;i<array.length;i++)
		{
			System.out.println("The original string is  " +array[i]);
		}
		System.out.println("  ");
		for(int j=array.length-1;j>=0;j--)
		{
			System.out.println("The reverse string is  " +array[j]);
		}

	}

}
