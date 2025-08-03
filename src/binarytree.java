import java.util.Scanner;

public class binarytree {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        binarytreee tree=new binarytreee();
        tree.populate(scanner);
        tree.preetydisplay();

    }
}
class binarytreee{
    public binarytreee(){

    }
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node root;
    //insert
    public void populate(Scanner scanner){
        System.out.println("Enter the root node");
        int value=scanner.nextInt();
        root =new Node(value);
        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of"+node.value);
        boolean left=scanner.nextBoolean();
        if (left){
            System.out.println("Do you want to enter left of"+node.value);
            int value=scanner.nextInt();
            node.left =new Node(value);
            populate(scanner, node.left);

        }
        System.out.println("Do you want to enter right of"+node.value);
        boolean right=scanner.nextBoolean();
        if (right){
            System.out.println("Do you want to enter right of"+node.value);
            int value=scanner.nextInt();
            node.right =new Node(value);
            populate(scanner, node.right);

        }

    }
    public void display(){
        display(root,"");
    }
    private void display(Node node, String indent){
        if (node==null){
            return;

        }
        System.out.println(indent+node.value);

        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }
    public void preetydisplay(){
        preetydisplay(root,0);
    }

    private void preetydisplay(Node node, int level) {
        if (node==null){
            return;
        }
        preetydisplay(node.right,level+1);
        if (level!=0){
            for (int i = 1; i <level-1 ; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->"+node.value);

        }else {
            System.out.println(node.value);
        }
        preetydisplay(node.left,level+1);
    }

}
