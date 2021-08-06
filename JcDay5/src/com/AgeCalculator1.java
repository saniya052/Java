package com;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.lang.*;


public class AgeCalculator1 {
	
    static String calulateAge(String date1,int currentYear){
    	
       String lastFourDigits = date1.substring( date1.length() - 4);
	   //System.out.println(lastFourDigits);
	   int BirthYear = Integer.parseInt(lastFourDigits); 
	   int age=currentYear-BirthYear;
	   String s=Integer.toString(age);

	  return s;
	   
   }
   
   
public static boolean isValidFormat(String format, String value) {
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            date = sdf.parse(value);
            if (!value.equals(sdf.format(date))) {
                date = null;
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return date != null;
    }


public static void main(String[] args){

   /* Date date1=null;
    Scanner input = new Scanner(System.in);
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("Enter check-in date (gg/aa/yy):");
    String cinput = input.nextLine();
    if(null != cinput && cinput.trim().length() > 0){
         date1 = format.parse(cinput);
    }
    
    String Birthdate = date1.toString();*/
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the birth date dd/MM/yyyy:");
	String Birthdate=sc.nextLine();
	
	try {
            
	       if(!isValidFormat("dd/MM/yyyy",Birthdate)) {
	    	   throw new DateException();
	       }
       
	     }
	     catch (DateException exception) {
		          exception.printStackTrace();
		         // System.out.println(exception.getMessage());
	        }
   
	     Date d=new Date(); 
         @SuppressWarnings("deprecation")
		 int year=d.getYear();  
         int currentYear=year+1900; 

         String ans= calulateAge(Birthdate,currentYear);
         System.out.println(ans);     
   }
}

