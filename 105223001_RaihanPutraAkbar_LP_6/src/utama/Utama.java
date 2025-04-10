package utama;
import dosen.Dosen;
import java.util.ArrayList;
import mahasiswa.Mahasiswa;
import matakuliah.Matakuliah;

public class Utama {
    public static void main(String[] args) {
        Matakuliah PBO = new Matakuliah("PBO", "123");
        PBO.setDaftarMahasiswa(new ArrayList<>());
        PBO.setPengampu(new ArrayList<>());
        PBO.getPengampu().add(new Dosen("Cahya", "123"));
        PBO.getDaftarMahasiswa().add(new Mahasiswa("Tiara", "123"));
        PBO.getDaftarMahasiswa().add(new Mahasiswa("Diana", "124"));
        tampilkanData(PBO);


    }

    static void tampilkanData(Matakuliah matakuliah){
        System.out.println("Matakuliah: " + matakuliah.getNama());
        System.out.println("Kode MK: " + matakuliah.getkodeMK());
        for (int i = 0; i < matakuliah.getPengampu().size(); i++) {
            if(i == 0)System.out.println("Pengampu: ");
            System.out.println(matakuliah.getPengampu().get(i).getNama());
        }
        for (int i = 0; i < matakuliah.getDaftarMahasiswa().size(); i++) {
            if(i == 0) System.out.println("Daftar Mahasiswa: ");
            System.out.println(matakuliah.getDaftarMahasiswa().get(i).getNama());
        }
    } 
}
