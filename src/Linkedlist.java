import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.lang.classfile.components.ClassPrinter;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    public static void main(String[] args) {
        LL first=new LL();
        LL second=new LL();
        first.insertlast(1);
        first.insertlast(3);
        first.insertlast(5);

        second.insertlast(2);
        second.insertlast(4);
        second.insertlast(6);
        second.insertlast(8);
        LL ans=LL.merge(first,second);
        ans.dispaly();



    }

    public static class LL {
        private Node head;
        private Node tail;
        private int size;

        public LL() {
            this.size = 0;
        }

        public void insertfirst(int val) {
            Node node = new Node(val);
            node.next = head;
            head = node;

            if (tail == null) {
                tail = head;
            }
            size += 1;
        }

        public void insertlast(int val) {
            if (tail == null) {
                insertfirst(val);
                return;
            }
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;

        }

        public void insert(int val, int index) {
            if (index == 0) {
                insertfirst(val);
                return;
            }
            if (index == size) {
                insertlast(val);
                return;
            }
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;

            }
            Node node = new Node(val, temp.next);
            temp.next = node;
            size++;
        }

        public void insertrec(int val, int index) {
            head = insertrec(val, index, head);

        }

        private Node insertrec(int val, int index, Node node) {
            if (index == 0) {
                Node temp = new Node(val, node);
                size++;
                return temp;
            }
            node.next = insertrec(val, index - 1, node.next);
            return node;
        }

        public int delectfirst() {
            int val = head.value;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return val;
        }

        public int deletlast() {
            if (size <= 1) {
                return delectfirst();
            }
            Node secondlast = get(size - 2);
            int val = tail.value;
            tail = secondlast;
            tail.next = null;
            return val;
        }

        public Node get(int index) {
            Node node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;

            }
            return node;
        }

        public int delete(int index) {
            if (index == 0) {
                return delectfirst();
            }
            if (index == size - 1) {
                return deletlast();
            }
            Node prev = get(index - 1);
            int val = prev.next.value;
            prev.next = prev.next.next;
            return val;
        }

        public void dispaly() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
            System.out.println("END");
        }


        private class Node {

            private int value;
            private Node next;

            public Node(int value) {
                this.value = value;
            }


            public Node(int value, Node next) {
                this.value = value;
                this.next = next;


            }

        }
        //qustions 1
        public void duplicates(){
            Node node=head;
            while (node.next!=null){
                if (node.value==node.next.value){
                    node.next=node.next.next;
                    size--;
                }
                else {
                    node=node.next;
                }
            }
            //tail=node;
           // tail.next=null;
        }
        //question2
        public static LL merge(LL first,LL second){
            Node f=first.head;
            Node s=second.head;
            LL ans=new LL();
            while (f!=null && s!=null){
                if (f.value<s.value){
                    ans.insertlast(f.value);
                    f=f.next;
                }
                else {
                    ans.insertlast(s.value);
                    s=s.next;
                }
            }
            while (f!=null){
                ans.insertlast(f.value);
                f=f.next;
            }
            while (s!=null){
                ans.insertlast(s.value);
                s=s.next;
            }
            return ans;
        }
        //question number 4



    }
}
