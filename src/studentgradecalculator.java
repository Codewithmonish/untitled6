import java.util.Scanner;
public class studentgradecalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numsub=sc.nextInt();
        int totalmarks=0;
        for (int i=1;i<=numsub;i++){
            System.out.println("Enter Marks Of subject:"  + i   +"(out off 100");
            int marks=sc.nextInt();
            while (marks<0 || marks>101){
                System.out.println("INVALID MARKS.please enter marks between 0 and 100.");
                System.out.println("Enter Marks Of Subject:"  + i  +  "(out off 100)");
                marks=sc.nextInt();
            }
            totalmarks+=marks;
        }
        System.out.println("STUDENT RESULT:");
        System.out.println("1: TOTAL MARKS OBTAINED IN ALL SUBJECTS:" +totalmarks);
        int averageper= totalmarks /numsub;
        System.out.println("2: AVERAGE PERCENTAGE:"+averageper);
        if (averageper>=90){
            System.out.println("Your Grade :A+");
        } else if (averageper>=80) {
            System.out.println("Your Grade:A");
        }else if (averageper>=70) {
            System.out.println("Your Grade:B+");
        }else if (averageper>=60) {
            System.out.println("Your Grade:B");
        }else if (averageper>=50) {
            System.out.println("Your Grade:C");
        }else if (averageper>=45) {
            System.out.println("Your Grade:U");
        }else {
            System.out.println("FAIL");
        }
        sc.close();

    }

}
