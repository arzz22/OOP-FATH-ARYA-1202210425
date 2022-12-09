package MODUL2_ARYA;

public class MainApp{
    public static void main(String[] args) throws Exception {
    TransportasiAir transportasAir1 = new TransportasiAir(0, 0);
    transportasiAir1.informasi();
    transportasiAir1.berlayar();
    transportasiAir1.berlabuh();
    Sampan sampan1 = new Sampan(30,20000,10);
    sampan1.informasi();
    sampan1.berlayar();
    sampan1.berlabuh();
    sampan1.berlabuh(20);
    System.out.println("");

    Kapal kapal1 = new Kapal(30,20000,"Diesel");
    kapal1.informasi();
    kapal1.berlayar();
    kapal1.berlayar(2);
    kapal1.berlabuh();
    System.out.println("");
    }
}