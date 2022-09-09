package DoubleEndedLists;
public class FirstLastList {
    Link first;         //ref to first link
    Link last;          //ref to last link
    public FirstLastList(){     //constructor
        first = null;           //no link on list yet
        last = null;
    }
    public boolean isEmpty(){   //true if no links
        return first == null;
    }
    public void insertFirst(long bb,long jj,String pp){   //insert at front of list
        Link newLink = new Link(bb,jj,pp);    //make new link
        if(isEmpty()){              //if empty list
            last = newLink;         //newLink <-- last
        }newLink.next = first;   //newLink --> old frist
         first = newLink;        //first --> newLink
    }
    
    public void insertLast(long bb,long jj,String pp){    //insert at end of list
        Link newLink = new Link(bb,jj,pp);    //make new link
        if(isEmpty()){                  //if empty list
            first = newLink;            //first --> newLink
        }else{
            last.next = newLink;        //old last --> newLink
        }last = newLink;                //newLink <-- last
    }
    public long deleteFirst(){
        long temp = first.dData;
        if(first.next == null){
            last = null;
        }
        first = first.next;
        return temp;
    }
    public void displayList(){
        System.out.println("List (first-->last): ");
        Link current = first;           //start at beginning
        while(current != null){         //until end of list
            current.displayLink();      //print data
            current = current.next;     //move to next link
        }
        System.out.println("");
    }
}
