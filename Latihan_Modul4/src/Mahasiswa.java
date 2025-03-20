public class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    double ipk;

    public Mahasiswa(String nama, String nim, String jurusan, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public void tampilkanInfo(){
        System.out.println("=== ==Informasi Mahasiswa== ===");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM Mahasiswa: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
    }

    public boolean cekLulus(){
        if(ipk >= 3.0){
            return true;
        }
        else{
            return false;
        }
    }
}
