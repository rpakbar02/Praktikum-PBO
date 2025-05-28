import java.util.ArrayList;
import transportasi.*;
public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Transportasi> daftarTransportasi = new ArrayList<>();

        Transportasi transport1 = new Pesawat("Pesawat", 100, "Jakarta");
        Transportasi transport2 = new Kereta("Kereta", 100, "Bandung");
        Transportasi transport3 = new Bus("Bus", 40, "Pekanbaru");

        daftarTransportasi.add(transport1);
        daftarTransportasi.add(transport2);
        daftarTransportasi.add(transport3);

        if(transport1 instanceof Pesawat pesawat) {
            System.out.println(pesawat.getNama() + " ke " + pesawat.getTujuan() + " - Harga tiket (default): " + pesawat.hitungHargaTiket());
            System.out.println(pesawat.getNama() + " ke " + pesawat.getTujuan() + " - Harga tiket (Ekonomi): " + pesawat.hitungHargaTiket("Ekonomi")); 
        }
        if(transport2 instanceof Kereta kereta) {
            System.out.println(kereta.getNama() + " ke " + kereta.getTujuan() + " - Harga tiket (default): " + kereta.hitungHargaTiket());
            System.out.println(kereta.getNama() + " ke " + kereta.getTujuan() + " - Harga tiket (Bisnis): " + kereta.hitungHargaTiket("Bisnis")); 
        }
        if(transport3 instanceof Bus bus) {
            System.out.println(bus.getNama() + " ke " + bus.getTujuan() + " - Harga tiket (default): " + bus.hitungHargaTiket());
            System.out.println(bus.getNama() + " ke " + bus.getTujuan() + " - Harga tiket (VIP): " + bus.hitungHargaTiket("VIP")); 
        }
    }
}
