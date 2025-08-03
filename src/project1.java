import java.util.Scanner;
public class project1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int product= sc.nextInt();
        int[][] salesrecord=new int[days][product];
        for(int i=0;i<days;i++){
            for(int j=0;j<product;j++){
            }
        }
        for(int i=0;i<days;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<product;j++){
                if(salesrecord[i][j]>max){
                    max=salesrecord[i][j];
                }
            }

        }
        System.out.println("max");

    }
}
