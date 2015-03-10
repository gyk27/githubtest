/**
 * 
 */
package com.test;

/**
 * @author India
 *
 */
public class SampleClass {

	/**
	 * 
	 */
	public SampleClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static int calSalaray(int basic ,String type){
		int salaray;
		int bonus;
		if(type.equals("M")){
			System.out.println("CCP 100");
			bonus = 1000;
			salaray = basic+bonus;
		}else if(type.equals("AM")){
			System.out.println("CCP 200");
			bonus = 500;
			salaray = basic+bonus;
		}else if(type.equals("TL")){
			System.out.println("CCP 300");
			bonus = 250;
			salaray = basic+bonus;
		}else{
			System.out.println("CCP 400");
			bonus = 100;
			salaray = basic+bonus;
		}		
		return salaray;	
		
	}
	
	public static void testFinally(){
		try {
			String name = "";
		    String i = name.substring(3);
		    System.out.println("value of i is "+i);
		} catch (Exception e) {
			System.out.println("Null pointer exception occured");
			//System.exit(1);
			System.out.println("Last line");			
		}
		
		finally{
			System.out.println("Inside finally block");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub"Hello world"
		//System.out.println("Hello world");
		//int salary =calSalaray(7000,"AM");
		//System.out.println(salary);
		testFinally();
	}

}
