package linklist;

public class LinkedList {
    private Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    static class Node {
        int data;
        Node next;
    }




    public void display_link_list() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void insertNodeAtBeginning(Node temp) {

    }

}
