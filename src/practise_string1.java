import java.util.Locale;

public class practise_string1 {
    public static void main(String[] args) {
        // convert string to lower case problem 1


        String name="Arpit";
        String lec=name.toLowerCase();
        System.out.println(lec);
        // Problem 2
        String underscore="HI MY NAME IS ARPIT";
        String rep=underscore.replace(" ","_");
        System.out.println(rep);
        // Problem 3
        String letter="Dear Arpit,Thanks a lot";
        System.out.println(letter);
        letter= letter.replace("Arpit","Kuch bhi");
        System.out.println(letter);

        //problem 4
        String space=" this string contains  double and triple   spaces ";
        System.out.println(space.indexOf("  "));
        System.out.println(space.indexOf("   "));



    }
}
