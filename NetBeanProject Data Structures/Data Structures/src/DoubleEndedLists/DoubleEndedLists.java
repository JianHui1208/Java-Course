package DoubleEndedLists;
public class DoubleEndedLists {
    public static void main(String[] args) {
        FirstLastList A = new FirstLastList();
        A.insertFirst(20, 30, "aaa");
        A.insertFirst(40, 50, "bbb");
        A.insertFirst(60, 70, "ccc");
        
        A.insertLast(100, 200, "zzz");
        A.insertLast(300, 400, "yyy");
        A.insertLast(500, 600, "xxx");
        
        A.displayList();
        
        A.deleteFirst();
        A.deleteFirst();
        
        A.displayList();
    }
    
}
