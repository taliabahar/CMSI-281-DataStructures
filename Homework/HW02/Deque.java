/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  Deque.java
 *  Purpose       :  Implements a Deque class using an Array of longs.
 *  Author        :  Talia Bahar, Maya Pegler-Gordon
 *  Date          :  2018-10-14
 *  Description   :  This program contains multiple methods that allows a user to insert and remove
 *                   at either ends of their Deque. As well as methods peek methods and methods to mange the size of the array.
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class Deque {
  private int maxSize;
  private long[] dequeArray;
  private int front;
  private int rear;
  private int nItems;
  public boolean isLeftOpen;
  public boolean isRightOpen;

  public Deque(int s) {
    maxSize = s;
    dequeArray = new long[maxSize];
    front = 0;
    rear = -1;
    nItems = 0;
    isLeftOpen = true;
    isRightOpen = true;
  }

  /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Method to insert items at front of Deque.
  * @param long j representing value to insert
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  public void insertLeft(long j) {
    if(rear == maxSize-1) {
      System.out.println("THE ARRAY IS FULL. REMOVE BEFORE INSERTING.");
    }
    else if((isLeftOpen) && (nItems != maxSize-1)) {
      for(int i=maxSize-1; i > 0; i--) {
        dequeArray[i] = dequeArray[i-1];
      }
      dequeArray[front] = j;
      rear++;
      nItems++;
    }
    else if((isLeftOpen) && (nItems == maxSize-1)) {
      isLeftOpen = false;
      for(int i=maxSize-1; i > 0; i--) {
        dequeArray[i] = dequeArray[i-1];
      }
      rear++;
      dequeArray[front] = j;
      nItems++;
    }
    else if(!isLeftOpen && isRightOpen) {
      insertRight(j);
    }
  }

  /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Method to insert items at rear of Deque.
  * @param long j representing value to insert
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  public void insertRight(long j) {
    if(rear == maxSize-1) {
      System.out.println("THE ARRAY IS FULL. REMOVE BEFORE INSERTING.");
    } else if((isRightOpen) && (nItems != maxSize-1)) {
      rear++;
      dequeArray[rear] = j;
      nItems++;
    } else if((isRightOpen) && (nItems == maxSize-1)) {
      isRightOpen = false;
      rear++;
      dequeArray[rear] = j;
      nItems++;
    } else if(!isRightOpen && isLeftOpen) {
      insertLeft(j);
    }
  }

  /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Method to remove item at rear of dequeArray.
  * @return removed long value
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  public long removeRight() {
    long temp = dequeArray[rear];
    if(nItems == maxSize) {
      isLeftOpen = false;
      isRightOpen = true;
    }
    rear--;
    nItems--;
    if(nItems == 0){
      isLeftOpen = true;
      isRightOpen = true;
    }
    return temp;
  }

  /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Method to remove item at front of Deque.
  * @return removed long value
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  public long removeLeft() {
    long temp = dequeArray[front];
    if(nItems == maxSize) {
      isLeftOpen = true;
      isRightOpen = false;
    }
    for (int i = 0; i < nItems-1; i++) {
      dequeArray[i] = dequeArray[i + 1];
    }
    rear--;
    nItems--;
    if(nItems == 0){
      isLeftOpen = true;
      isRightOpen = true;
    }
    return temp;
  }

  /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Method to display contents of dequeArray.
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  public void displayDequeContent() {
    for (int i = 0; i < nItems; i++) {
      System.out.println(dequeArray[(front+i)%(nItems)]);
    }
  }

  /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Method to reveal value at front of dequeArray.
  * @return value at front of dequeArray.
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  public long peekFront() {
    return dequeArray[front];
  }

  /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Method to reveal value at rear of dequeArray.
  * @return value at rear of dequeArray.
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  public long peekRear() {
    return dequeArray[rear];
  }

  /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Method to check if dequeArray is empty.
  * @return true if dequeArray is empty
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  public boolean isEmpty() {
    return (nItems==0);
  }

  /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Method to check if dequeArray is full.
  * @return true if dequeArray is full.
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  public boolean isFull() {
    return (nItems==maxSize);
  }

  /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Method to keep track of number of items in dequeArray.
  * @return number of items in dequeArray.
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  public int size() {
    return nItems;
  }
}
