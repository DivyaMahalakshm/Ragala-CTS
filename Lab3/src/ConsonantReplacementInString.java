import java.util.Scanner;

public class ConsonantReplacementInString {
	
	 public static void main(String[] args) 
	    { 
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter a string");
	        String str1=sc.next();
	        System.out.println("The String U Entered is : "+str1);
	        System.out.println("Replaced Consonant String is : "+replaceConsonants(str1.toCharArray()));
	    } 

	  	    static boolean isVowel(char c) 
	    { 
	        if (c != 'a' && c != 'e' && c != 'i'
	                && c != 'o' && c != 'u')  
	        { 
	            return false; 
	        } 
	        return true; 
	    } 
	  
	  
	    static String replaceConsonants(char[] arr)  
	    { 
	    
	        for (int i = 0; i < arr.length; i++) 
	        { 
	            if (!isVowel(arr[i])) 
	            { 
	   
	                if (arr[i] == 'z')  
	                { 
	                    arr[i] = 'a'; 
	                } 
	                 
	                else
	                { 
	  
	                    
	                    arr[i] = (char) (arr[i]+1); 
	  
	                   
	                    if (isVowel(arr[i]))  
	                    { 
	                        arr[i] =(char)(arr[i]+1); 
	                    } 
	                } 
	            } 
	        } 
	        return String.valueOf(arr); 
	    } 
	  
	   
	}  

