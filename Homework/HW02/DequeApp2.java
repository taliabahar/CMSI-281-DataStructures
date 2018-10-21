public class DequeApp2 {
    public static void main(String[] args) {
        Deque theDeque = new Deque(4);                                              // queue holds 4 items
        System.out.println(" ");
        theDeque.insertLeft(12);
        theDeque.insertLeft(13);
        theDeque.insertLeft(11);
        theDeque.insertLeft(98);                                                    // 98, 11, 13, 12
        System.out.println("Starting:  98, 11, 13, 12");
        theDeque.displayDequeContent();           // 98, 11, 13, 12
        System.out.println("Adding a 5th element ");
        theDeque.insertLeft(55);
        theDeque.displayDequeContent();
        System.out.println(" ");

        theDeque.removeLeft();
        System.out.println("Removed left");
        theDeque.displayDequeContent();
        System.out.println(" ");
        theDeque.insertLeft(55);
        theDeque.displayDequeContent();




        // theDeque.insertRight(12);
        // theDeque.insertRight(13);
        // theDeque.insertRight(11);
        // theDeque.insertRight(98);                                                    // 98, 11, 13, 12
        // System.out.println("Starting:  12, 13, 11, 98");
        // theDeque.displayDequeContent();           // 98, 11, 13, 12
        //
        // // theDeque.insertRight(55);
        // // theDeque.displayDequeContent();
        // System.out.println(" ");
        // System.out.println(" ");
        // theDeque.removeRight();
        // theDeque.removeRight();
        // theDeque.removeRight();
        // theDeque.removeRight();
        //
        // theDeque.displayDequeContent();




        // System.out.println("\n");
        //
        // System.out.println("Inserting right. Expected: Deque is full.");
        // theDeque.insertRight(12);                                                   // Deque is full
        //
        // System.out.println("\n");
        //
        // System.out.println("Removing right. Expected: 98 11 13");
        // theDeque.removeRight();
        // theDeque.displayDequeContent();                   // 98 11 13
        //
        // System.out.println("Inserting left. Expected: 98 11 13 76");
        // theDeque.insertRight(76);                                                   // 98 11 13 76
        // theDeque.displayDequeContent();                   // 98 11 13 76
        //
        // System.out.println("Inserting left. Expected: Deque is full.");
        // theDeque.insertLeft(12);                                                    // Deque is full
        //
        // System.out.println("\n");
        //
        // System.out.println("Clearing array. Expected: Empty deque");
        // theDeque.removeRight();
        // theDeque.removeRight();
        // theDeque.removeRight();
        // theDeque.removeRight();
        // theDeque.displayDequeContent();                   // Empty deque
        //
        // System.out.println("Inserting values. Expected: 99 14 32 42");
        // theDeque.insertLeft(14);
        // theDeque.insertRight(32);
        // theDeque.insertLeft(99);
        // theDeque.insertRight(42);
        // theDeque.displayDequeContent();                   // 99 14 32 42
        //
        // System.out.println("Inserting left. Expected: Deque is full.");
        // theDeque.insertLeft(87);
        //
        // System.out.println("\n");
        //
        // System.out.println("Removing left. Expected: 14 32 42");
        // theDeque.removeLeft();
        // theDeque.displayDequeContent();                   // 14 32 42
        //
        // System.out.println("Removing right. Expected: 14 32");
        // theDeque.removeRight();
        // theDeque.displayDequeContent();                  // 14 32
        //
        // System.out.println("Inserting left. Expected: 52 14 32");
        // theDeque.insertRight(52);                                                   // 98 11 13 76
        // theDeque.displayDequeContent();                   // 52 14 32
        //
        // System.out.println("Inserting left. Expected: 79 52 14 32");
        // theDeque.insertRight(79);                                                   // 98 11 13 76
        // theDeque.displayDequeContent();                   // 79 52 14 32

    }
}
