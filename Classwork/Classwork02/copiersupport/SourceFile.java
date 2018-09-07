/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  SourceFile.java
 *  Purpose       :  To read a given text file.
 *  Author        :  Talia Bahar
 *  Date          :  2018-09-5
 *  Description   :  Uses BufferedReader to read the given text file and produce a copy of it.
                     Also incudes a method to get the content read by the reader.
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
package copiersupport;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SourceFile {
  private String fileCopy;

  public SourceFile(String uploadedFile){
    try {
      BufferedReader br = new BufferedReader(new FileReader(uploadedFile));
      fileCopy = br.readLine();
    }
    catch (IOException ioe) {
    }
  }

  public String getContent() {
    return fileCopy;
  }
}
