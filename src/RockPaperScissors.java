import java.util.*;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for rock,2 for scissors, 3 for paper");
        int userinput=sc.nextInt();
        Random random=new Random();
        int computer=random.nextInt(3);
        if(userinput==computer){
            System.out.println("Draw");
        }
        else if(userinput==3 && computer==1 || userinput==2 && computer==1 || userinput==1 && computer==2){
            System.out.println("YOU win");

        }
        else{
            System.out.println("You lose");
        }
        System.out.println("Computer chose:"+computer);

    }
}
