import java.util.Scanner;
public class takingoutput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number 1");
       // int a=sc.nextInt();
        float a =sc.nextFloat();
        System.out.println("Enter number 2");
        //int b=sc.nextInt();
        float b=sc.nextFloat();
        System.out.println("The sum is:");
        //int sum=a+b;
        float sum=a+b;
        System.out.println(sum);

    }
}
