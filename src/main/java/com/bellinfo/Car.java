package com.bellinfo;

public class Car {
	
   private String carname; 	
	
   Car(){
	   System.out.println("inside car...");
   }
   
   Car(String carname){
	   System.out.println("car name: "+ carname );
   }
   
   Car(int year){
	   System.out.println("car model: "+ year );
   }
   
   Car(String carname, int year, String engine){
	   System.out.println("car name: "+carname+" year "+ year +" engine "+engine);
   }
   
   public void display(){
	   System.out.println("inside method");
   }
}
