package com.linear.mystack.ll;

public class MyLinkedList<T> {

    int size;

    private MyNode<T> head;

    public MyLinkedList() {

    }

    public MyLinkedList<T> add(T t) {
        MyNode<T> newNode = new MyNode<>(t);
        newNode.setNext(null);
        if (head == null) {
            setHead(newNode);
        } else {
            MyNode<T> currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
        size = size + 1;
        return this;
    }

    public MyLinkedList<T> add(MyNode<T> newNode) {
        System.out.println(newNode);
        newNode.setNext(null);
        if (head == null) {
            setHead(newNode);
        } else {
            MyNode<T> currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
        size = size + 1;
        return this;
    }

    public boolean isLoopExists() {
        boolean flag = false;
        MyNode<T> slowPointer = head, fastPointer = head;

        while (slowPointer.getNext() != null && fastPointer.getNext() != null && fastPointer.getNext().getNext() != null) {

            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext().getNext();
            if (slowPointer == fastPointer) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    public MyLinkedList<T> add(int index, T t) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Inalid index");
        }

        MyNode<T> newNode = new MyNode<>(t);
        MyNode<T> pre = head;
        int count = 1;
        if (index == 0) {
            newNode.setNext(pre);
            head = newNode;
        } else {
            while (index > count) {
                pre = pre.getNext();
                count++;
            }

            MyNode<T> temp = pre.getNext();
            newNode.setNext(temp);
            pre.setNext(newNode);
        }
        size = size + 1;

        return this;
    }

    public void delete(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Inalid index");
        }

        MyNode<T> current = head;
        int count = 1;
        if (index == 0) {
            head = current.getNext();
            current = null;
        } else {
            while (index > count) {
                current = current.getNext();
                count++;
            }
            MyNode<T> deletedNode = current.getNext();

            current.setNext(deletedNode.getNext());
            deletedNode = null;

        }
        size--;
    }

    public int getSize() {
        return size;
    }

    public MyLinkedList<T> reverseList() {
        MyNode<T> pre = null,  curr = head,next = null;

        while (curr != null) {
            next = curr.getNext(); //first take next node
            curr.setNext(pre); // set previous node
            pre = curr;         // than move the pointer from pre to current
            curr = next;      // and current to next
        }
        head = pre;  // set back header to last node which was pre in logic
        return this;
    }

    public void printList() {
        System.out.println("========== Printing list ==========");
        MyNode<T> currentNode = head;

        while (currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }

    public MyNode<T> intercestion(MyNode<T> list1, MyNode<T> list2) {
        MyNode point = null;

        int l1 = 0, l2 = 0, diff = 0;

        MyNode<T> h1 = list1;
        MyNode<T> h2 = list2;


        while (h1 != null) {
            l1++;
            h1 = h1.getNext();
        }

        while (h2 != null) {
            l2++;
            h2 = h2.getNext();
        }
        if (l1 < l2) {
            h1 = list2;
            h2 = list1;
            diff = l2 - l1;
        } else {
            h1 = list1;
            h2 = list2;
            diff = l1 - l2;
        }
        for (int i = 0; i < diff; i++) {
            h1 = h1.getNext();
        }

        while (h1 != null) {
            if (h1.getData() == h2.getData()) {
                return h1;
            }
            h1 = h1.getNext();
            h2 = h2.getNext();
        }
        return point;
    }

    public MyNode<Integer> merge(MyNode<Integer> node1, MyNode<Integer> node2) {
        MyNode<Integer> result;
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }
        if (node1.getData() <= node2.getData()) {
            result = node1;
            result.setNext(merge(node1.getNext(), node2));
        } else {
            result = node2;
            result.setNext(merge(node2.getNext(), node1));
        }
        return result;
    }

    private void setHead(MyNode<T> head) {
        this.head = head;
    }

    public MyNode<T> getHead() {
        return head;
    }
}

