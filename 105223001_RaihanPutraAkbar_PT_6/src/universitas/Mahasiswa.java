package universitas;

public class Mahasiswa {
    private String NIM;
    private String nama;
    private String programStudi;
    private double IPK;
    
    public Mahasiswa(String NIM, String nama, String programStudi, double IPK) {
        this.NIM = NIM;
        this.nama = nama;
        this.programStudi = programStudi;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return nama;
    }

    public String getProgramStudi(){
        return programStudi;
    }

    public double getIPK() {
        return IPK;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }   

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public void tampilkanData(){
        System.out.println("---Data Mahasiswa---");
        System.out.println("NIM: " + getNIM());
        System.out.println("Nama: " + getNama());
        System.out.println("Prodi: " + getProgramStudi());
        System.out.println("IPK: " + getIPK());
        System.out.println("-------------------");
    }
}