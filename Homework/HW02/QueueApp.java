/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  QueueApp.java
 *  Purpose       :  A test harness file for testing out the methods in the "Queue.java" class.
 *  Author        :  Talia Bahar, Maya Pegler-Gordon
 *  Date          :  2018-10-14
 *  Description   :  Provides several tests to check all methods from "Queue.java" are working correctly.
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class QueueApp {
  public static void main(String[] args) {
    Queue theQueue = new Queue(5);           // queue holds 5 items
    System.out.println("Inserting 10,20,30,40");
    theQueue.insert(10);
    theQueue.insert(20);
    theQueue.insert(30);
    theQueue.insert(40);                     //insert 10,20,30,40
    theQueue.displayQueueContent();          // 10, 20, 30, 40
    System.out.println(" ");
    System.out.println("Removing 10,20,30");
    theQueue.remove();
    theQueue.remove();
    theQueue.remove();                       // remove 3 items (10, 20, 30)
    theQueue.displayQueueContent();          // 40
    System.out.println(" ");
    System.out.println("Inserting 50,60,70,80");
    theQueue.insert(50);
    theQueue.insert(60);
    theQueue.insert(70);
    theQueue.insert(80);                     // insert 4 more items (wraps arounds)
    theQueue.displayQueueContent();          // 40 50 60 70 80
    System.out.println("Number of items in Queue: " + theQueue.size());
    System.out.println("Checking if array is full: " + theQueue.isFull());
    System.out.println("");
    System.out.println("Removing 40,50,60,70");
    theQueue.remove();
    theQueue.remove();
    theQueue.remove();
    theQueue.remove();
    theQueue.displayQueueContent();     // 80
    System.out.println(" ");
    System.out.println("Number of items in Queue: " + theQueue.size());
    System.out.println("Checking if array is full: " + theQueue.isFull());
  }
}
