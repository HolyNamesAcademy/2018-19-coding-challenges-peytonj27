package challenges.model;

public class LinkedListNode {
    private int data;
    private LinkedListNode next;

    public LinkedListNode(int data){
        this.data = data;
    }

    public LinkedListNode(int data, LinkedListNode next){
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}
