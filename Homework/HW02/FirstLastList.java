class Link {
    public long dData; // data item
    public Link next; // next link in list
// -------------------------------------------------------------
    public Link(long d) // constructor
    {
        dData = d;
    }
// -------------------------------------------------------------
    public void displayLink() // display this link
    {
        System.out.print(dData + " ");
    }
// -------------------------------------------------------------
} // end class Link
////////////////////////////////////////////////////////////////
class FirstLastList {
    private Link first; // ref to first link
    private Link last; // ref to last link
// -------------------------------------------------------------
    public FirstLastList() // constructor
    {
    first = null; // no links on list yet
    last = null;
    }
// -------------------------------------------------------------
    public boolean isEmpty() // true if no links
    {
        return first==null;
    }
// -------------------------------------------------------------
// -------------------------------------------------------------
    public void insertFirst(long dd)
        { // insert at end of list
        Link newLink = new Link(dd);
        if( isEmpty() ) { // if empty list,
            last = newLink; // first --> newLink
        }
        newLink.next = first; // old last --> newLink
        first = newLink; // newLink <-- last
    }

    public void insertLast(long dd) {
        Link newLink = new Link(dd);
        if( isEmpty() ) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;

}
// -------------------------------------------------------------
    public long deleteFirst() { // delete first link

        long temp = first.dData;
        if(first.next == null) { // if only one item
            last = null; // null <-- last
        }
        first = first.next; // first --> old next
        return temp;
    }
 // -------------------------------------------------------------
    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;  // start at beginning
        while(current != null) {  // until end of list,
            current.displayLink(); // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }
// -------------------------------------------------------------
}
