package Agregasi;

import java.util.ArrayList;

class Mahasiswa{
    String nama;
    Mahasiswa(String nama){
        this.nama = nama;
    }
}
class Universitas{
    String nama;
    ArrayList<Mahasiswa> daftarMahasiswa=new ArrayList<>();
    Universitas(String nama){
        this.nama = nama;
    }

    void tambahMahasiswa(Mahasiswa mhs){
        daftarMahasiswa.add(mhs);
    }
    void showMahasiswa(){
        System.out.println("Daftar Mahasiswa di " + nama + ":");
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println(mhs.nama);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Budi");
        Mahasiswa mhs2 = new Mahasiswa("Siti");
        Mahasiswa mhs3 = new Mahasiswa("Andi");

        Universitas univ = new Universitas("Universitas ABC");
        univ.tambahMahasiswa(mhs1);
        univ.tambahMahasiswa(mhs2);
        univ.tambahMahasiswa(mhs3);

        univ.showMahasiswa();
    }
}
