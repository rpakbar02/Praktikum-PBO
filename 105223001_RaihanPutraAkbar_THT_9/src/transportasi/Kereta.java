package transportasi;

public class Kereta extends Transportasi {
    public Kereta(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }
    @Override
    public int hitungHargaTiket(){
        return super.hitungHargaTiket() * 120 / 100;
    }
    public int hitungHargaTiket(String kelasLayanan){
        if(kelasLayanan.equals("VIP")){
            return (super.hitungHargaTiket() * 120 / 100) * 150 /100;
        }else if(kelasLayanan.equals("Bisnis")){
            return (super.hitungHargaTiket() * 120 / 100) * 125 / 100;
        }else{
            return super.hitungHargaTiket() * 120 / 100;
        }
    }
}
