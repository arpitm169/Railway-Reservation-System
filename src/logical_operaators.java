import java.sql.SQLOutput;

public class logical_operaators {
    public static void main(String[] args) {
        System.out.println("For logical AND &&");
        boolean a=true;
        boolean b=false;
        if(a && b){ //&& OPERATOR RETURN TRUE ONLY WHEN BOTH BOOLEAN ARE TRUE
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        boolean c= true;
        boolean d=true;
        if(c && d){ // BOTH BOOLEANS ARE TRUE SO OUTPUT IS TRUE
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.println("For logical OR");
        boolean a1=true;
        boolean b1=false;
        if(a || b){ // IF ONE IS TRUE IT WILL RETURN TRUE
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }




    }
}
