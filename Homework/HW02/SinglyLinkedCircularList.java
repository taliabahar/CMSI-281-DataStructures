public class SinglyLinkedCircularList {
  private Node current;
  private Node tail;
  private int  size;

  // the constructor
  SinglyLinkedCircularList() {
    current = null;
    tail = null;
    size = 0;
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

  public int getSize() {
    return size;
  }

  public void step(){
    current = current.next;
  }

//want to append
  public void insert(int valueToAdd) {
    Node newNode = new Node(valueToAdd);
    if (current == null) {
      current = newNode;
      tail = newNode;
      newNode.next = tail;
    } else {
      tail.next = newNode;
      newNode.next = current;
      current = newNode;
    }
    size++;
  }

  public class Iterator {
    private Node currentNode;

      Iterator() {
        currentNode = tail.next;
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

  // public void prepend( int dataToAdd ) {
  //   Node currentHead = head;
  //   head = new Node( dataToAdd );
  //   head.next = currentHead;
  //   size++;
  // }

//display method
//removeAt method
//searching method

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
    if( (index > size-1) || (index < 0) ) {
      throw new IllegalArgumentException();
    }
    Iterator it = getIteratorAt(index-1);
    Node newNode = new Node(valueToAdd);
    newNode.next = it.currentNode.next;
    it.currentNode.next = newNode;
  }

  public void removeAt(int index) {
    if( (index > size-1) || (index < 0) ) {
      throw new IllegalArgumentException();
    }
    Iterator itToDelete = getIteratorAt(index);
    System.out.println("Deleting node: " + itToDelete.getCurrentInt());
    Iterator it = getIteratorAt(index-1);
    it.currentNode.next = it.currentNode.next.next;
  }
}
