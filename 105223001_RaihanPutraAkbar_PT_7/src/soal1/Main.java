package soal1;

class Bangunan{
    String nama = "Bangunan Umum";
}

class GedungSekolah extends Bangunan{
    String nama = "Gedung Sekolah ABC";

    void tampilkanInfo(){
        System.out.println(super.nama);
        System.out.println(nama);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        GedungSekolah sekolah1 = new GedungSekolah();
        sekolah1.tampilkanInfo();
    }
}
