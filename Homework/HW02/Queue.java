public class Queue {
  private int maxSize;
  private long[] queArray;
  private int front;
  private int rear;
  private int nItems;

  public Queue(int s){ //constrcutor
    maxSize = s;
    queArray = new long[maxSize];
    front = 0;
    rear = -1;
    nItems = 0;
  }

  public void insert(long j){          // put item at rear of queue
    if(rear == maxSize-1) {
      rear = -1;
    }
    queArray[++rear] = j;
    nItems++;
  }

  public long remove(){                // take item from front of queue
    long temp = queArray[front++];
    if(front == maxSize) {
      front = 0;
    }
    nItems--;
    return temp;
  }

  public void displayQueueContent() {
    for (int i = 0; i < nItems; i++) {
        System.out.println(queArray[(front+i)%(nItems)]);
    }
  }

  public long peekFront(){             // peek at front of queue
    return queArray[front];
  }

  public boolean isEmpty(){            // true if queue is empty
    return (nItems==0);
  }

  public boolean isFull() {           // true if queue is full
    return (nItems==maxSize);
  }

  public int size() {                 // number of items in queue
    return nItems;
  }
}
