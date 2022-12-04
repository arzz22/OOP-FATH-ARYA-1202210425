public class Laptop extends Perangkat {
    protected boolean webcam; //attribute
    
    //constructor
    public Laptop(String drive, int ram, float processor, boolean webcam){
        super(drive,ram,processor);
        this.webcam = webcam;
    }

    //overriding method informasi dari class Perangkat
    @Override
    public void informasi(){
        // TODO Auto-generated method stub
        if(webcam){
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu laptop ini juga memiliki webcam");
        }
        else{
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu laptop ini juga tidak memiliki webcam");
        }
        
    }

    //method telfon
    public void bukaGame(String nama_game){
        System.out.printf("Laptop berhasil membuka "+ nama_game);
    }
        //method kirimEmail
    public void kirimEmail(String email){
            System.out.printf("\nLaptop berhasil mengirim Email ke  No "+ email);
    }
            //method kirimEmail
    public void kirimEmail(String email1, String email2){
            System.out.printf("\nLaptop berhasil mengirim Email ke  No "+ email1 + " dan "+ email2);
    }
}

