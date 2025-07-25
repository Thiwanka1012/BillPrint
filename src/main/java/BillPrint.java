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

    }

}
