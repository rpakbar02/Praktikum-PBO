package transportasi;

public class Transportasi {
    private String nama;
    private int jumlahKursi;
    private String tujuan;

    public Transportasi(String nama, int jumlahKursi, String tujuan){
        this.nama = nama;
        this.jumlahKursi = jumlahKursi;
        this.tujuan = tujuan;
    }
    public int hitungHargaTiket(){
        return 100000;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setJumlahKursi(int jumlahKursi){
        this.jumlahKursi = jumlahKursi;
    }
    public void setTujuan(String tujuan){
        this.tujuan = tujuan;
    }
    public String getNama(){
        return nama;
    }
    public int getJumlahKursi(){
        return jumlahKursi;
    }
    public String getTujuan(){
        return tujuan;
    }
}