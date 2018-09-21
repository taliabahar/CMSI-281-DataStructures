/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntLinkedListTester.java
 *  Purpose       :  A test harness file for testing out the methods from the "IntLinkedList.java" classes.
 *  Author        :  Talia Bahar
 *  Date          :  2018-09-20
 *  Description   :  This program contains multiple methods to allow one to create and edit a list of integers.
                     As well as to check for any invalid numbers thrown into the program.
                     Throws an exception if indexes are out of bounds.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class IntLinkedListTester {
    public static void main( String[] args ) {
      IntLinkedList myList = new IntLinkedList();
      myList.prepend( 23 );
      myList.prepend( 19 );
      myList.prepend( 17 );
      myList.prepend( 13 );
      myList.prepend( 11 );
      myList.prepend(  7 );
      myList.prepend(  5 );
      myList.prepend(  3 );
      myList.prepend(  2 );
      myList.removeAt( 2 );
      System.out.println("Inserting a 12 @ pos2");
      myList.insertAt( 2, 12);
      IntLinkedList.Iterator myIt = myList.getIteratorAt( 0 );
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 3
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 5
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
      myIt = myList.getIteratorAt( 3 );
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 11
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 13
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 17
    }
}
