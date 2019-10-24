package DoubleLinkedList;

public class DoubleLinkedList {
    public DoubleNode head = null;
    public DoubleNode tail = null;

    DoubleLinkedList(){}

    public void insertFront(int data) {
        DoubleNode newNode = new DoubleNode(null,data,null);
        if(head == null) {
            head = newNode;
        } else {
            head.setPrev(newNode);
            newNode.setNext(head);
        }
        head = newNode;
    }

    public void addAtEnd(int data) {
        DoubleNode newNode = new DoubleNode(null, data, null);
        if(head == null) {
            head = newNode;
            tail = head;
        } else {
            DoubleNode last = head;
            //this is required ,if the list already exist ,we need to go to the end of the list
            while(last != null) {
                last = last.getNext();
                if(last != null) {
                    tail = last;
                }
            }
            tail.setNext(newNode);
            newNode.setPrev(tail);
        }
        tail= newNode;
    }

    public void insertAfter(DoubleNode node, int data) {
        if(node == null) {
            return;
        }
        //We are assumging that there exist always one node
        //otherwise the code would give error (NullPointerexception)
        DoubleNode iterator = head;
        while(iterator != null ){
            if(iterator.equals(node)) {
                //adding at the end
                if(node.getNext() == null) {
                    DoubleNode newNode = new DoubleNode(null,data ,null);
                    node.setNext(newNode);
                    newNode.setPrev(node);
                } else {
                    //adding the begining
                    DoubleNode nextNode = node.getNext();
                    DoubleNode newNode = new DoubleNode(null,data,null);
                    node.setNext(newNode);
                    newNode.setPrev(node);
                    newNode.setNext(nextNode);
                    nextNode.setPrev(newNode);
                }
                iterator = iterator.getNext();
            }
        }

    }

    //TO DO
    //delete at any the give node
    //public void deleteNode();

    @Override
    public String toString() {
        DoubleNode last = null;
        StringBuffer result = new StringBuffer("-->");
        while(head != null) {
            result.append(head.getData()+" ");
            head = head.getNext();
            if(head != null){
                last = head;
            }
        }

        result.append("%n");
        result.append("-->");
        while(last != null) {
            result.append(last.getData()+" ");
            last = last.getPrev();
        }

        return result.toString();
    }

}
