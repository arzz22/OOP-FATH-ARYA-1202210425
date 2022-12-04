public class Handpone extends Perangkat {
    protected boolean fingerprint; //attribute
    
    //constructor
    public Handpone(String drive, int ram, float processor, boolean fingerprint){
        super(drive,ram,processor);
        this.fingerprint = fingerprint;
    }

    //overriding method informasi dari class Perangkat
    @Override
    public void informasi(){
        if(fingerprint){
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu laptop ini juga memiliki fingerprint");
        }
        else{
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu laptop ini juga tidak memiliki fingerprint");
        } 
    }

    //method telfon
    public void telfon(int no_hp){
        System.out.printf("Handpone berhasil menyambungkan telfon ke  No "+ no_hp);
    }
        //method kirimSMS
        public void kirimSMS(int no_hp){
            System.out.printf("\nHandpone berhasil mengirim SMS ke  No "+ no_hp);
    }
            //method kirimSMS
        public void kirimSMS(int no_hp1, int no_hp2){
            System.out.printf("\nHandpone berhasil mengirim SMS ke  No "+ no_hp1 + " dan " + no_hp2);
    }
}
