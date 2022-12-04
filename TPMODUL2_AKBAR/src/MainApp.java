public class MainApp {
    //main

    public static void main (String[] args) throws Exception{
        //perangkat
        Perangkat perangkat = new Perangkat("Samsung", 2, 2.40f);
        perangkat.informasi();
        System.out.println("");

        //laptop
        Laptop laptop1 = new Laptop ("Seagate", 16, 2.40f, true);
        laptop1.informasi();
        laptop1.bukaGame("Mobile Legends");
        laptop1.kirimEmail("abaydwiputra@gmail.com");
        laptop1.kirimEmail("abaydwiputra@gmail.com", "abaydwiputra2@gmail.com");
        System.out.println("");

        //handphone
        Handphone handphone1 = new Handphone("V-Gen",  8, 3.24f, false);
        handphone1.informasi();
        handphone1.telfon(621072798);
        handphone1.kirimSMS(6234778);
        handphone1.kirimSMS(62875440, 62890887);
        System.out.println("");
    }
}