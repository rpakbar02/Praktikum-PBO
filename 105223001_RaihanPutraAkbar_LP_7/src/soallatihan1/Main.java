package soallatihan1;

class Hewan{
    String suara = "Suara hewan";
}

class Kucing extends Hewan{
    String suara = "Meong";
    void tampilkanSuara(){
        System.out.println("Suara milik kelas Hewan: " + super.suara);
        System.out.println("Suara milik kelas Kucing:" + suara);
    }
}
public class Main{
    public static void main(String[] args) {
        Kucing emeng1 = new Kucing();
        emeng1.tampilkanSuara();;
    }
}