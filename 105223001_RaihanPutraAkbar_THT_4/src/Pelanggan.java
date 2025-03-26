
public class Pelanggan {
    String idPelanggan;
    String nama;
    String email;
    double saldo;

    public Pelanggan(String idPelanggan, String nama, String email, double saldo) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.email = email;
        this.saldo = saldo;
    }

    public void tampilkanInfoPelanggan(){
        System.out.println("ID Pelanggan: " + this.idPelanggan);
        System.out.println("Nama: " + this.nama);
        System.out.println("Email: " + this.email);
        System.out.println("Saldo: " + this.saldo);
    }

    public void topUpSaldo(double saldo){
        this.saldo = saldo + this.saldo;
    }

    public void kurangiSaldo(double saldo){
        this.saldo = this.saldo - saldo;
    }
}
