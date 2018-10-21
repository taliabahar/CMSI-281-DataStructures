/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  FirstLastStackApp.java
 *  Purpose       :  A test harness file for testing out the methods in the "FirstLastListStack.java" class.
 *  Author        :  Talia Bahar, Maya Pegler-Gordon
 *  Date          :  2018-10-14
 *  Description   :  Provides several tests to check all methods from "FirstLastListStack.java" are working correctly.
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
class FirstLastStackApp {
public static void main(String[] args) {
    FirstLastListStack theList = new FirstLastListStack();
    System.out.println("Pushing 11,22,33,44,55");
    theList.push(11);               // inserts at top
    theList.push(22);
    theList.push(33);
    theList.push(44);
    theList.push(55);
    theList.displayList();          // 11 22 33 44 55
    System.out.println("Displaying value at top of list: " + theList.peek());     // 55
    System.out.println("Removing 55,44,33");
    theList.pop();
    theList.pop();
    theList.pop();
    theList.displayList();          // 11 22
    System.out.println("Displaying value at top of list: " + theList.peek());     // 22
    System.out.println("Pushing 66,77");
    theList.push(66);
    theList.push(77);
    theList.displayList();          // 11 22 66 77
    System.out.println("Displaying value at top of list: " + theList.peek());     // 77
    System.out.println("Removing 77");
    theList.pop();
    theList.displayList();          // 11 22 66
  }
}
