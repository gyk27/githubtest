package com.secure.info;

import java.util.Scanner;

public class EncryptORDecrypt {

	public static String encodeSource(String source,int encodeType){
    	StringBuffer result = new StringBuffer();
    	if(encodeType==1){
    	 	   for (int i = 0; i < source.length(); i++) {
    	 		   char c = source.charAt(i);
    	 		   result.append(getNextchar(c));
    		   }
       }
 	   return result.toString();
    }

    public static String decodeSource(String source,int decodeType){
       StringBuffer result = new StringBuffer();
       if(decodeType == 1){
     	   for (int i = 0; i < source.length(); i++) {
      		   char c = source.charAt(i);
      		   result.append(getPreviouschar(c));
     	   }
       }
   	   return result.toString();
     }

    public static char getNextchar(char source){
    	return (char) ((char)source+1);
    }

    public static char getNextcharTwo(char source){
	    	return (char) ((char)source+2);
    }

    public static char getNextcharThree(char source){
		    	return (char) ((char)source+3);
    }

    public static char getNextcharFour(char source){
			    	return (char) ((char)source+4);
    }


    public static char getPreviouschar(char source){
    	return (char) ((char)source-1);
    }

   public static char getPreviouschar(char source){
		    	return (char) ((char)source-2);
    }


    public static void main(String args[]){
    	System.out.println("Inside main");
    	Scanner in = new Scanner(System.in);
       	System.out.println("Do you want to encrypt or Decrypt ? E or D?");
		String input  = in.nextLine();
		if(input.equals("E")){
	    	System.out.println("Enter string to encrypt:");
			String sourceencrypt = in.nextLine();
			System.out.println("source is :"+SaveUserInfo.encodeSource(sourceencrypt,1));
		}else if(input.equals("D")){
	    	System.out.println("Enter string to decrypt:");
			String sourcedecrypt = in.nextLine();
			System.out.println("source is :"+SaveUserInfo.decodeSource(sourcedecrypt,1));
		}else{
			System.out.println("Please enter correct input");
		}
    }


}