import java.util.*;
public class elseif {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age");
        int age;
        age=sc.nextInt();
        if(age>56){
            System.out.println("You are experienced");
        }
        else if(age>46){
            System.out.println("Semi exxperienced");
        }
else{
            System.out.println("Not expe");
        }
    }
}
