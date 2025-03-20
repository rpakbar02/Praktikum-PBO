import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int umur = 20;
        double ipk = 4.0;
        char inisial = 'F';
        String nama = "Fulan";
        System.out.println("Nama: " +  nama + "Umur: " + umur + "IPK: " + ipk + "Inisial: " + inisial);

        byte nomorByte = -128;
        short nomorshort = 32767;
        long nomorlong = 100000000;
        float pi = 3_14f;

        boolean isJavafun = true;
        System.out.println(isJavafun);
        char var1 = 65;
        System.out.println(var1);
        String firstName = "Benony";
        String lastName = "Doe";
        String fullname = firstName + lastName;
        System.out.println(fullname);
        System.out.println(fullname.length());

        short widenomorByte = nomorByte;

        byte narrowingshort = (byte) nomorshort;

        String teks = "100";
        int angkaTeks = Integer.parseInt(teks);
        String teksUmur = String.valueOf(umur);

    }
}

class Input{
    public static void main(String[] args){
        System.out.println("Masukkan nama Anda: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Masukkan umur Anda: ");
        int age = input.nextInt();
        System.out.print("Masukkan tinggi badan Anda: ");
        double height = input.nextDouble();

        System.out.println("\nData yang Anda masukkan: ");
        System.out.println("Nama Anda: " + name);
        System.out.println("Umur Anda: " + age);
        System.out.println("Tinggi badan Anda: " + height);

        input.close(); 
    }

}

/*class math{
    public static void main(String[] args) {
        System.out.println(Math.max(a, b))
    }
}*/