import java.util.Scanner;
import universitas.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("=== Menu ===\n1. Tambah Mahasiswa\n2. Tampilkan Semua Mahasiswa\n3. Tampilkan Mahasiswa Dengan IPK Tertinggi\n4. Keluar\nPilih: ");
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        ManajemenMahasiswa manajemenMahasiswa = new ManajemenMahasiswa();
        while (pilihan != 4) {
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String NIM = input.next();
                    input.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String programStudi = input.nextLine();
                    System.out.print("Masukkan IPK: ");
                    double IPK = input.nextDouble();
                    Mahasiswa mahasiswa = new Mahasiswa(NIM, nama, programStudi, IPK);
                    manajemenMahasiswa.tambahMahasiswa(mahasiswa);
                    break;
                case 2:
                    manajemenMahasiswa.tampilkanSemua();
                    break;
                case 3:
                    manajemenMahasiswa.tampilkanIPKTertinggi();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Mohon coba lagi.");
                    break;
            }
            System.out.print("\n=== Menu ===\n1. Tambah Mahasiswa\n2. Tampilkan Semua Mahasiswa\n3. Tampilkan Mahasiswa Dengan IPK Tertinggi\n4. Keluar\nPilih: ");
            pilihan = input.nextInt();
        }
        input.close();
    }
}
