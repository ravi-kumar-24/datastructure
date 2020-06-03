package com.ravi.mylinkedlist;

public class MyLinkedList {
    int size =0;
    private Node head;

    public MyLinkedList(){

    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        Node current = head;

        while (current.getNext()!=null){
            current = current.getNext();
        }
        current.setNext(newNode);
        size++;
    }

    public void add(int index, int data){
        if(size<index){
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(data);
        if(head == null && index==0){
            head = newNode;
            size++;
            return;
        }
        if(head != null && index==0){
            Node current= head;
            newNode.setNext(current);
            head = newNode;
            size++;
            return;
        }


        Node  current = head;
        for (int i = 0; i < index -1 ; i++) {
            current = current.getNext();
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        size++;
    }

    public void remove(int index){
        if(size<index || index<0){
            throw new IndexOutOfBoundsException();
        }
        if(index==0){
            Node current = head;
            head = current.getNext();
            current =null;
            return;
        }
        Node current = head;
        while (0<index-1){
             current = current.getNext();
             index--;
        }

      Node temp = current.getNext();
      current.setNext(temp.getNext());
      temp =null;
    }

    public void printList(){
        Node current = head;
        while (current !=null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
