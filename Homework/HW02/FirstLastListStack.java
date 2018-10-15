/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  FirstLastListStack.java
 *  Purpose       :  Implement a stack class based on the circular list of Programming Project 5.3.
 *  Author        :  Talia Bahar, Maya Pegler-Gordon
 *  Date          :  2018-10-14
 *  Description   :  This program contains multiple methods that allows a user to insert,
 *                   remove, and peek at the top of their list. As well as to display the contents of their list.
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
class Link {
    public long dData;
    public Link next;

    public Link(long d) {
        dData = d;
    }

    public void displayLink() {
      System.out.print(dData + " ");
    }
}

class FirstLastListStack {
    private Link first;
    private Link last;

    public FirstLastListStack() {
    first = null;
    last = null;
  }
    public boolean isEmpty() {
        return first==null;
    }

    /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method to insert long at top of list.
    * @param long dd represents value to add
    *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    public void push(long dd) {
        Link newLink = new Link(dd);
        if( isEmpty() ) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
}

/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* Method to remove most recently inserted long value.
*  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    public void pop() throws IllegalArgumentException {
      if(isEmpty() || first.next == null) {
          throw new IllegalArgumentException("Not enough items in the list");
      }
      Link secondToLastRef = first;
      Link lastRef = first.next;
      while(lastRef != last) {
          lastRef = lastRef.next;
          secondToLastRef = secondToLastRef.next;
      }
      secondToLastRef.next = null;
      last = secondToLastRef;
    }

    /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method to look at most recently inserted value.
    * @return most recently inserted value.
    *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    public long peek() {
      return last.dData;
    }

    /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method to display list contents.
    *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while(current != null) {  
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
