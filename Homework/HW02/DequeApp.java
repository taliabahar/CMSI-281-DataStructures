public class DequeApp {
    public static void main(String[] args) {
        Deque theDeque = new Deque(4);                                              // queue holds 4 items
        System.out.println("Array Size is 4");
        System.out.println(" ");
        theDeque.insertLeft(11);
        theDeque.insertLeft(22);
        theDeque.insertLeft(33);
        theDeque.insertLeft(44);                                                    // 98, 11, 13, 12
        System.out.println("Starting: 44, 33, 22, 11");
        theDeque.displayDequeContent();           // 98, 11, 13, 12
        System.out.println("Inserting Left a 5th element: Expecting Array is full message.");
        theDeque.insertLeft(55);

        System.out.println(" ");

        theDeque.removeLeft();
        System.out.println("Removed Left. Expected Output: 33,22,11 ");
        theDeque.displayDequeContent();
        System.out.println("Inserting 55 Left. Expected Output: 55,33,22,11");
        theDeque.insertLeft(55);
        theDeque.displayDequeContent();
        System.out.println("Inserting Left a 5th element: Expecting Array is full message.");
        theDeque.insertLeft(66);
        theDeque.removeRight();
        System.out.println(" ");

        System.out.println("Removed Right. Expected Output: 55,33,22");
        theDeque.displayDequeContent();
        System.out.println("Inserting 66 Left. Expected Output: 55,33,22,66");
        theDeque.insertLeft(66);
        theDeque.displayDequeContent();
        System.out.println(" ");

        System.out.println("Removed Left Twice. Expected Output: 22,66");
        theDeque.removeLeft();
        theDeque.removeLeft();
        theDeque.displayDequeContent();
        System.out.println("Inserting 77 Right. Expected Output: 77,22,66");
        theDeque.insertRight(77);
        theDeque.displayDequeContent();
        System.out.println("Inserting 88 Left. Expected Output: 88,77,22,66");
        theDeque.insertLeft(88);
        theDeque.displayDequeContent();
        System.out.println(" ");

        System.out.println("EMPTYING DEQUE");
        theDeque.removeRight();
        theDeque.removeLeft();
        theDeque.removeRight();
        theDeque.removeLeft();
        System.out.println(" ");

        System.out.println("Inserting values. Expected: 30 10 20 40");
        theDeque.insertLeft(10);
        theDeque.insertRight(20);
        theDeque.insertLeft(30);
        theDeque.insertRight(40);
        theDeque.displayDequeContent();

        System.out.println("Inserting left. Expecting deque is full.");
        theDeque.insertLeft(4);
        System.out.println("\n");

        System.out.println("Removing left. Expected output: 10, 20, 40");
        theDeque.removeLeft();
        theDeque.displayDequeContent();
        System.out.println("\n");

        System.out.println("Removing right. Expected: 10 20");
        theDeque.removeRight();
        theDeque.displayDequeContent();
        System.out.println("\n");

        System.out.println("Inserting left. Expected: 50 10 20");
        theDeque.insertLeft(50);                                                   // 98 11 13 76
        theDeque.displayDequeContent();
        System.out.println("\n");

         System.out.println("Inserting left. Expected: 60 50 10 20");
        theDeque.insertRight(60);                                                   // 98 11 13 76
        theDeque.displayDequeContent();
    }
}
