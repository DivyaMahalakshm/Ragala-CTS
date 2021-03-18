import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Divya");
		list.add("Maha");
		list.add("Pinky");
		list.add("Sandya");
		String []array=new String[list.size()];
		list.toArray(array);
		System.out.println("-------Converted Array values from ArraylIST are-----");
		for(String key:array)
		{

		    System.out.println(key);
		}
		
		
		

	}

}
