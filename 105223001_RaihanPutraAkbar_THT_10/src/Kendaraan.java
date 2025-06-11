public abstract class Kendaraan {
    protected String plat;
    protected String merk;
    protected  int tahunProduksi;

    public Kendaraan(String plat, String merk, int tahunProduksi) {
        this.plat = plat;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }
    public void tampilkanInfo(){
        System.out.println("Plat: " + plat);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }

    public abstract void hitungBiayaSewa(int hari);
    public abstract void perluSupir();
}