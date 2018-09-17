/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  HighArray.java
 *  Purpose       :
 *  Author        :  Talia Bahar
 *  Date          :  2018-09-10
 *  Description   :
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import java.util.Arrays;

public class HighArray {
  private long[] a; // ref to array a
  private int nElems; // number of data items

  public HighArray(int max) {    //constructor
    a = new long[max]; nElems = 0;  //creates the array ~ no items yet
  }

  /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Method to check if denominations are negative.
  * @param searchKey  int[] of the denominations
  * @return
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  // public boolean find(long searchKey) {
  //   int j;
  //   Boolean b = true;
  //   for(j=0; j<nElems; j++) {
  //     if(a[j] == searchKey) {
  //       break;
  //     }
  //     if(j == nElems) {
  //       b = false;
  //     } else {
  //       b = true;
  //     }
  //   }
  //   return b;
  // }

  public boolean find(long searchKey) {
    int j;
    for(j=0; j<nElems; j++) {
      if(a[j] == searchKey) {
        break;
      }
    }
    if(j == nElems) { //WHY DOES THIS WORK WHEN ITS OUT OF THE FOR LOOP?
      return false;
    } else {
      return true;
    }
  }
  /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Method to insert number into array.
  * @param value  represents long user wants to insert
  * @return
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  public void insert(long value) {
    a[nElems] = value;
    nElems++;
  }

  /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Method to delete number from array.
  * @param value  represents long user wants to delete
  * @return
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  public boolean delete(long value){
    int j;
    Boolean b = true;
    for(j=0; j<nElems; j++){
      if(value == a[j]){
        break;
      }
    }
      if(j==nElems){
        b = false;
      } else {
        for (int k=j; k<nElems; k++) { //tab?
          a[k] = a[k+1];
          b = true;
        }
        nElems--;
      }
    return b;
  }

/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* Method to find largest value in array.
* @return highest key in array or -1 if the array is empty
*  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public long getMax() {
  long tempMax = -1;
  if ( a.length == 0){
    return tempMax;
  } else {
    for (int i=0; i < nElems; i++) {
      if(tempMax < a[i]) {
        tempMax = a[i];
      }
    }
  }
  return tempMax;
}

// Then remove all the nulls.
// Of course, the array size must be reduced correctly.
/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* Method to remove all duplicates from array.
* @return array without duplicate values
*  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  // public void noDupes() {
  //   Arrays.sort(a);
  //   long compareValue = a[0];
  //   for(int i=1; i < nElems; i++) {
  //     if(compareValue == i) {
  //       delete((long) i);
  //     } else {
  //       compareValue = i;
  //     }
  //   }
  // }

  // public void noDupes() {
  //   for(int i=0; i < nElems; i++) {
  //     for(int j=i+1; i < nElems; j++) {
  //       if(a[i] == a[j]) {
  //         delete((long) j);
  //         nElems--;
  //         j--;
  //       }
  //     }
  //   }
  // }

  /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Method to display array contents.
  * @return
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  public void display(){
    for(int j=0; j<nElems; j++) {
      System.out.print(a[j] + " ");
      System.out.print("");
    }
  }
}
