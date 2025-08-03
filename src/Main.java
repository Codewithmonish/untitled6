//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("enter o for rock,1for paper,2for sci");
        Scanner sc =new Scanner(System.in);
        int hp=sc.nextInt();
        Random random=new Random();
         int cp= random.nextInt(3);
        if(cp==hp) {
            System.out.println("draw");
        }
        else if (cp==0&& hp==1 ||cp==2&& hp==0 ||cp==1&& hp==2) {
            System.out.println("win");

        }
        else {
            System.out.println("computer wins");
        }








        }
    }
