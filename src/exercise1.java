import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of first subject");
        int a=sc.nextInt();
        System.out.println("enter marks of second subject");
        int b=sc.nextInt();
        System.out.println("enter marks of third subject");
        int c =sc.nextInt();
        System.out.println("enter marks of fourth subject");
        int d=sc.nextInt();
        System.out.println("enter marks of fifth subject");
        int e=sc.nextInt();
        System.out.println("Enter max marks");
        float mm=sc.nextFloat();
        float sum=mm*5;
        float percent=((a+b+c+d+e)/sum)*100f;
        System.out.println("The percentage is="+percent);
    }
}
