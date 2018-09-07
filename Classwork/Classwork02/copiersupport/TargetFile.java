/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  TargetFile.java
 *  Purpose       :  To rewrite a given text file.
 *  Author        :  Talia Bahar
 *  Date          :  2018-09-5
 *  Description   :  Uses BufferedWriter to produce a copy of the uploaded text file content.
 *  Notes         :  Nico helped me implement BufferedWriter.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
package copiersupport;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TargetFile {
  public TargetFile(String uploadedFileContents, String newFile){
    try{
      BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
      bw.write(uploadedFileContents);
    }
    catch (IOException ioe) {
    }
  }
}
