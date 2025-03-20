public class Mobil {
    private String nomor_plat;
    private String merk;
    private int daily_rent;
    private boolean tersedia;

    public Mobil() {
        this("B 9999 BU", "Honda", 100000, true);
    }

    public Mobil(String nomor_plat, String merk, int daily_rent, boolean tersedia){
        this.nomor_plat = nomor_plat;
        this.merk = merk;
        this.daily_rent = daily_rent;
        this.tersedia = tersedia;
    }

    public void getInfo(){
        System.out.println("Nomor Plat : " + this.nomor_plat);
        System.out.println("Merk : " + this.merk);
        System.out.println("Sewa Harian : " + this.daily_rent);
        if(tersedia){
            System.out.println("Status : Tersedia");
        }else{
            System.out.println("Status : Tidak Tersedia");
        }
    }

    public String getNomorPlat(){ 
        return nomor_plat; 
    }
    public String getMerek(){
        return merk;
    }
    public int getDailyRent(){
        return daily_rent; 
    }
    public boolean isTersedia(){
        return tersedia; 
    }
    public void setTersedia(boolean tersedia){
        this.tersedia = tersedia;
    }
}
