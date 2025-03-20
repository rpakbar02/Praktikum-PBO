import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //nomor 1
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Usia: ");
        int usia = input.nextInt();
        System.out.print("Masukkan jumlah uang yang dimiliki: Rp");
        double jumlah_uang = input.nextInt();
        System.out.print("Masukkan rata-rata pengeluaran harian: Rp");
        int pengeluaran = input.nextInt();
        //nomor 2
        double castusia = usia;
        int cast_jumlah_uang = (int) jumlah_uang;
        //nomor 3
        String status;
        double bulan_bertahan = jumlah_uang/(pengeluaran * 30);
        if(bulan_bertahan < 1){
            status = "PERINGATAN: Keuangan Anda kurang stabil!";
            System.out.println(status);
        }else if(jumlah_uang/(pengeluaran * 30) > 6){
            status = "Keuangan Anda dalam kondisi aman";
            System.out.println(status);
        }else{
            status = "Keuangan Anda dalam kondisi kurang aman";
            System.out.println(status);
        }
        //nomor 4
        System.out.println("Apakah usia lebih dari 30? " + (usia > 30));
        System.out.println("Apakah usia > 30 dan uang > 10 juta? " + (usia > 30 && jumlah_uang > 10000000));
        System.out.println("Apakah usia < 30 atau uang > 5 juta? " + (usia < 30 || jumlah_uang > 5000000));
        //nomor 5
        System.out.print("Masukkan banyaknya hutang: Rp");
        double hutang = input.nextDouble();
        hutang = Math.abs(hutang);
        System.out.println("Nilai mutlak hutang: " + hutang);
        double pengeluaran_after_ceil = Math.ceil(pengeluaran);
        System.out.println("Pembulatan pengeluaran harian: " + pengeluaran_after_ceil);
        int bonus_tak_terduga = (int) ((Math.random()) * 900001 + 100000);
        System.out.println("Bonus tak terduga: " + bonus_tak_terduga);
        //nomor 6
        System.out.println("=== LAPORAN KEUANGAN PRIBADI ===");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " Tahun");
        System.out.println("Uang yang dimiliki: Rp" + jumlah_uang);
        System.out.println("Pengeluaran harian rata-rata: Rp" + pengeluaran);
        double sisa = jumlah_uang - (pengeluaran * 30);
        System.out.println("Sisa uang dalam 30 hari: Rp" + sisa);
        System.out.println("Estimasi bulan bertahan: " + bulan_bertahan + "bulan");
        System.out.println("Status Keuangan: " + status);
        System.out.println("Nilai absolut dari hutang: Rp" + hutang);
        System.out.println("Pengeluaran harian setelah pembulatan: Rp" + pengeluaran_after_ceil);
        System.out.println("Bonus tak terduga: Rp" + bonus_tak_terduga);
        System.out.println("Total uang yang dimiliki setelah penambahan bonus: Rp" + (sisa + bonus_tak_terduga));
    }
}
