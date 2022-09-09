package SimpleLinkedList;
public class LinkListApp {
    public static void main(String[] args) {
        LinkList A = new LinkList();    //insert new list
        A.insertFirst(22, 22.2);        //insert four items
        A.insertFirst(44, 44.4);
        A.insertFirst(66, 66.6);
        A.insertFirst(88, 88.8);
        A.displayList();                //display list
        
//        while(!A.isEmpty()){          //until it's empty'
//            Link B = A.deleteFirst();     //delete link
//            System.out.println("Deleted");        //display it
//            B.displayLink();
//            System.out.println();
//        }
//        A.displayList();          //display list

        Link F = A.find(44);        //find iyem
        if(F != null){
            System.out.println();
            System.out.println("Found link with key " + F.iData);
        }else{
            System.out.println();
            System.out.println("Can't find link");
        }
        
        Link P = A.delete(66);
        if(P != null){
            System.out.println();
            System.out.println("Deleted link with key " + P.iData);
        }else{
            System.out.println();
            System.out.println("Can't delete link");
        }
        System.out.println();
        A.displayList();        //display list
    }
    
}
