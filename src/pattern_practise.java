public class pattern_practise {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int k=n;k>=1;k--){
            for(int l=0;l<=k;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
