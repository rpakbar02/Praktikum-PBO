package Komposisi;

class Kamar{
    String tipe;
    public Kamar(String tipe){
        this.tipe = tipe;
    }

    void lihatTipe(){
        System.out.println("Tipe Kamar: " + tipe);
    }
}
class Rumah{
    private Kamar kamar;
    Rumah(){
        kamar = new Kamar("Kamar Tidur");
    }

    void lihatKamar(){
        System.out.println("Tipe Kamar: " + kamar.tipe);
    }
}
public class Main {
    public static void main(String[] args) {
        Rumah rumah = new Rumah();
        rumah.lihatKamar();


    }
}
