import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class BillPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===============================================================================================\n");
        System.out.println("__          __   _                                   _               _ __  __            _               ");
        System.out.println("\\ \\        / /  | |                                 | |             (_)  \\/  |          | |           ");
        System.out.println(" \\ \\  /\\  / /__ | | _____ ____  _.__,___   ___      | |_  ____       _| \\  / | __,_ _,__| |_         ");
        System.out.println("  \\ \\/  \\/ / _  \\ |/  __/     \\|  _   _ \\/  _  \\    |  __/    \\     | | |\\/| |/ _  |  __| __|   ");
        System.out.println("   \\  /\\  /  ___/ |  (__|  ()  | | | | | |  ___/    | | |  ()  |    | | |  | | (_| | |  | |_           ");
        System.out.println("    \\/  \\/ \\____|_|\\_____\\____/|_| |_| |_|\\____|    \\___ \\____/     |_|_|  |_|\\__,_|_|   \\__|  ");
        System.out.println("\n===============================================================================================");

        System.out.print("Enter Customer Phone Number : ");
        String phone = input.nextLine();

        System.out.print("Enter Customer Name         : ");
        String name = input.nextLine();

        System.out.println("\n----------------------------------------------");

        System.out.print("Basmathi Qty(Kg)   : ");
        int basmathiQty = input.nextInt();

        System.out.print("Dhal Qty(Kg)       : ");
        int dhalQty = input.nextInt();

        System.out.print("Sugar Qty(Kg)      : ");
        int sugarQty = input.nextInt();

        System.out.print("Highland Qty       : ");
        int highlandQty = input.nextInt();

        System.out.print("Yoghurt Qty        : ");
        int yoghurtQty = input.nextInt();

        System.out.print("Flour Qty(Kg)      : ");
        int flourQty = input.nextInt();

        System.out.print("Soap Qty           : ");
        int soapQty = input.nextInt();

        double pBasmathi = 250.0;
        double pDhal = 180.0;
        double pSugar = 150.0;
        double pHighland = 1200.0;
        double pYoghurt = 50.0;
        double pFlour = 120.0;
        double pSoap = 160.0;

        double tBasmathi = basmathiQty * pBasmathi;
        double tDhal = dhalQty * pDhal;
        double tSugar = sugarQty * pSugar;
        double tHighland = highlandQty * pHighland;
        double tYoghurt = yoghurtQty * pYoghurt;
        double tFlour = flourQty * pFlour;
        double tSoap = soapQty * pSoap;

        double total = tBasmathi + tDhal + tSugar + tHighland + tYoghurt + tFlour + tSoap;
        double discount = total * 0.10;
        double finalPrice = total - discount;


        System.out.println("\n+-------------------------------------------------------------+     ");
        System.out.println("|           _   __  __          ______ ________               |       ");
        System.out.println("|          (_) |  \\/  |   /\\   |  __  \\___  ___|              |       ");
        System.out.println("|           _  | \\  / |  /  \\  | |__)  |  | |                 |        ");
        System.out.println("|          | | | |\\/| | / /\\ \\ |  __  /   | |                 |       ");
        System.out.println("|          | | | |  | |/ ____ \\| |  \\ \\   | |                 |      ");
        System.out.println("|          |_| |_|  |_/_/    \\_\\_|   \\_\\  |_|                 |      ");
        System.out.println("|               225, Galle Road, Panadura.                    |  ");
        System.out.println("+-------------------------------------------------------------+  ");
        System.out.println("|                   #Tel  : " + phone + "                        |");
        System.out.println("|                   #Name : " + name + "                                 |");
        System.out.println("+-------------+---------+------------------+------------------+");
        System.out.println("|             |   Qty   |    Unit Price    |       Price      |");
        System.out.println("+-------------+---------+------------------+------------------+");
        System.out.println("|  Basmathi   |    " + basmathiQty + "    |      " + pBasmathi + "       |     " + tBasmathi + "        |");
        System.out.println("|  Dhal       |    " + dhalQty + "    |      " + pDhal + "       |     " + tDhal + "        |");
        System.out.println("|  Sugar      |    " + sugarQty + "    |      " + pSugar + "       |     " + tSugar + "        |");
        System.out.println("|  Highland   |    " + highlandQty + "    |      " + pHighland + "      |     " + tHighland + "       |");
        System.out.println("|  Yoghurt    |    " + yoghurtQty + "    |      " + pYoghurt + "        |     " + tYoghurt + "         |");
        System.out.println("|  Flour      |    " + flourQty + "    |      " + pFlour + "       |     " + tFlour + "        |");
        System.out.println("|  Soap       |    " + soapQty + "    |      " + pSoap + "       |     " + tSoap + "        |");
        System.out.println("+-------------+---------+------------------+------------------+");
        System.out.println("|                       |  Total           |     " + total + "       |");
        System.out.println("|                       +------------------+------------------+");
        System.out.println("|                       |  Discount(10%)   |     " + discount + "        |");
        System.out.println("|                       +------------------+------------------+");
        System.out.println("|                       |  Price           |     " + finalPrice + "       |");
        System.out.println("+-------------------------------------------------------------+");

        double netAmount=finalPrice;


        System.out.println("Please Enter your Cash");
        double cash=input.nextDouble();

        double change=cash-netAmount;


        System.out.println("+-----------------------+--------------------------------------");
        System.out.println("|       Net Amount      |"+"   "+netAmount+"                 |");
        System.out.println("+-----------------------+--------------------------------------");
        System.out.println("|       Cash            |"+"   "+cash+"                 |");
        System.out.println("+-----------------------+--------------------------------------");
        System.out.println("|       Change          |"+"   "+change+"                  |");
        System.out.println("+-----------------------+--------------------------------------");


        // Convert change to int for breakdown
        int cAmount = (int) change;

        // Currency breakdown
        int n5000 = cAmount / 5000; cAmount %= 5000;
        int n2000 = cAmount / 2000; cAmount %= 2000;
        int n1000 = cAmount / 1000; cAmount %= 1000;
        int n500 = cAmount / 500; cAmount %= 500;
        int n100 = cAmount / 100; cAmount %= 100;
        int n50 = cAmount / 50; cAmount %= 50;
        int n20 = cAmount / 20; cAmount %= 20;
        int n10 = cAmount / 10; cAmount %= 10;

        int c5 = cAmount / 5; cAmount %= 5;
        int c2 = cAmount / 2; cAmount %= 2;
        int c1 = cAmount;

        int noNotes = n5000 + n2000 + n1000 + n500 + n100 + n50 + n20 + n10;
        int noCoins = c5 + c2 + c1;

        // Currency note and coin breakdown print
        System.out.println("\n========== Currency Breakdown ==========");
        System.out.printf("| %-10s | %4s |\n", "Value", "No");
        System.out.println("+--------------+------+");
        System.out.printf("| Rs.5000      | %4d |\n", n5000);
        System.out.printf("| Rs.2000      | %4d |\n", n2000);
        System.out.printf("| Rs.1000      | %4d |\n", n1000);
        System.out.printf("| Rs.500       | %4d |\n", n500);
        System.out.printf("| Rs.100       | %4d |\n", n100);
        System.out.printf("| Rs.50        | %4d |\n", n50);
        System.out.printf("| Rs.20        | %4d |\n", n20);
        System.out.printf("| Rs.10        | %4d |\n", n10);
        System.out.printf("| Rs.5         | %4d |\n", c5);
        System.out.printf("| Rs.2         | %4d |\n", c2);
        System.out.printf("| Rs.1         | %4d |\n", c1);
        System.out.println("+--------------+------+");
        System.out.printf("| Notes Total  | %4d |\n", noNotes);
        System.out.printf("| Coins Total  | %4d |\n", noCoins);
        System.out.println("+--------------+------+");
        System.out.println("\n       THANK YOU FOR SHOPPING WITH US!");
    }

}
