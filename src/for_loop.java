import java.util.*;
public class for_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //for(int i=1;i<=10;i++){   // print numbers till 10
          //  System.out.println(i);
        /* int n;
        System.out.println("Enter number of odd numbers you want to print:");
        n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(2*i+1);*/
        //for(int i=7;i>=0;i--){ // decrementing for loop= it prints till value becomes zero
          //  System.out.println(i);
        int n;
        System.out.println("Enter no of natural nos you want to print");
        n= sc.nextInt();
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }

    }
}
