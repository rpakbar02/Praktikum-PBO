public class Produk {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk =  namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfoProduk(){
        System.out.println("Kode Produk: " + this.kodeProduk);
        System.out.println("Nama Produk: " + this.namaProduk);
        System.out.println("Harga: " + this.harga);
        System.out.println("Stok: " + this.stok);
    }

    public void kurangiStok(int jumlahBeli){
        this.stok = this.stok - jumlahBeli;
    }
}