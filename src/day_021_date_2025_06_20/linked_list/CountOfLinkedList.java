package day_021_date_2025_06_20.linked_list;

import java.util.*;

class Node{
    int data;
    Node next;

    Node(){

    }

    Node(int data){
        this.data = data;
    }

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

class LinkedList{
    Node head;
    int size = 0;

    public void add(int num){
        Node newNode = new Node(num);

        if(head==null){
            head = newNode;
            size++;
            return;
        }

        Node curr = head;

        while(curr.next!=null){
            curr = curr.next;
        }

        curr.next = newNode;
        size++;
    }
    public void add(int index, int num){
        Node newNode = new Node(num);

        if(head==null || index>size){
            System.out.println("Ara mgh index thik daa");
            return;
        }

        Node curr = head;

        int counter = 0;
        while(counter!=index){
            counter++;
            curr = curr.next;
        }

        Node temp = curr.next;
        curr.next = newNode;
        newNode.next = temp;
        size++;
    }

    public void addFirst(int num){
        Node newNode = new Node(num);

        if(head==null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    public void print(){
        Node curr = head;

        while(curr!=null){
            if(curr.next==null){
                System.out.print(curr.data);
            }else{
                System.out.print(curr.data+"->");
            }
            curr = curr.next;
        }
    }

    public void delete(int index) {
        if(head==null || index>size){
            System.out.println("ara mgh index bhalara dee");
        }

        Node curr = head;
        int counter = 0;
        while(counter!=index){
            curr = curr.next;
            counter++;
        }

        if(curr.next.next!=null){
            curr.next = curr.next.next;
        }else{
            curr.next = null;
        }
        size--;
    }
}

public class CountOfLinkedList {
    public static void main(String[] args) {
        LinkedList link= new LinkedList();
        link.add(1);
        link.add(2);
        link.add(3);
        link.add(4);
        link.add(5);
        link.add(7);
        link.addFirst(0);

        link.add(5,6);
        link.delete(5);
        System.out.println(link.size);
        link.print();
    }
}
