package com.company;
import java.util.Scanner;
public class Main {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
        Node head = null;
        Node tail = null;
    public void creation() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("enter the data:");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;
            } else {
                head.prev = new_node;
                new_node.next = head;
                head = new_node;
            }
            System.out.print("Do u want to add mkre data.If Yes,press 1:");
            n=sc.nextInt();
        }
        while(n==1);
    }
    public void traverser()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.print("LL not exist");
        }
        else
        {
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Main L1=new Main();
        L1.creation();
        L1.traverser();
    }
}
