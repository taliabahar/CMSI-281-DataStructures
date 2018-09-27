/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntLinkedList2.java
 *  Purpose       :  Provides a class to create an integer linked list and a class to create an Iterator
 *                   to be used in IntQueue.java.
 *  Author        :  Talia Bahar
 *  Date          :  2018-09-27
 *  Description   :  This program contains multiple methods to allow one to create and edit a list of integers
                     then sort through its data using the provided iterator methods. Added method to insert or
                     remove a value at given index. Checks for any invalid numbers thrown into the program.
                     Throws an exception if indexes are out of bounds.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class IntLinkedList2 {
  private Node head;
  private int  size;

  // the constructor
  IntLinkedList2() {
    head = null;
    size = 0;
  }

  public int getSize() {
    return size;
  }

  public void prepend( int dataToAdd ) {
    Node currentHead = head;
    head = new Node( dataToAdd );
    head.next = currentHead;
    size++;
  }

  private class Node {
    int data;            // remember this is an IntLinkedList
    Node next;           // here's the self-referential part
    // constructor
    Node( int d ) {
      data = d;
      next = null;
    }
  }

  public Iterator getIteratorAt( int index ) {
    if( (index > size) || (index < 0) ) {
      throw new IllegalArgumentException();
    }
    Iterator it = new Iterator();
    while( index > 0 ) {
      it.next();
      index--;
    }
    return it;
  }

  public void insertAt(int index, int valueToAdd) {
    if( (index > size - 1) || (index < 0) ) {
      throw new IllegalArgumentException();
    }
    Iterator it = getIteratorAt(index-1);
    Node newNode = new Node(valueToAdd);
    newNode.next = it.currentNode.next;
    it.currentNode.next = newNode;
  }

  public int removeAt(int index) {
    if( (index > size - 1) || (index < 0) ) {
      throw new IllegalArgumentException();
    }
    Iterator itToDelete = getIteratorAt(index);
    Iterator it;
    if (index != 0) {
      it = getIteratorAt(index-1);
      it.currentNode.next = it.currentNode.next.next;
    }
    size --;
    return itToDelete.getCurrentInt();
  }

  public class Iterator {
    private Node currentNode;

      Iterator() {
        currentNode = head;
      }

    public void next() {
      if( currentNode == null ) {
        return;
      } else {
        currentNode = currentNode.next;
      }
    }

    public boolean hasNext() {
      return ((currentNode != null) && (currentNode.next != null));
    }

    public int getCurrentInt() {
      return currentNode.data;
    }
  }
}
