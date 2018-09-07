/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  MyFileCopier.java
 *  Purpose       :  Provides a class to copy any given text file.
 *  Author        :  Talia Bahar
 *  Date          :  2018-09-5
 *  Description   :  This program will prompt the user to enter a file name. Then it will
                     use the SourceFile class to read the given file and the TargetFile class
                     to rewrite the file as a new file.
 *  Notes         :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import copiersupport.SourceFile;
import copiersupport.TargetFile;
import java.util.Scanner;

public class MyFileCopier {
  public static void main(String args[]) {
    System.out.println("What file would you like to copy?");
    Scanner userInput = new Scanner( System.in );
    String fileName = userInput.nextLine();
    SourceFile sf = new SourceFile(fileName);
    String content = sf.getContent();
    TargetFile tf = new TargetFile(content, fileName + ".copy");
  }
}
