public class MainApp {
    //main class
    public static void main(String[] args) throws Exception{
        // Pembuatan objek handpone1 dari class Handpone
        Perangkat perangkat1 = new Perangkat("Sandisk", 5 , 3.5F);
        perangkat1.informasi();
        System.out.println("");
        System.out.println("Class Handpone");
        // Pembuatan objek handpone1 dari class Handpone
        Handpone handpone1 = new Handpone("Sandisk", 3 , 2.5F,true);
        handpone1.informasi();
        System.out.println("");
        handpone1.telfon(628218976);
        handpone1.kirimSMS(628218976);
        handpone1.kirimSMS(628218976,628218975);
        System.out.println("\n");

        System.out.println("Class Laptop");
        // Pembuatan objek Laptop1 dari class Laptop
        Laptop Laptop1 = new Laptop("Sandisk", 3 , 2.4F,true);
        Laptop1.informasi();
        System.out.println("");
        Laptop1.bukaGame("Dota 2");
        Laptop1.kirimEmail("Anwar@gmail.com");
        Laptop1.kirimEmail("Anwar@gmail.com","Selen@gmail.com");
        System.out.println("");
    }
}
