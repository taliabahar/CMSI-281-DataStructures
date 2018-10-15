/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  SinglyLinkedCircularList.java
 *  Purpose       :  Implements a Singly Linked Circular Linked List.
 *  Author        :  Talia Bahar, Maya Pegler-Gordon
 *  Date          :  2018-10-14
 *  Description   :  This program contains a Node class, Iterator class, alongside the SinglyLinkedCircularList class.
 *                   Contains methods to insert new nodes after the most recently inserted node, to delete the
 *                   most recently inserted node, and to display list contents. There is also a getIteratorAt method
 *                   which can be used to search through the list contents.
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class SinglyLinkedCircularList {
  private Node current;
  private Node tail;
  private int  size;

  SinglyLinkedCircularList() {
    current = null;
    tail = null;
    size = 0;
  }

  private class Node {
    int data;
    Node next;

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

    /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method to append node to linked list.
    * @param int representing value to add
    *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
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

    /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method to delete most recently inserted node.
    *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    public void delete() {
      Iterator itToDelete = getIteratorAt(size-1);
      System.out.println("Deleting node: " + itToDelete.getCurrentInt());
      Iterator it= getIteratorAt(size-2);
      it.currentNode.next = it.currentNode.next.next;
      size--;
    }

    /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method to display value of node in linked list.
    * @return String representing list contents.
    *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
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

    /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method to search through node values in linked list.
    * @param int representing index spot of node user wants to find.
    * @return Iterator representing node value at given index.
    *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
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
