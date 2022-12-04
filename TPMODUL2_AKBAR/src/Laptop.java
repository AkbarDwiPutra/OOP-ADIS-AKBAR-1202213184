public class Laptop extends Perangkat {
    protected Boolean webcam;
    //constructor
        public Laptop ( String drive, Integer ram, Float processor, Boolean webcam){
        super (drive, ram, processor);
        this.webcam = webcam;
        }
    
        @Override
        public void informasi(){
            if (webcam == true){
                System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " dan processor secepat " + processor + ". Selain itu laptop ini juga memiliki webcam");    
            }else{
                System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " dan processor secepat " + processor + ". Selain itu laptop ini TIDAK memiliki webcam");    
    
            }
        }
        public void bukaGame(String nama_game){
            System.out.println("Laptop berhasil membuka game " + nama_game);
        }
        public void kirimEmail(String email){
            System.out.println("Laptop berhasil mengirim Email ke " + email);
        }
        public void kirimEmail(String email1, String email2){
            System.out.println("Laptop berhasil mengirim Email ke "+ email1+" dan ke " + email2);
        }
    }

