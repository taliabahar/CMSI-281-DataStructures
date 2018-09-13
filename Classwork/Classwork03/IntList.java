/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntList.java
 *  Purpose       :  Provides a class to create an integer list and add and remove integers from that list.
 *  Author        :  Talia Bahar
 *  Date          :  2018-09-5
 *  Description   :  This program contains multiple methods to allow one to create and edit a list of integers.
                     As well as to check for any invalid numbers thrown into the program.
                     Throws an exception if indexes are out of bounds.
 *  Partner       :  Nico
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class IntList implements IntListInterface {
  private int[] theList;
  private int[] expandedList;
  private int   size;

  private static final int STARTING_SIZE = 19;    // defines starting size; don't worry, we'll deal

  public IntList() {                        // doesn't HAVE to be declared public, but doesn't hurt
    theList = new int[STARTING_SIZE];
    size = 0;
   }

  public int getValueAtIndex( int index ) throws ArrayIndexOutOfBoundsException {
    checkIndex(index);
    return theList[index];
  }

  public int removeValueAtIndex( int index ) throws ArrayIndexOutOfBoundsException {
    int value = theList[index];
    checkIndex(index);
    holeFiller( index );
    return value;
   }

  public void checkIndex( int index ) throws ArrayIndexOutOfBoundsException {
    if( size == 0 ) {
      throw new ArrayIndexOutOfBoundsException( "The list is empty!" );
    }
    if(index > size) {
      throw new ArrayIndexOutOfBoundsException( "The index value is too large" );
    }
    else if(index < 0) {
      throw new ArrayIndexOutOfBoundsException( "The index value is too small");
    }
   }

  public boolean append( int valueToAdd ) {
    expandListIfNeeded();
    theList[size] = valueToAdd;
    size++;
    return true;
   }

  public boolean prepend( int valueToAdd ){
    expandListIfNeeded();
    insertValueAtIndex( valueToAdd, 0);
    size++;
    return true;
   }

  public void expandListIfNeeded(){
    if(size >= theList.length) {
      expandedList = new int[theList.length + STARTING_SIZE];
      for(int i=0; i < theList.length-1; i++) {
        expandedList[i] = theList[i];
      }
      theList = expandedList;
    }
  }

  public boolean insertValueAtIndex( int value, int index ) {
    for(int i = theList.length-1; i > index; i--) {
      theList[i-1] = theList[i];
    }
    theList[index] = value;
    return true;
  }

  private void holeFiller( int index ) {
    for( int i = index; i < size - 1; i++ ) {
      theList[i] = theList[i+1];
    }
    size--;
  }
  
  public static void main( String[] args ) {
    IntList list = new IntList();
    list.append( 2 );
    list.append( 3 );
    list.append( 5 );
    list.append( 7 );
    System.out.println( list.getValueAtIndex( 3 ) );   // should return the value 7
    list.append( 11 );
    list.append( 13 );
    list.append( 17 );
    list.append( 19 );
    System.out.println( list.getValueAtIndex( 7 ) );      // should return the value 19
    System.out.println( list.removeValueAtIndex( 3 ) );   // should return the value 7
    System.out.println( list.getValueAtIndex( 3 ) );      // should return the value 11
    list.insertValueAtIndex(6,4);
    System.out.println(list.getValueAtIndex(4));
    System.out.println( list.getValueAtIndex( 4 ));         // should return 6
    list.insertValueAtIndex(38 , 5);
    System.out.println( list.getValueAtIndex( 5 ));         // should return 38
    list.prepend( 8 );
    System.out.println(list.getValueAtIndex(0));
    System.out.println( list.getValueAtIndex( 18 ) );     // just to see what happens
   }
}
