import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //meminta data diri mahasiswa
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM Anda: ");
        String NIM = input.next();
        System.out.print("Masukkan Usia Anda: ");
        int usia = input.nextInt();
        System.out.print("Masukkan jumlah mata kuliah yang diambil: ");
        int banyak_matkul = input.nextInt();
        //menghitung total nilai mahasiswa
        double total_nilai = 0;
        for(int i = 0; i < banyak_matkul; i++){
            System.out.print("Masukkan nilai matkul " + (i+1) + ": ");
            total_nilai += input.nextDouble();
        }
        double IPK = (total_nilai / (banyak_matkul*100)) * 4.0;
        //mencetak evaluasi akademik mahasiswa
        System.out.println("=== Evaluasi Akademik Mahasiswa ===");
        System.out.println("Apakah mahasiswa berusia lebih dari 22 tahun? " + (usia > 22));
        System.out.println("Apakah IPK mahasiswa lebih dari atau sama dengan 3.5 dan jumlah mata kuliah lebih dari 4? " + (IPK >= 3.5 && banyak_matkul > 4));
        System.out.println("Apakah IPK mahasiswa kurang dari 2.5 atau jumlah mata kuliah kurang dari 4? " + (IPK < 2.5 || banyak_matkul < 4));
        System.out.println("===================================");
        //mencetak nomor antrian konsultasi akademik mahasiswa
        System.out.println("Nomor antrian konsultasi akademik Anda: " + (int)(Math.random() * 1000));
        //mencetak laporan akademik mahasiswa dengan format tertentu
        System.out.println("=== Laporan Akademik Mahasiswa ===");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Usia: " + usia);
        System.out.println("Banyak mata kuliah yang diambil: " + banyak_matkul);
        System.out.println("IPK: " + IPK);
        System.out.println("===================================");

        input.close();
    }
}
