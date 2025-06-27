package day_024_date_2025_07_22.circular_linked_list;

class Node{
    Node next;
    int data;

    Node(int data){
        this.data =data;
        this.next = null;
    }
}
public class CircularLinkedList {
    Node head;
    CircularLinkedList(){
        head = null;
    }
    CircularLinkedList(Node node){
        head = node;
        head.next=head;
    }
    public Node addFirst(int data){
        Node temp = new Node(data);
        if(head==null){
            head = temp;
            head.next=temp;
        }else{
            temp.next = head.next;
            head.next = temp;
            int curr= head.data;
            head.data = temp.data;
            temp.data = curr;
        }


        return head;
    }
    public void print(){
        Node dummy = head;
        if(dummy==null){
            System.out.println("NULL");
        }else {
        }
    }
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.print();
    }
}
