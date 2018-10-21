/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  DequeApp.java
 *  Purpose       :  A test harness file for testing out the methods in the "Deque.java" class.
 *  Author        :  Talia Bahar, Maya Pegler-Gordon
 *  Date          :  2018-10-14
 *  Description   :  Provides several tests to check all methods from "Deque.java" are working correctly.
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class DequeApp {
  public static void main(String[] args) {
    Deque theDeque = new Deque(5);           // Deque holds 5 items
    System.out.println("");
    System.out.println("Testing insertRight()");
    System.out.println("Expected Output: 10,20,30,40,70");
    theDeque.insertRight(10);
    theDeque.insertRight(20);
    theDeque.insertRight(30);
    theDeque.insertRight(40);
    theDeque.insertRight(70);
    theDeque.displayDequeContent();
    System.out.println(" ");
    System.out.println("Front: " + theDeque.peekFront());
    System.out.println("Rear: " + theDeque.peekRear());
    System.out.println(" ");
    System.out.println("Inserting a 6th item right [90]");
    System.out.println("Expected Output: 20,30,40,70,90");
    theDeque.insertRight(90);
    theDeque.displayDequeContent();
    System.out.println(" ");
    System.out.println("Front: " + theDeque.peekFront());
    System.out.println("Rear: " + theDeque.peekRear());
    System.out.println(" ");


    System.out.println(" ");
    theDeque.removeRight();
    theDeque.removeRight();
    theDeque.removeRight();
    theDeque.removeRight();
    theDeque.removeRight();
    System.out.println("Making sure array is empty:");
    System.out.println("^");
    theDeque.displayDequeContent();
    System.out.println(theDeque.isEmpty());
    System.out.println("v");
    System.out.println(" ");


    System.out.println("Emptied Array & Testing insertLeft()");
    System.out.println("Expected Output: 70,40,30,20,10");
    theDeque.insertLeft(10);
    theDeque.insertLeft(20);
    theDeque.insertLeft(30);
    theDeque.insertLeft(40);
    theDeque.insertLeft(70);
    theDeque.displayDequeContent();
    System.out.println(" ");
    System.out.println("Front: " + theDeque.peekFront());
    System.out.println("Rear: " + theDeque.peekRear());
    System.out.println(" ");
    System.out.println("Inserting a 6th item left [90]");
    System.out.println("Expected Output: 90,70,40,30,20");
    theDeque.insertLeft(90);
    theDeque.displayDequeContent();System.out.println(" ");
    System.out.println("Front: " + theDeque.peekFront());
    System.out.println("Rear: " + theDeque.peekRear());
    System.out.println(" ");

    // System.out.println("Inserting a 6th item left [10]");
    // System.out.println("Expected Output: 10,90,70,40,30");
    // theDeque.insertLeft(10);
    // theDeque.displayDequeContent();
    // System.out.println("Inserting a 6th item right [10]");
    // System.out.println("Expected Output: 70,40,30,20,10");
    // theDeque.insertRight(10);
    // theDeque.displayDequeContent();

    // System.out.println("Inserting Left 12 and Inserting Right 13");
    // System.out.println("Expected Output: 12, 90, 70, 40, 13");
    // theDeque.insertLeft(12);
    // theDeque.insertRight(13);
    // theDeque.displayDequeContent();


    // while( !theDeque.isEmpty() ) {           //removeRight and display all items
    //   long n = theDeque.removeRight();            // (40, 50, 60, 70, 80)
    //   System.out.print(n);
    //   System.out.print(" ");
    // }
    // System.out.println("");
    }
}
