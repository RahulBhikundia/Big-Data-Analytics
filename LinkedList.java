import java.util.Scanner;

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data) {
        Node new_node = new Node(data);

        if(list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while(last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }

        return list;
    }

    public static void printList(LinkedList list) {
        Node curr = list.head;
        
        System.out.print("Linked List: ");

        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

        System.out.println();
    }

    public static LinkedList deleteByKey(LinkedList list, int key) {
        Node curr = list.head, prev = null;

        if(curr!=null && curr.data == key) {
            list.head = curr.next;
            System.out.println(key+" found and deleted.");

            return list;
        }
        while(curr != null && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }

        if(curr == null) {
            System.out.println(key+" not found.");
        }
        else {
            prev = curr.next;
            System.out.println(key+" found and deleted.");
        }
        return list;
    }

    public static LinkedList deleteByIndex(LinkedList list, int index) {
        Node cur = list.head, prev = null;
        if(index == 0 && cur != null) {
            list.head = cur.next;
            System.out.println(index + " index element deleted.");
            return list;
        }

        int count = 0;
        while(cur!=null) {
            if(count == index) {
                prev.next = cur.next;
                System.out.println(index+" position element deleted");
                break;
            }
            else {
                prev = cur;
                cur = cur.next;
                count++;
            }
        }
        if(cur == null) {
            System.out.println(index+" position element not found");
        }
        return list;
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();

        // Inserting values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);

        //print list
        printList(list);

        //Delete by key
        deleteByKey(list, 1);
        printList(list);

        //Delete by index
        deleteByIndex(list, 3);
        printList(list);
    }
}