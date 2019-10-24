package DoubleLinkedList;

public class DoubleLinkedListTest {
    public static void main(String[] args) {
        DoubleLinkedList dl = new DoubleLinkedList();
        dl.insertFront(2);
        dl.insertFront(3);
        dl.insertFront(4);
        dl.addAtEnd(5);

        System.out.printf(dl.toString());
    }

}
