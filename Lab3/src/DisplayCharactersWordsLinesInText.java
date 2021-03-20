import java.util.*;
import java.io.*;
public class DisplayCharactersWordsLinesInText {

	 public static void main(String args[])throws IOException
	{
		
		   int nextline=1,nextword=0;           
           char character;
           Scanner scr=new Scanner(System.in);
           System.out.print("\nEnter File name: ");
           String str=scr.nextLine();
           FileInputStream f=new FileInputStream(str);
           int n=f.available();
           for(int i=0;i<n;i++)
           {
                       character=(char)f.read();
                       if(character=='\n')
                       nextline++;
                       else if(character==' ')
                                   nextword++;
                                                          
           }
           System.out.println("\nNumber of lines : "+nextline);
           System.out.println("\nNumber of words : "+(nextline+nextword));
           System.out.println("\nNumber of characters : "+n);
          

}
}
		

	
