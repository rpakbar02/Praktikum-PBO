class Kendaraan{
    String merk = "Honda Jazz";

    Kendaraan(){
        System.out.println("Kendaraan dibuat (kons parent)");
    }
    void jalan(){
        System.out.println("Kendaraan berjalan di jalan raya");
    }
}

class Mobil extends Kendaraan{
    Mobil(){
        super();
        System.out.println("Mobil dibuat (kons child)");
    }
    void printInfo(){
        System.out.println("Merk mobil: " + super.merk);
        System.out.println("Merk mobil: " + this.merk);
    }
    void klakson(String merk){
        System.out.println("Mobil klakson dari " + super.merk);
        System.out.println("Mobil klakson dari " + merk);
    }
}

public class Main{
    public static void main (String[] args) {
        Mobil jazz = new Mobil();
        jazz.jalan();
        jazz.klakson("Toyota Avanza");
        System.out.println("Merk mobil: " + jazz.merk);
    }
}