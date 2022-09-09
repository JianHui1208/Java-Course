package DoubleEndedLists;
public class Link {
    long dData;     //data item
    long LData;     //data item
    String SData;
    Link next;      //next link in list
    public Link(long b, long p,String a){    //constructor
        dData = b;
        LData = p;
        SData = a;
    }
    public void displayLink(){      //display this link
        System.out.println("{" + dData + "," + LData + "," + SData +"}");
    }
}
