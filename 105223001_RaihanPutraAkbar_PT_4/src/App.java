public class App {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("BM 5468 HJ", "Toyota Avanza", 100000, true);
        Mobil mobil2 = new Mobil("B 1532 BU", "Honda Brio", 150000, false);

        Pelanggan pelanggan1 = new Pelanggan("Akbar", "147201472099", "082288369020");

        System.out.println("=== == Daftar Mobil == ===");
        mobil1.getInfo();
        mobil2.getInfo();

        Sewa sewa1 = new Sewa(pelanggan1, mobil1, 6);
        sewa1.prosesPenyewaan();

        System.out.println("\nStatus Mobil Setelah Penyewaan:");
        mobil1.getInfo();

        Sewa sewa2 = new Sewa(pelanggan1, mobil2, 5);
        sewa2.prosesPenyewaan();
    }
}
