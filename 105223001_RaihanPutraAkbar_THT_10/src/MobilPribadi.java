public class MobilPribadi extends Kendaraan implements DapatDisewa{

    public MobilPribadi(String plat, String merk, int tahunProduksi) {
        super(plat, merk, tahunProduksi);
    }
    public void hitungBiayaSewa(int hari) {
        System.out.println("Biaya sewa mobil pribadi: " + (hari * 100000) + " rupiah");
    }

    public void perluSupir() {
        System.out.println("Mobil pribadi perlu supir");
    }

}

class Bus extends Kendaraan implements DapatDisewa{

    public Bus(String plat, String merk, int tahunProduksi) {
        super(plat, merk, tahunProduksi);
    }

    public void hitungBiayaSewa(int hari) {
        System.out.println("Biaya sewa bus: " + (hari * 150000) + " rupiah");
    }

    public void perluSupir() {
        System.out.println("Bus perlu supir");
    }
}

class Truk extends Kendaraan implements DapatDisewa, Muatan{

    public Truk(String plat, String merk, int tahunProduksi) {
        super(plat, merk, tahunProduksi);
    }

    public void hitungBiayaSewa(int hari) {
        System.out.println("Biaya sewa truk: " + (hari * 200000) + " rupiah");
    }

    public void perluSupir() {
        System.out.println("Truk perlu supir");
    }

    public double kapasitasMuatan() {
        return 1000;
    }
}
