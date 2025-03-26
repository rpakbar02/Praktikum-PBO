public class Transaksi {
    private String idTransaksi;
    private Pelanggan pelanggan;
    private Produk produk;
    private int jumlahBeli;
    private double totalHarga;

    public Transaksi(String idTransaksi, Pelanggan pelanggan, Produk produk, int jumlahBeli) {
        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.produk = produk;
        this.jumlahBeli = jumlahBeli;
        this.totalHarga = produk.harga * jumlahBeli;
    }

    public void prosesTransaksi(){
        if(pelanggan.saldo >= totalHarga){
            if(produk.stok >= jumlahBeli){
                pelanggan.kurangiSaldo(totalHarga);
                produk.kurangiStok();
                System.out.println("Transaksi berhasil dilakukan!");
            }else{
                System.out.println("Stok produk tidak cukup!");
            }
        }else{
            System.out.println("Saldo pelanggan tidak cukup!");
        }
    }

    public void tampilkanDetailTransaksi(){
        System.out.println("ID Transaksi: " + this.idTransaksi);
        System.out.println("ID Pelanggan: " + this.pelanggan.idPelanggan);
        System.out.println("Nama: " + this.pelanggan.nama);
        System.out.println("Email: " + this.pelanggan.email);
        System.out.println("Saldo: " + this.pelanggan.saldo);
        System.out.println("Kode Produk: " + this.produk.kodeProduk);
        System.out.println("Nama Produk: " + this.produk.namaProduk);
        System.out.println("Harga: " + this.produk.harga);
        System.out.println("Jumlah Beli: " + this.jumlahBeli);
        System.out.println("Total Harga: " + this.totalHarga);
    }
}
