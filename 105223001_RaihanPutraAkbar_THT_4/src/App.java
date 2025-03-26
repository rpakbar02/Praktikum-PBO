public class App {
    public static void main(String[] args) throws Exception {
        Pelanggan pelanggan1 = new Pelanggan("C001", "Akbar Putra", "akbar@google.com", 10000000);

        pelanggan1.tampilkanInfoPelanggan();

        Produk produk1 = new Produk("P001", "Laptop", 5000000, 10);

        produk1.tampilkanInfoProduk();
        
        Transaksi transaksi1 = new Transaksi("T001", pelanggan1, produk1, 3);

        transaksi1.prosesTransaksi();
        transaksi1.tampilkanDetailTransaksi();
    }
}
