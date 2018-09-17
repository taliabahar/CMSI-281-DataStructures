/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  HighArrayApp.java
 *  Purpose       :
 *  Author        :  Talia Bahar
 *  Date          :  2018-09-10
 *  Description   :
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 // Add some code in the main() method in the HighArrayApp.java to test this method.
 // You can assume all the keys are positive numbers. Add AT LEAST five new test cases,
 // which means you will need to add or remove values from the array between calls to getMax().

public class HighArrayApp{
  public static void main(String[] args) {
    int maxSize = 150;
    HighArray arr;
    arr = new HighArray(maxSize);
    System.out.println("Max of empty array: " +     arr.getMax());  // should return -1
    arr.insert(77);
    arr.insert(99);
    arr.insert(44);
    arr.insert(55);
    arr.insert(22);
    arr.insert(88);
    arr.insert(11);
    arr.insert(00);
    arr.insert(66);
    arr.insert(33);
    arr.display();
    int searchKey = 35;
    if( arr.find(searchKey) ) {
      System.out.println("Found " + searchKey);
    } else {
      System.out.println("Can’t find " + searchKey);
    }
    System.out.println("Initial Max: " +     arr.getMax()); //should return 99
    arr.insert(120);
    System.out.println("New Max: " +     arr.getMax());  // should return 120
    arr.delete(00);
    arr.delete(55);
    arr.delete(99);
    arr.display();
    System.out.println("");
    System.out.println("Adding Dupes");
    arr.insert(77);
    arr.insert(33);
    arr.display();
    System.out.println("");
    arr.noDupes();
    System.out.println("Removing Dupes");
    arr.display();
  }
}
