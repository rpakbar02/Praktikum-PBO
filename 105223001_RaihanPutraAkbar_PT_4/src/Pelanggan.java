

public class Pelanggan {
    private String nama;
    private String NIK;
    private String no_hp;

    public Pelanggan(String nama, String NIK, String no_hp) {
        this.nama = nama;
        this.NIK = NIK;
        this.no_hp = no_hp;
    }

    public void getInfo(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIK : " + this.NIK);
        System.out.println("No HP : " + this.no_hp);
    }

}

class Sewa {
    private Pelanggan pelanggan;
    private Mobil mobil;
    private int durasi;
    private double total_bayar;

    public Sewa(Pelanggan pelanggan, Mobil mobil, int durasi) {
        this.pelanggan = pelanggan;
        this.mobil = mobil;
        this.durasi = durasi;
        this.total_bayar = mobil.getDailyRent() * durasi;
        this.total_bayar -= Utility.hitungDiskon(this.total_bayar, durasi);
    }

    public void prosesPenyewaan() {
        if (mobil.isTersedia()) {
            mobil.setTersedia(false);
            cetakStruk(true);
        } else {
            cetakStruk(false);
        }
    }

    private void cetakStruk(boolean sukses) {
        System.out.println("\n=== STRUK PENYEWAAN ===");
        pelanggan.getInfo();
        System.out.println("Mobil: " + mobil.getMerek() + " (" + mobil.getNomorPlat() + ")");
        System.out.println("Lama Sewa: " + durasi + " hari");
        System.out.println("Total Biaya: " + Utility.formatMataUang(total_bayar));
        if(sukses){
            System.out.println("Status: Berhasil");
        }else{
            System.out.println("Status: Gagal - Mobil tidak tersedia");
        }
    }
}
class Utility {
    public static double hitungDiskon(double total, int durasi) {
        if(durasi > 5){
            return total * 0.1;
        }else{
            return 0;
        }
    }

    public static String formatMataUang(double jumlah) {
        return String.format("Rp%1$,10.0f", jumlah);
    }
}