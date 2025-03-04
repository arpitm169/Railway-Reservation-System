import java.util.*;
public class conditionals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // driving condition
        int age;
        System.out.println("Enter age:");
        age=sc.nextInt();
        if(age>18){
            System.out.println("yes you can drive");
        }
        else{
            System.out.println("not yet my boy");
        }

    }
}
