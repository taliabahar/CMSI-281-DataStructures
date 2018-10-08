public class Deque
{
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

//using ONLY insertLeft & removeRight means the array acts like a queue
  public void insertLeft(long j){          // put item at left of dequeue
    if(rear == maxSize-1) {
      front = 0;
      rear = -1;
    }
    for(int i=nItems; i > 0;i--){            //if shifted from front would overwrite everything
      dequeArray[i] = dequeArray[i-1];
    }
    dequeArray[front] = j;
    nItems++;
    rear++;
  }


  public long removeRight(){                // take item from most right of dequeue
    long temp = dequeArray[front++];
    if(front == maxSize) {
      front = 0;
    }
    nItems--;
    return temp;
  }

//using ONLY insertRight & removeLeft means the array acts like a stack
  public void insertRight(long j){        // put item at right of deque
    if(rear == maxSize-1) {
      rear = -1;
    }
    rear++;
    dequeArray[rear] = j;
    nItems++;
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
