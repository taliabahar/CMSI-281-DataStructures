public class SinglyLinkedCircularListTester {
  public static void main(String[] args) {
    SinglyLinkedCircularList myCircularList = new SinglyLinkedCircularList();
    myCircularList.insert(5);
    myCircularList.insert(6);
    myCircularList.insert(7);
    SinglyLinkedCircularList.Iterator myIt = myCircularList.getIteratorAt( 0 );
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );
    myIt.next();
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );
    myIt.next();
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );
    myIt.next();

  }
}
