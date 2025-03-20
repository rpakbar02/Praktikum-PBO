import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak karyawan: ");
        int banyak_karyawan = input.nextInt();
        input.nextLine();
        String[] id = new String[banyak_karyawan];
        String[] name = new String[banyak_karyawan];
        String[] Shift_kerja = new String[banyak_karyawan];
        int[] jam_kerja = new int[banyak_karyawan];
        int[] absen = new int[banyak_karyawan];
        int[] gaji = new int[banyak_karyawan];
        int[] bonus = new int[banyak_karyawan];
        int[] potongan = new int[banyak_karyawan];
        int hari_lebih = 0;
        for(int i = 0; i < banyak_karyawan; i++){
            System.out.print("Masukkan ID Karyawan " + (i+1) + ": ");
            id[i] = input.nextLine();
            System.out.print("Masukkan Nama Karyawan " + (i+1) + ": ");
            name[i] = input.nextLine();
            int shift = 0;
            while(shift < 1 || shift > 3){
                System.out.print("1. Pagi\n2. Sore\n3. Malam\nPilih Shift Kerja minggu ini: ");
                shift = input.nextInt();
                input.nextLine();
                if(shift < 1 || shift>3){
                    System.out.println("Masukan Anda tidak valid!");
                }
            }
            jam_kerja[i] = -1;
            bonus[i] = 0;
            potongan[i] = 100;
            while(jam_kerja[i]<0 || jam_kerja[i] > 60){
                System.out.print("Masukkan total jam kerja minggu ini: ");
                jam_kerja[i] = input.nextInt();
                input.nextLine();
                if(jam_kerja[i]<0 || jam_kerja[i] > 60){
                    System.out.println("Masukan Anda tidak valid!");    
                }
                if(jam_kerja[i] > 40){
                    hari_lebih = jam_kerja[i] - 40;
                    bonus[i] = (jam_kerja[i] - 40) * 600;
                }
                if(jam_kerja[i] < 30){
                    potongan[i] = 90;
                }
            }
            absen[i] = -1;
            while(absen[i] < 0 || absen[i] > 5){
                System.out.print("Masukkan banyak hari absen tanpa kabar: ");
                absen[i] = input.nextInt();
                input.nextLine();
                if(absen[i] < 0 || absen[i] >5){
                    System.out.println("Masukan Anda tidak valid!"); 
                }
            }
            switch(shift){
                case 1:
                    gaji[i] = potongan[i] * (400 * (jam_kerja[i]-hari_lebih) - (absen[i] * 1000) + bonus[i]);
                    Shift_kerja[i] = "Pagi";
                    break;
                case 2:
                    gaji[i] = potongan[i] * (450 * (jam_kerja[i]-hari_lebih) - (absen[i] * 1000) + bonus[i]);
                    Shift_kerja[i] = "Sore";
                    break;
                case 3:
                    gaji[i] = potongan[i] * (500 * (jam_kerja[i]-hari_lebih) - (absen[i] * 1000) + bonus[i]);
                    Shift_kerja[i] = "Malam";
                    break;
                default:
                    break;
            }
        }
        for(int j = 0; j < banyak_karyawan; j++){
            System.out.println("=== == Slip Gaji Mingguan == ===");
            System.out.println("ID Karyawan: " + id[j]);
            System.out.println("Nama Karyawan: " + name[j]);
            System.out.println("Shift Kerja: " + Shift_kerja[j]);
            System.out.println("Total Jam Kerja: " + jam_kerja[j]);
            System.out.println("Total Absen: " + absen[j]);
            System.out.println("Gaji: Rp" + gaji[j]);
            System.out.println("=================================");
        }
    }
}

/*
 
Anda diminta untuk membuat program yang menghitung gaji karyawan di sebuah pabrik yang memiliki sistem kerja dalam tiga shift: pagi, siang, dan malam. Setiap karyawan memiliki jam kerja yang berbeda-beda dalam seminggu dan bisa saja mengalami lembur atau bahkan absen. Gaji dihitung berdasarkan jumlah jam kerja dalam seminggu, dengan tarif per jam yang berbeda tergantung pada shift kerja. Jika karyawan bekerja lebih dari 40 jam, maka kelebihan jam dihitung sebagai lembur dengan bayaran lebih tinggi. Sebaliknya, jika mereka bekerja kurang dari 30 jam dalam seminggu, gaji mereka akan dipotong sebesar 10%. Selain itu, jika karyawan tidak masuk kerja tanpa alasan, mereka akan dikenakan potongan gaji sebesar Rp100.000 per hari absen.

Tugas Anda adalah membuat program yang dapat mencatat data karyawan seperti ID, nama, shift kerja, total jam kerja dalam seminggu, serta jumlah hari absen. Program ini juga harus menghitung total gaji mereka setelah mempertimbangkan upah, lembur, dan potongan yang berlaku. Gunakan perulangan untuk meminta data dari pengguna, lalu gunakan aturan yang sesuai untuk menghitung gaji. Pastikan program dapat menangani kesalahan input, seperti jika pengguna memasukkan jam kerja yang tidak masuk akal atau jumlah hari absen yang berlebihan. Setelah semua data dimasukkan, program harus menampilkan laporan gaji yang rapi dan mudah dibaca.

 */