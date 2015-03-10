package com.secure.info;

import java.util.Enumeration;
import java.util.Hashtable;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.beans.Encoder;
import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;


public class SaveUserInfo {
	
	public static void saveUserInfoPart1(Hashtable userInfoCol){
		System.out.println("Saving hashtable contents:");
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = null;
		try {
			docBuilder = docFactory.newDocumentBuilder();	
		} catch (ParserConfigurationException pce) {
    		pce.printStackTrace();
  	  }
		
		

		// root elements
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("entries");
		doc.appendChild(rootElement);


		for(int i=0;i<userInfoCol.size();i++){
	    	UserInfo userInfo1 = (UserInfo)userInfoCol.get(String.valueOf(i+1));
	    	System.out.println(userInfo1.id+" "+userInfo1.description);
	    	//displayHash(userInfoCol, out, name)	    	

	    	
	    	try {    		 
	     
	     
	    		// staff elements
	    		Element staff = doc.createElement("entry");
	    		rootElement.appendChild(staff);
	     
	    		// set attribute to staff element
	    		Attr attr = doc.createAttribute("id");
	    		attr.setValue(String.valueOf(userInfo1.id));
	    		staff.setAttributeNode(attr);
	     
	    		// shorten way
	    		// staff.setAttribute("id", "1");
	    		
	    		// id elements
	    		Element id = doc.createElement("id");
	    		id.appendChild(doc.createTextNode(String.valueOf(userInfo1.id)));
	    		staff.appendChild(id);
	     
	    		// description elements
	    		Element description = doc.createElement("description");
	    		description.appendChild(doc.createTextNode(userInfo1.description));
	    		staff.appendChild(description);
	     
	    		// url elements
	    		Element url = doc.createElement("url");
	    		url.appendChild(doc.createTextNode(userInfo1.url));
	    		staff.appendChild(url);
	     
	    		// username elements
	    		Element username = doc.createElement("father");
	    		username.appendChild(doc.createTextNode(userInfo1.username));
	    		staff.appendChild(username);
	     
	    		
	    		
	    		// note elements
	    		Element note = doc.createElement("note");
	    		note.appendChild(doc.createTextNode(userInfo1.note));
	    		staff.appendChild(note);
	     
	     
	    	  }  catch (Exception pce) {
	    		pce.printStackTrace();
	    	  } 
	    	  
	    	}
	    
	    try {
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("D:\\fileType1EncodePart1.xml"));
	 
			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);
	 
			transformer.transform(source, result);
	 
			System.out.println("File saved!");

			
		} catch (TransformerException tfe) {
    		tfe.printStackTrace();
  	  }


	    
	}
	
	public static void saveUserInfoPart2(Hashtable userInfoCol){
		System.out.println("Saving hashtable contents:");
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = null;
		try {
			docBuilder = docFactory.newDocumentBuilder();	
		} catch (ParserConfigurationException pce) {
    		pce.printStackTrace();
  	  }
		
		

		// root elements
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("entries");
		doc.appendChild(rootElement);


	    for(int i=0;i<userInfoCol.size();i++){
	    	UserInfo userInfo1 = (UserInfo)userInfoCol.get(String.valueOf(i+1));
	    	System.out.println(userInfo1.id+" "+userInfo1.description);
	    	//displayHash(userInfoCol, out, name)	    	

	    	
	    	try {    		 
	     
	     
	    		// staff elements
	    		Element staff = doc.createElement("entry");
	    		rootElement.appendChild(staff);
	     
	    		// set attribute to staff element
	    		Attr attr = doc.createAttribute("id");
	    		attr.setValue(String.valueOf(userInfo1.id));
	    		staff.setAttributeNode(attr);
	     
	    		// shorten way
	    		// staff.setAttribute("id", "1");
	    		
	    		// id elements
	    		Element id = doc.createElement("id");
	    		id.appendChild(doc.createTextNode(String.valueOf(userInfo1.id)));
	    		staff.appendChild(id);
	     
	    		// description elements
	    		Element description = doc.createElement("description");
	    		description.appendChild(doc.createTextNode(userInfo1.description));
	    		staff.appendChild(description);
	     
	    		// url elements
	    		Element url = doc.createElement("url");
	    		url.appendChild(doc.createTextNode(userInfo1.url));
	    		staff.appendChild(url);	     
	    			     
	    		// password elements
	    		Element pwd = doc.createElement("mother");
	    		
	    		//encode password
	    		String password = userInfo1.password;
	    		password = encodeSource(password,1);
	    		pwd.appendChild(doc.createTextNode(password));
	    		staff.appendChild(pwd);
	    		
	    		// note elements
	    		Element note = doc.createElement("note");
	    		note.appendChild(doc.createTextNode(userInfo1.note));
	    		staff.appendChild(note);
	     
	     
	    	  }  catch (Exception pce) {
	    		pce.printStackTrace();
	    	  } 
	    	  
	    	}
	    
	    try {
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("D:\\fileType1EncodePart1.xml"));
	 
			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);
	 
			transformer.transform(source, result);
	 
			System.out.println("File saved!");

			
		} catch (TransformerException tfe) {
    		tfe.printStackTrace();
  	  }


	    
	}

	
	public  void write(UserInfo f, String filename) throws Exception{
        XMLEncoder encoder =
           new XMLEncoder(
              new BufferedOutputStream(
                new FileOutputStream(filename)));
        encoder.writeObject(f);
        encoder.close();
    }

    public  UserInfo read(String filename) throws Exception {
        XMLDecoder decoder =
            new XMLDecoder(new BufferedInputStream(
                new FileInputStream(filename)));
        UserInfo o = (UserInfo)decoder.readObject();
        decoder.close();
        return o;
    }
    
    public void displayHash(Hashtable Rlist, PrintWriter out,String name){   
        Enumeration ekeys   = Rlist.keys();   
        out.println( name );   
        out.println("<BR>");   
        while(ekeys.hasMoreElements()){   
      String key = (String)ekeys.nextElement();   
      Object value = Rlist.get(key.toString());   
      if (value instanceof Hashtable){   
             out.println("<BR>");   
             displayHash((Hashtable)value,out,key);   
      }else{   
            out.println(key);     
            out.println("");   
            out.println((String)value);   
            out.println("<BR>");   
            out.println( key);   
      }   
          out.println("</" + name + ">");   
   } 
       
  
        
        
}  
    
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

    public static int getNextnumber(int source){
    	return source+1;
    }
    
    public static char getPreviouschar(char source){
    	return (char) ((char)source-1);
    }

    public static int getPreviousnumber(int source){
    	return source-1;
    }
    
    public static void main(String args[]){
    	String source = "cfg:f8ed";
    	System.out.println("source is :"+SaveUserInfo.decodeSource(source,1));
    }

}
