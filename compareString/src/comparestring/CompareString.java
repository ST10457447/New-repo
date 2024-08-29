 
package comparestring;

import java.util.Scanner;

 
public class CompareString {

    
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        
        System.out.println("Enter a string to check for a digit: ");
        String word= obj.nextLine();
        
        //call a method that validates a string for a digit
        CheckForDigit check = new CheckForDigit();
        
        System.out.println("String has a digit? "+ check.DigitMethod(word));
        
    }//end of main method
    public static class CheckForDigit
        {
            //example
            //input=junior12
         public boolean DigitMethod(String input){
               for(int i = 0; i < input.length(); i++)
               {
               if(Character.isDigit(input.charAt(i))) {
                   return true;
               }   //end of if statement
             }//end of for loop
                  return false; 
           } //end of digit method
        }//end of CheckForDigitClass
}
 