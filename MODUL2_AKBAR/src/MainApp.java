public class MainApp {
    public static void main (String[] args) throws Exception{
        TransportasiAir kapallAir = new TransportasiAir(50, 20000);
        kapallAir.informasi();
        kapallAir.berlabuh();
        kapallAir.berlayar();
        
        Sampan sampan1 = new Sampan(30, 25000, 2);
        sampan1.informasi();
        sampan1.berlayar();
        sampan1.berlayar(1);
        sampan1.berlabuh(2);
        System.out.println("");

        Kapal kapal1 = new Kapal(30, 40000, "Turbo");
        kapal1.informasi();
        kapal1.berlayar();
        kapal1.berlayar(30);
        kapal1.berlabuh();



    }
}
