import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Masukkan nama Anda: ");
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        System.out.print("Masukkan NIM Anda: ");
        String nim = input.next();
        System.out.print("Masukkan usia Anda: ");
        int usia = input.nextInt();
        System.out.print("Masukkan tinggi badan Anda: ");
        double tinggi = input.nextDouble();
        System.out.println("Nama: " + nama + "\nNIM: " + nim + "\nUsia: " + usia + " tahun\nTinggi badan: " + tinggi + "cm");

        System.out.print("(usia*2) + 10/5 -3 = ");
        System.out.println((usia*2) + 10/5 - 3);
        System.out.println(usia>18);
        System.out.println(usia>18 && tinggi > 160);
        double castdouble = usia;
        int castint = (int) tinggi;
        System.out.println("Hasil casting int ke double: " + castdouble + "\nHasil casting double ke int: " + castint);
    }
}
