package Day_003_Date_2024_06_25.LinkedLists;

public class LinkedList {
    private Node head;
    private Node tail;
    public static int size;

    public LinkedList(){
        this.size=0;
    }

    public void add(int val){
        if(size==0){
            Node newNode= new Node(val);
            head= newNode;
            tail= newNode;
            size++;
        }else{
            Node temp= head;

            while(temp.nextNode!=null){
                temp= temp.nextNode;
            }
            Node newNode= new Node(val);
            temp.nextNode= newNode;
            tail= newNode;
            size++;
        }
    }
    public void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp= temp.nextNode;
        }
        System.out.println("END");
    }
    private class Node{
        private int val;
        private Node nextNode;

        private Node(){

        }
        private Node(int val){
            this.val= val;
        }
        private Node(int val, Node nextNode){
            this.val= val;
            this.nextNode= nextNode;
        }
    }
}
