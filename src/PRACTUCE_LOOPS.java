public class PRACTUCE_LOOPS {
    public static void main(String[] args) {
        /*
         ****
         ***
         **
         * print krna hai
         */
        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");


            }
            System.out.println();
        }
    }
}
