import java.util.*;
public class sum_of_even_using_while_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int i=0;
        int sum=0;

        while(i<n) {
            sum = sum + (2 * i);
            i++;
        }
            System.out.println("the sum is:"+sum);


            System.out.println();

    }
}
