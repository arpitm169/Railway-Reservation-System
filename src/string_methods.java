public class string_methods {
    public static void main(String[] args) {
        String name="Arpit";
        int value= name.length();
        System.out.println(value);

        String lwc=name.toLowerCase();
        System.out.println(lwc);

        String upc=name.toUpperCase();
        System.out.println(upc);

        String nonTrimmedString ="     Arpit     ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());//trim function trims all the spaces in the string

        String indexrtr=name.substring(2);// iss index se leke last tak ke elements print krva dega
        String indexrtr2=name.substring(1,3);

        System.out.println(indexrtr);
        System.out.println(indexrtr2);

        String Replace=name.replace('r','s');// .replace characters ko replace lr deta hai jaise r ki jgh s likh diya
        System.out.println(Replace);

        String Replace2=name.replace('s','r');
        System.out.println(Replace2);


        System.out.println(name.charAt(2));//character at a specific point return krta hai


        System.out.println(name.indexOf("rpit"));// jahann se start hua wahan ka index batata hai

        System.out.println(name.equals("appi"));// return true agar sahi name hota and return false agar galat name hota



    }
}
