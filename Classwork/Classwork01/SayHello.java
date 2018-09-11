/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  SayHello.java
 *  Purpose       :  To make sure Java and GitHub environemnt is working correctly. 
 *  Author        :  Talia Bahar
 *  Date          :  2018-08-30
 *  Description   :  Prompts user to input their name and then says Hello to them.
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import java.util.Scanner;

public class SayHello {
  public static void main( String[] args ) {
    System.out.println("Enter your name:");
    Scanner myInput = new Scanner( System.in );
    String inputName = myInput.nextLine();
    System.out.println( "Hello " + inputName + "!" );
  }
}
