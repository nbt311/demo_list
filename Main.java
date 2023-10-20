import MyList.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<>();
        myList.insertFirstNode(5);
        myList.insertFirstNode(2);
        myList.insertFirstNode(3);
        myList.insertFirstNode(7);
        myList.insertFirstNode(8);
        myList.insertLastNode(10);
        myList.insertItem(9,3);
        myList.readList();
    }
}
