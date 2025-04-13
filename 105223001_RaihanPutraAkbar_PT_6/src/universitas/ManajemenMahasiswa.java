package universitas;
import java.util.ArrayList;

public class ManajemenMahasiswa{
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<Mahasiswa>();

    public void tambahMahasiswa(Mahasiswa m){
        daftarMahasiswa.add(m);
    }

    public void tampilkanSemua() {
        for (Object mahasiswa : daftarMahasiswa) {
            ((Mahasiswa) mahasiswa).tampilkanData();   
        }
    }

    public void tampilkanIPKTertinggi() {
        double IPKTerbesar = 0.0;
        Mahasiswa mahasiswaTerbaik = null;
        for (Object mahasiswa : daftarMahasiswa) {
            if (((Mahasiswa) mahasiswa).getIPK() > IPKTerbesar) {
                IPKTerbesar = ((Mahasiswa) mahasiswa).getIPK();
                mahasiswaTerbaik = (Mahasiswa) mahasiswa;
            }
        }
        System.out.println("Mahasiswa dengan IPK tertinggi: ");
        mahasiswaTerbaik.tampilkanData();
    }
}