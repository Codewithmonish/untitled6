import java.util.Scanner;
class Bankaccount{
    private double balance;
    public Bankaccount(double initialization){
        this.balance=initialization;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println("DEPOSITE SUCESSFULLY:New Balance"+balance);
        }else {
            System.out.println("INVALID DEPOSITE");
        }
    }
    public void withdraw(double amount){
        if (amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("WITHDRAW SUCESSFULLY:New Balance"+amount);
        }else {
            System.out.println("INVALID WITHDRAW");
        }
    }
}
class ATM {
    private Bankaccount account;
    private Scanner SCanner;

    public ATM(Bankaccount account) {
        this.account = account;
        SCanner = new Scanner(System.in);
    }

    public void showmenue() {
        System.out.println("1.check balance");
        System.out.println("2.deposit");
        System.out.println("3.withdraw");
        System.out.println("4.Exit");
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int choices;
        do {
            showmenue();
            System.out.println("enter your choice");
            choices = SCanner.nextInt();
            switch (choices) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;

                case 4:
                    System.out.println("THANK YOU!...");
                    break;
                default:
                    System.out.println("INVALID CHOICES");

            }
        } while (choices != 4);
    }
    private void checkBalance() {
        System.out.println("CURRENT BALANCE:" + account.getBalance());
    }

    private void deposit() {
        System.out.println("ENTER DEPOSITE:");
        double amount = SCanner.nextDouble();
        account.deposit(amount);
    }

    private void withdraw() {
        System.out.println("ENTER WITHDRAW:");
        double amount = SCanner.nextDouble();
        account.withdraw(amount);

    }
}
public class ATMinterface {
    public static void main(String[] args) {
        Bankaccount user=new Bankaccount(10000);
        ATM are=new ATM(user);
        are.run();
    }
}


