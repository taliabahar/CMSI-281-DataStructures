/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntQueue.java
 *  Purpose       :
 *  Author        :  Talia Bahar
 *  Date          :
 *  Description   :
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class IntQueue {

  IntLinkedList2 myQueue;

  IntQueue() {
    myQueue = new IntLinkedList2();         // constructor
  }

  public int getQueueSize(){
    return myQueue.getSize();
  }

  public void push( int itemToPush ) {
    myQueue.prepend( itemToPush );
  }

  public int peek() {
    return myQueue.getIteratorAt( myQueue.getSize() - 1 ).getCurrentInt();     // we use the iterator
  }

  public int pop() {
    int size = myQueue.getSize();
    return myQueue.removeAt( size - 1 );
  }

  public static void main( String[] args ) {
    IntQueue testQueue = new IntQueue();
    testQueue.push( 19 );
    testQueue.push( 23 );
    testQueue.push( 29 );
    testQueue.push( 31 );
    testQueue.push( 37 );
    testQueue.push( 41 );
    testQueue.push( 43 );
    testQueue.push( 47 );
    testQueue.push( 51 );
    testQueue.push( 57 );
    System.out.println("Current Size of List: " + testQueue.getQueueSize());
    System.out.println( "The top of the Queue: " + testQueue.peek() );      // 19
    System.out.println( "Removing top thing: " + testQueue.pop() );         // 19 removed
    System.out.println( "The top of the Queue: " + testQueue.peek() );      // 23
    System.out.println( "Removing top thing: " + testQueue.pop() );         // 23 removed
    System.out.println( "The top of the Queue: " + testQueue.peek() );      // 29
    System.out.println( "Removing top thing: " + testQueue.pop() );         // 29 removed
    System.out.println( "The top of the Queue: " + testQueue.peek() );      // 31
    System.out.println( "Removing top thing: " + testQueue.pop() );         // 31 removed
    System.out.println( "The top of the Queue: " + testQueue.peek() );      // 37
    System.out.println( "Removing top thing: " + testQueue.pop() );         // 37 removed
    System.out.println( "The top of the Queue: " + testQueue.peek() );      // 41
    System.out.println( "Removing top thing: " + testQueue.pop() );         // 41 removed
    System.out.println( "The top of the Queue: " + testQueue.peek() );      // 43
    System.out.println( "Removing top thing: " + testQueue.pop() );         // 43 removed
    System.out.println( "The top of the Queue: " + testQueue.peek() );      // 47
    testQueue.push( testQueue.pop() + testQueue.pop() );
    System.out.println("Removed 47 and 51 and pushed their sum");
    System.out.println( "The top of the Queue: " + testQueue.peek() );      // 57
    System.out.println( "Removing top thing: " + testQueue.pop() );         // 57 removed
    System.out.println( "The top of the Queue: " + testQueue.peek() );      // 98
    System.out.println( "Removing top thing: " + testQueue.pop() );         // 98 removed
    System.out.println("Current Size of List: " + testQueue.getQueueSize());
    System.out.println(" ");
    testQueue.push( 67 );
    testQueue.push( 94 );
    testQueue.push( 28 );
    System.out.println("Pushed 67,94,28");
    System.out.println("Current Size of List: " + testQueue.getQueueSize());
    System.out.println( "The top of the Queue: " + testQueue.peek() );      // 67
    System.out.println( "Removing top thing: " + testQueue.pop() );         // 67 removed
    System.out.println("Current Size of List: " + testQueue.getQueueSize());
    System.out.println( "The top of the Queue: " + testQueue.peek() );      // 94
    System.out.println( "Removing top thing: " + testQueue.pop() );         // 94 removed
    System.out.println("Current Size of List: " + testQueue.getQueueSize());
    System.out.println( "The top of the Queue: " + testQueue.peek() );      // 28
    System.out.println( "Removing top thing: " + testQueue.pop() );         // 28 removed
    System.out.println("Current Size of List: " + testQueue.getQueueSize());
    }
  }
