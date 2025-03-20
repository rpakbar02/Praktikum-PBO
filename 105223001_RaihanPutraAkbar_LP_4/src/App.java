public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs1 = new Mahasiswa("Raihan Putra Akbar", "105223001", "Ilmu Komputer", 3);

        mhs1.tampilkanInfo();
        if(mhs1.cekLulus()){
            System.out.println("Mahasiswa ini lulus");
        }else{
            System.out.println("Mahasiswa ini tidak lulus");
        }
    }
}
