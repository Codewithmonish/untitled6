import java.util.Scanner;
class game {
    public int generate(int max, int min) {
        int computergen = (int) (Math.random() * (max - min + 1) + min);
        return computergen;
    }
}
public class  numbergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        game gm = new game();
        int totalattempts = 0;
        int win = 8;
        while (true) {
            System.out.println("Enter the minimum number:");
            int max = sc.nextInt();
            System.out.println("Enter the maximum number:");
            int min = sc.nextInt();
            int cg = gm.generate(max, min);
            int attempts = 0;
            while (true) {
                System.out.println("Guess a Number Between:" + max +"and" +min);
                int gnum = sc.nextInt();
                attempts++;

                if (gnum > cg) {
                    System.out.println("It is Greater");
                } else if (gnum < cg) {
                    System.out.println("It is Lower");

                } else {
                    System.out.println("Correct Guess");
                    System.out.println("CONGRATULATION YOU WON :)");
                    win++;
                    break;
                }
            }
            totalattempts += attempts;
            System.out.println("attempts =" + attempts);
            System.out.println("win=" + win);
            double winrate = (double) win / totalattempts * 100;
            System.out.println(winrate);
            System.out.println("DO YOU WANT TO PLAY AGAIN...(yes/no)");

            String playagain = sc.next();
            if (!playagain.equalsIgnoreCase("yes" )) {
                sc.close();
                System.out.println("THANK YOU FOR YOUR RESPONSE...:)  ");
                System.exit(0);
            }
            sc.nextLine();
        }

    }


}

