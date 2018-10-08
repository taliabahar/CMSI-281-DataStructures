public class DequeApp {
  public static void main(String[] args) {
    Deque theDeque = new Deque(5);           // Deque holds 5 items
    System.out.println(" ");
    System.out.println("Testing insertLeft()");
    System.out.println("Expected Output: 70,40,30,20,10");
    theDeque.insertLeft(10);
    theDeque.insertLeft(20);
    theDeque.insertLeft(30);
    theDeque.insertLeft(40);
    theDeque.insertLeft(70);
    theDeque.displayDequeContent();

    // System.out.println("Testing insertRight()");
    // System.out.println("Expected Output: 10,20,30,40,70");
    // theDeque.insertRight(10);
    // theDeque.insertRight(20);
    // theDeque.insertRight(30);
    // theDeque.insertRight(40);
    // theDeque.insertRight(70);
    // theDeque.displayDequeContent();

    // System.out.println(" ");
    // System.out.println("Testing insertLeft() & insertRight()");
    // System.out.println("Expected Output: 70,30,10,20,40");
    // theDeque.insertLeft(10);
    // theDeque.insertRight(20);
    // theDeque.insertLeft(30);
    // theDeque.insertRight(40);
    // theDeque.insertLeft(70);
    // theDeque.insertLeft(90);
    // theDeque.displayDequeContent();

    // theDeque.removeRight();
    // theDeque.removeRight();
    // theDeque.removeRight();                       // removeRight 3 items (10, 20, 30)
    // theDeque.insertLeft(50);
    // theDeque.insertLeft(60);
    // theDeque.insertLeft(70);
    // theDeque.insertLeft(80);                     // insertLeft 4 more items (wraps arounds)
    // theDeque.displayDequeContent();          // 40 50 60 70 80
    // System.out.println( " ");
    // System.out.println("Front: " + theDeque.peekFront());
    // System.out.println("Rear: " + theDeque.peekRear());
    // System.out.println(" ");
    // while( !theDeque.isEmpty() ) {           //removeRight and display all items
    //   long n = theDeque.removeRight();            // (40, 50, 60, 70, 80)
    //   System.out.print(n);
    //   System.out.print(" ");
    // }
    // System.out.println("");
    }
}
