import java.io.*;
public class Reservation {




    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int pno[] = new int[275];
    String name[] = new String[275];
    String phno[] = new String[275];
    int age[] = new int[275];
    int cl[] = new int[275];
    int pcount = 0;
    int pnum = 1;
    int max1 = 75, max2 = 125, max3 = 175;

    public void doMenu() throws Exception {
        int cho;
        do {
            System.out.println("\f");
            doHeading();
            System.out.println("1. Book ticket");
            System.out.println("2. Cancel ticket");
            System.out.println("3. Search passenger");
            System.out.println("4. Reservation chart");
            System.out.println("5. Display unbooked tickets");
            System.out.println("6. Exit");
            System.out.print("Please enter your choice: ");
            cho = Integer.parseInt(br.readLine());

            switch (cho) {
                case 1 -> doBook();
                case 2 -> doCancel();
                case 3 -> doSearch();
                case 4 -> doDispList();
                case 5 -> doDispUnbooked();
                case 6 -> doExit();
                default -> System.out.println("Invalid choice! Please try again.");
            }

        } while (cho != 6);
    }

    private void doHeading() {
        System.out.println("#########################################################");
        System.out.println("********* Railway Reservation For Kabul Express ********");
        System.out.println("#########################################################");
    }

    private void doBook() throws Exception {
        System.out.println("Select ticket class: 1. AC | 2. First | 3. Sleeper");
        int c = Integer.parseInt(br.readLine());

        System.out.println("Enter number of tickets: ");
        int t = Integer.parseInt(br.readLine());

        if ((c == 1 && max1 >= t) || (c == 2 && max2 >= t) || (c == 3 && max3 >= t)) {
            for (int i = 0; i < t; i++) {
                pno[pcount] = pnum++;
                System.out.print("Enter your name: ");
                name[pcount] = br.readLine();
                System.out.print("Enter your age: ");
                age[pcount] = Integer.parseInt(br.readLine());
                System.out.print("Enter your phone number: ");
                phno[pcount] = br.readLine();
                cl[pcount] = c;
                pcount++;
                System.out.println("Ticket successfully booked.");
            }

            int cost = (c == 1) ? 1500 : (c == 2) ? 1200 : 1000;
            System.out.println("Please pay Rs. " + (t * cost));

            if (c == 1) max1 -= t;
            if (c == 2) max2 -= t;
            if (c == 3) max3 -= t;

        } else {
            System.out.println("Not enough tickets available.");
        }
    }

    private void doCancel() throws Exception {
        System.out.print("Enter your passenger number: ");
        int p = Integer.parseInt(br.readLine());

        int index = -1;
        for (int i = 0; i < pcount; i++) {
            if (pno[i] == p) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("No such passenger found.");
            return;
        }

        int refund = (cl[index] == 1) ? 1500 : (cl[index] == 2) ? 1200 : 1000;
        System.out.println("Please collect a refund of Rs. " + refund);

        // Shift elements to remove the canceled passenger
        for (int i = index; i < pcount - 1; i++) {
            pno[i] = pno[i + 1];
            name[i] = name[i + 1];
            age[i] = age[i + 1];
            phno[i] = phno[i + 1];
            cl[i] = cl[i + 1];
        }

        pcount--; // Decrease passenger count
        if (cl[index] == 1) max1++;
        if (cl[index] == 2) max2++;
        if (cl[index] == 3) max3++;

        System.out.println("Ticket successfully cancelled.");
    }

    private void doDispList() {
        System.out.println("Passenger list:");

        String[] classes = {"AC", "First", "Sleeper"};
        for (int c = 1; c <= 3; c++) {
            System.out.println("\n" + classes[c - 1] + " Class:");
            System.out.println("P.No\tName\t\tAge\tPhone No.");
            for (int i = 0; i < pcount; i++) {
                if (cl[i] == c) {
                    System.out.println(pno[i] + "\t" + name[i] + "\t\t" + age[i] + "\t" + phno[i]);
                }
            }
        }
    }

    private void doSearch() throws Exception {
        System.out.print("Enter passenger number to search: ");
        int p = Integer.parseInt(br.readLine());

        for (int i = 0; i < pcount; i++) {
            if (pno[i] == p) {
                System.out.println("Passenger found!");
                System.out.println("Passenger No: " + pno[i]);
                System.out.println("Name: " + name[i]);
                System.out.println("Class: " + cl[i]);
                System.out.println("Phone: " + phno[i]);
                System.out.println("Age: " + age[i]);
                return;
            }
        }
        System.out.println("No such passenger.");
    }

    private void doDispUnbooked() {
        System.out.println("\nUnbooked Tickets:");
        System.out.println("AC Class: " + max1);
        System.out.println("First Class: " + max2);
        System.out.println("Sleeper Class: " + max3);
    }

    private void doExit() {
        System.out.println("Thank you for using the Railway Reservation System!");
    }

    public static void main(String[] args) throws Exception {
        new Reservation().doMenu();
    }
}

