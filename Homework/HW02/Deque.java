public class Deque {
  private int maxSize;
  private long[] dequeArray;
  private int front;
  private int rear;
  private int nItems;

  public Deque(int s){ //constrcutor
    maxSize = s;
    dequeArray = new long[maxSize];
    front = 0;
    rear = -1;
    nItems = 0;
  }

  public void insertLeft(long j){          // put item at left of dequeue
    if(rear == maxSize-1) {
      removeRight();
      rear = -1;
    }
    for(int i=nItems; i > 0;i--){                               //if shifted from front would overwrite everything
      dequeArray[i] = dequeArray[i-1];
    }
    dequeArray[front] = j;
    nItems++;
    rear++;
  }

  public void insertRight(long j){        // put item at right of deque
    if(rear == maxSize-1) {
      removeLeft();
      rear -= 1;
    }
    rear++;
    dequeArray[rear] = j;
    nItems++;
  }

  public long removeRight(){                // take item from most right of dequeue
    long temp = dequeArray[rear];
    if(front == maxSize) {
      front = 0;
    }
    nItems--;
    return temp;
  }

  public long removeLeft() {
   long temp = dequeArray[front];
   if (rear == maxSize) {
     rear = 0;
   }
   for (int i = 0; i < nItems-1; i++) {
     dequeArray[i] = dequeArray[i + 1];
   }
   nItems--;
   return temp;
  }

  public void displayDequeContent(){
    for (int i = 0; i < nItems; i++) {
        System.out.println(dequeArray[(front+i)%(nItems)]);
    }
  }

  public long peekFront(){             // peek at front of dequeue
    return dequeArray[front];
  }

  public long peekRear(){             // peek at front of dequeue
    return dequeArray[rear];
  }

  public boolean isEmpty(){            // true if queue is empty
    return (nItems==0);
  }

  public boolean isFull() {           // true if queue is full
    return (nItems==maxSize);
  }

  public int size() {                 // number of items in dequeue
    return nItems;
  }
}
