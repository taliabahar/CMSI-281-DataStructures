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
