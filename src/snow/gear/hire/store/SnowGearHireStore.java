package snow.gear.hire.store;

import java.util.Scanner;

public class SnowGearHireStore {

    static int hire_tier;
    static int total_pieces;
    static int total_standard_amount = 0;
    static int total_member_amount = 0;
    static int total_business_amount = 0;
    static int total_discounts = 0;

    static void display_payment_info() {
        System.out.println("\n******************************************************************************"
                + "\n* Total payment amount received for standard hire agreements:\t\t  "+total_standard_amount
                + "\n* Total payment amount received for member hire agreements:\t\t  "+total_member_amount
                + "\n* Total payment amount received for affiliated business hire agreements:  "+total_business_amount
                + "\n* Total discounts given: \t\t\t\t\t\t  "+total_discounts
                + "\n* Total amount of all payments received across all three hiring tiers:\t  "+(total_standard_amount+total_member_amount+total_business_amount)
                + "\n******************************************************************************");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("*************************************\n"
                + "*  Welcome to Snow Gear Hire Store  *\n"
                + "*************************************");
        loop:
        do {
            System.out.print("\n******************************************************\n"
                    + "* Select Hire tier\t\t\t\t     *\n"
                    + "* 1) Standard hire: $35 per item each day\t     *\n"
                    + "* 2) Member hire: $20 per item each day\t\t     *\n"
                    + "* 3) Affiliated business hire: $27 per item each day *\n"
                    + "* 4) Display progressive payment information\t     *\n"
                    + "* 5) Exit\t\t\t\t\t     *\n"
                    + "******************************************************\n\n>> ");

            hire_tier = s.nextInt();

            for (int i = 1; i <= 5; i++) {
                if (hire_tier == i) {
                    break;
                }  
                else if (hire_tier != i && i == 5) {
                    System.out.println(">> "+hire_tier+" is not listed input\n>> Plz enter again");
                    continue loop;
                }
            }

            SnowGearHireStore A;

            switch (hire_tier) {
                case 1: {
                    System.out.print("Enter the number of pieces of equipment to be hired : ");
                    total_pieces = s.nextInt();
                    A = new Standard_hire();
                    ((Standard_hire) A).payment();
                    break;
                }
                case 2: {
                    System.out.print("Enter the number of pieces of equipment to be hired : ");
                    total_pieces = s.nextInt();
                    A = new Member_hire();
                    ((Member_hire) A).payment();
                    break;
                }
                case 3: {
                    System.out.print("Enter the number of pieces of equipment to be hired : ");
                    total_pieces = s.nextInt();
                    A = new Affiliated_business_hire();
                    ((Affiliated_business_hire) A).payment();
                    break;
                }
                case 4: {
                    display_payment_info();
                    break;
                }
                case 5:
                default:
                    System.exit(0);
                    break;
            }
        } while (true);

    }

}
