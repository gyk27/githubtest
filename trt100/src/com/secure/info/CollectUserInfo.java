package com.secure.info;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;

public class CollectUserInfo {
	
	static Hashtable userInfoCol = new Hashtable();
	
	public static void main(String args[]){	
		
		String  entryOpen = "Y";
		String currentInput = "";
		
		Scanner in = new Scanner(System.in);
		
		UserInfo userInfo = null;
		int id = 0; 
			
		while(entryOpen.equals("Y")){
		    			
			userInfo = new UserInfo();
			
			userInfo.id=id+1;
		    
			System.out.println("Enter description:");
			userInfo.description = in.nextLine();

			System.out.println("Enter url:");
			userInfo.url = in.nextLine();
			

			System.out.println("Enter username:");
			userInfo.username = in.nextLine();
			
			System.out.println("Enter password:");
			userInfo.password = in.nextLine();

			System.out.println("Enter note:");
			userInfo.note = in.nextLine();
		    
			System.out.println("Do you want to enter one more info Y or N?");
			currentInput = in.nextLine();
			
			if(currentInput.equals("Y")){
				entryOpen="Y";
			}else if (currentInput.equals("N")){
				entryOpen="N";
			}

			userInfoCol.put(String.valueOf(id+1),userInfo);
			
			id++;
		}
		
		System.out.println("Displaying hashtable contents:");
	    for(int i=0;i<userInfoCol.size();i++){
	    	UserInfo userInfo1 = (UserInfo)userInfoCol.get(String.valueOf(i+1));
	    	System.out.println(userInfo1.id+" "+userInfo1.description);	    	
	    }
	    
	    //saveUserInfo
	    SaveUserInfo.saveUserInfoPart1(userInfoCol);
	    SaveUserInfo.saveUserInfoPart2(userInfoCol);
	    
	    
	}

}
