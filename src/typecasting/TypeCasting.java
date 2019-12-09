/*Malika Sharma
 *Type Casting Program
 *06/12/2019
 *
 */

package typecasting;

import java.util.Scanner;

/**
 *
 * @author masha2470
 */
public class TypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner keyedInput = new Scanner(System.in);
    Scanner reader = new Scanner(System.in); 
    
       int number; 
       double number1;  
       char singleChar; 
        
        
       System.out.println("Enter a whole number and it will be stored as an integer");
       number = keyedInput.nextInt(); 
       double aDouble;
       aDouble = (double)number;
       System.out.println("The number as a double is" + aDouble);
       
       System.out.println("Enter a decimal number and it will be stored as a double");
       number1 = keyedInput.nextDouble();
       number1 = (int)aDouble; 
       System.out.println("The number as a integer is" + number1 ); 
       
       System.out.println("Enter a single character and it will be stored as a char");
       singleChar = reader.next(".").charAt(0);
       String aString;
       aString = String.valueOf(singleChar);
       System.out.println("" + aString);
       
       System.out.println("Enter a char and it will be stored as a string");
       Scanner user_input = new Scanner( System.in );
       singleChar = reader.next(".").charAt(0);   
      char aChar;
      aChar = aString.charAt(0);
      String first_name;  
      System.out.println(" String into an integer " +aChar); 
     
      System.out.println("Enter a decimal number and it will be stored as a string");
     first_name = user_input.next( ); 
     aString = first_name; 
     int anDouble;
     anDouble = Integer.parseInt(aString);
     System.out.println("String into a Double " + anDouble);
}
} 