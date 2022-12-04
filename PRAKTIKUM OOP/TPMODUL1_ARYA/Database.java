import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Database {
        static Integer  Bakso=10000, EsTeh=5000, Brownies = 15000;
        static String makanan;
        static void getFood(){
            System.out.println("============================="
                +"\n1. Bakso (Makanan)   Rp.10000"
                +"\n2. Es Teh (Minuman)   Rp.5000"
                +"\n3. Brownies (Desert)    Rp.15000");
            Scanner scan = new Scanner (System.in);
            System.out.print("Masukkan Menu : ");
            makanan = scan.nextLine();

    }
}

    // TODO Create List of Menu Object to Store Menu from Menu Class

    // TODO Create Method to Insert Menu to Database

    // TODO Create Method to Show Menu from Database

    // TODO Create Method to Search Menu from Database
