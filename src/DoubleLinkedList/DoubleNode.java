package DoubleLinkedList;

public class DoubleNode {
    private DoubleNode prev;
    private int data;
    private DoubleNode next;

    DoubleNode(DoubleNode prev, int data, DoubleNode next) {
        this.prev = prev;
        this.data = data;
        this.next =  next;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public int getData() {
        return data;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }
}
