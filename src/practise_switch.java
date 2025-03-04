import java.util.*;
public class practise_switch {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
float a,b,c;
        System.out.println("Enter marks in first subject:");
        a=sc.nextFloat();
        System.out.println("Enter marks in second subject:");
                b=sc.nextFloat();
        System.out.println("Enter marks in third subject:");
    c=sc.nextFloat();
    float avg=(a+b+c)/3.0f;
        System.out.println("Average is :"+avg);
    if(avg>=40 && a>=33 && b>=33 && c>=33){
        System.out.println("Student is pass");

    }
    else {
        System.out.println("Student is fail");
    }

    }
}
