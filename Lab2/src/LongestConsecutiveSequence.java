import java.util.HashSet;

public class LongestConsecutiveSequence {

	public static void main(String[] args)
	{
		int inputarray[]= {49,1,3,200,2,4,70,5};
		  int result=longestConsecutiveSequence(inputarray);
		  System.out.println("Longest Consecutive Sequence is : " +result);

	}
	public static int longestConsecutiveSequence(int arr[])
	{
		HashSet<Integer> set=new HashSet<>();
		for(int key:arr) set.add(key);
		int result=0;
		for(int key:arr)
		{
			int count=1;
			
			int down=key-1;
			while(set.contains(down)) 
			{
				
				set.remove(down);
               down--;
               count++;
			}
			int up=key+1;
			while(set.contains(up)) 
			{
				
				set.remove(up);
               up++;
               count++;
			}
			result=Math.max(result,count);
		}
		return result;
	}
	

}
