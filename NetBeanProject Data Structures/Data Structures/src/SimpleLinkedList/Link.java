package SimpleLinkedList;
public class Link {
    int iData;      //data item
    double dData;   //data item
    Link next;      //next link in list
    public Link(int id,double dd){  //constructor
        iData = id;                 //initialize data
        dData = dd;                 //('next' is automatically
    }                               //  set to null, no need to initialize the next field)
    public void displayLink(){      //display ourself
        System.out.print("{" + iData + "," + dData + "}");
    }
}//end class Link