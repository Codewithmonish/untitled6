import org.w3c.dom.Node;

public class Doublylinkedlist {
    public static void main(String[] args) {
        DLl list= new DLl();
        list.insertfirst(3);
        list.insertfirst(2);
        list.insertfirst(8);
        list.insertfirst(17);
        list.display();



    }
public   static class DLl {


    Node head;

    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }
    public void insertlast(int val){
        Node node=new Node(val);
        Node last=head;
        node.next=null;
        if (head==null){
            node.prev=null;
            head=node;
            return;
        }
        while (last.next!=null){
            last=last.next;
            last.next=node;
            node=last;
        }

    }

    public void display() {
        Node node = head;
        Node last=null;
        while (node != null) {
            System.out.print(node.val + "->");
            last=node;
            node = node.next;
        }
        System.out.println("reverse");
        while (last!=null){
            System.out.print(last.val+" -> ");
            last=last.prev;
        }
        System.out.println();
    }



    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }


        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }


}

}
