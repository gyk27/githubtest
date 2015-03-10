package com.secure.info;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public class DisplayUserInfo {
	
	public static void displayUserInfo(){
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = null;
		try {
			docBuilder = docFactory.newDocumentBuilder();
		} catch (ParserConfigurationException pce) {
    		pce.printStackTrace();
  	    }
		File fileToRead1 = null;
		// root elements
		try {
			fileToRead1 = new File("D:\\fileType1EncodePart1.xml");
			System.out.println(fileToRead1.separatorChar); 
			System.out.println("check null for fileToRead1 "+fileToRead1);
			Document doc = docBuilder.parse(fileToRead1);
			System.out.println("check null for doc "+doc);
			//System.out.println("check null for doc "+doc.);
			//Element rootElement = doc.getElementById("100");
			//System.out.println("check null for rootElement... "+rootElement);
			NodeList nodeList1 = doc.getChildNodes();			
			for (int i = 0; i < nodeList1.getLength(); i++) {
				Node node = nodeList1.item(i);
				System.out.println(node.getLocalName());
				System.out.println(node.getNodeValue());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch(SAXException saxe){
			saxe.printStackTrace();
		}	
	}
	
	public static void main(String args[]){
		displayUserInfo();
	}

}
