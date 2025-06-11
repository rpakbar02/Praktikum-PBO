public class App {
    public static void main(String[] args) throws Exception {
        Kendaraan kendaraan = new MobilPribadi("B 1234 XY", "Honda", 2010);
        kendaraan.tampilkanInfo();
        kendaraan.perluSupir();
        kendaraan.hitungBiayaSewa(5);

        Kendaraan kendaraan2 = new Bus("B 1234 XY", "Honda", 2010);
        kendaraan2.tampilkanInfo();
        kendaraan2.perluSupir();
        kendaraan2.hitungBiayaSewa(5);

        Kendaraan kendaraan3 = new Truk("B 1234 XY", "Honda", 2010);
        kendaraan3.tampilkanInfo();
        kendaraan3.perluSupir();
        kendaraan3.hitungBiayaSewa(5);
        if (kendaraan3 instanceof Truk truk) {
            System.out.println("Kapasistas Muatan: " + truk.kapasitasMuatan());   
        }
    }
}
