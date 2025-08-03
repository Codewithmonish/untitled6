public class nthroot {
    public static void main(String[] args) {
        int n=3;
        int m=27;
        int b=NthRoot(n,m);
        System.out.println(b);


    }
    public static int NthRoot(int n, int m) {
        int l=1,h=m;
        while(l<=h){
            int mid=(l+h)/2;
            int root=fun(mid,n,m);
            if(root==1){
                return mid;
            }
            else if(root==0){
                h=mid+1;
            }
            else{
                l=m-1;
            }
        }
        return -1;

    }
    public static int fun(int mid,int n,int m){
        long ans=1;
        for(int i=1;i<=m;i++){
            ans=ans*m;
            if(ans>m){
                return 2;

            }
        }
        if(ans==m) {
            return 1;
        }
        return 0;
    }

}
