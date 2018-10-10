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

    public int getSize() {
      return size;
    }

    public void step(){
      current = current.next;
    }

    //appends
    public void insert(int valueToAdd) {
      Node newNode = new Node(valueToAdd);
      if (current == null) {
        current = newNode;
        tail = newNode;
        newNode.next = tail;
      } else {
        tail.next = newNode;
        tail = newNode;
        newNode.next = current;
      }
      size++;
    }

    //deletes last item inserted
    public void delete() {
      Iterator itToDelete = getIteratorAt(size-1);
      System.out.println("Deleting node: " + itToDelete.getCurrentInt());
      Iterator it= getIteratorAt(size-2);
      it.currentNode.next = it.currentNode.next.next;
      size--;
    }

    //display method
    public String display() {
        String circularList = "";
        for(int i=0; i < size; i++) {
          Iterator it = getIteratorAt(i);
        if(i != size-1) {
          circularList += (it.getCurrentInt() + ", ");
        } else {
          circularList += (it.getCurrentInt() + " ");
        }
          step();
        }
        return circularList;
    }

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
}
