package inheritance;

public class besttimetobuy {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        if (prices==null || prices.length==0){
            System.out.println("0");
        }
        int profit=0;
        int buying=prices[0];
        for (int i = 1; i <prices.length ; i++) {
            if (prices[i] <=buying){
                buying=prices[i];
                continue;
            }
            profit=Math.max(profit,prices[i]-buying);

        }
        System.out.println(profit);
    }

}
