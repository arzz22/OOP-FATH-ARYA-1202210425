import java.util.Scanner;

public class User {
    static void userpraktikan(){
    String username;
    double NoHp;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Nama: ");
    username = input.next();
    
    System.out.println("No. Handphone: ");
    NoHp = input.nextInt();

    System.out.println("\nRegister Succes"
                        + "\nName : " + username
                        + "\nPhone Number: " + NoHp);
    // TODO Create Attribute of User; Name and Phone Number then Create Setter

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message

    }
}
