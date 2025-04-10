package matakuliah;
import dosen.Dosen;
import mahasiswa.Mahasiswa;
import java.util.ArrayList;

public class Matakuliah {
    private String nama;
    private String kodeMK;
    private ArrayList<Dosen> pengampu;
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public Matakuliah(String nama, String kodeMK) {
        this.nama = nama;
        this.kodeMK = kodeMK;
        this.pengampu = new ArrayList<>();
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void setDaftarMahasiswa(ArrayList<Mahasiswa> daftarMahasiswa){
        this.daftarMahasiswa = daftarMahasiswa;
    }

    public void setPengampu(ArrayList<Dosen> pengampu){
        this.pengampu = pengampu;
    }

    public String getNama(){
        return this.nama;
    }

    public String getkodeMK(){
        return this.kodeMK;
    }

    public ArrayList<Dosen> getPengampu(){
        return this.pengampu;
    }

    public ArrayList<Mahasiswa> getDaftarMahasiswa(){
        return this.daftarMahasiswa;
    }
}
