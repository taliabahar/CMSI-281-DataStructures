/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  SinglyLinkedCircularListTester.java
 *  Purpose       :  A test harness file for testing out the methods in the "SinglyLinkedCircularList.java" class.
 *  Author        :  Talia Bahar, Maya Pegler-Gordon
 *  Date          :  2018-10-14
 *  Description   :  Provides several tests to check all methods from "SinglyLinkedCircularList.java" are working correctly.
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class SinglyLinkedCircularListTester {
  public static void main(String[] args) {
    SinglyLinkedCircularList myCircularList = new SinglyLinkedCircularList();
    myCircularList.insert(5);
    myCircularList.insert(6);
    myCircularList.insert(7);
    myCircularList.insert(8);
    myCircularList.insert(9);
    myCircularList.insert(10);
    SinglyLinkedCircularList.Iterator myIt = myCircularList.getIteratorAt( 0 );
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );
    myIt.next();
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );
    myIt.next();
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );
    myIt.next();
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );
    myIt.next();
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );
    myIt.next();
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );
    myIt.next();
    System.out.println("Displaying Circular List");
    System.out.println(myCircularList.display());
    System.out.println(" ");
    myCircularList.delete();
    myCircularList.delete();
    myCircularList.delete();
    System.out.println(" ");
    System.out.println("Displaying Circular List after deleting 10,9,8:");
    System.out.println(myCircularList.display());
  }
}
