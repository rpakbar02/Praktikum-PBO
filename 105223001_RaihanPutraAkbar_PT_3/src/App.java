import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total belanja Anda: ");
        double belanja = input.nextDouble();
        boolean diskon = false;
        if(belanja > 500000){
            belanja -= belanja*20/100;
            diskon = true;
        }else if(belanja > 250000){
            belanja -= belanja*10/100;
            diskon = true;
        }
        
        boolean aman = true;
        while(aman){
            System.out.println("Masukkan tipe member Anda: ");
            System.out.println("1. Platinum\n2. Gold\n3.Silver\n4. Bukan member");
            int pilihan = input.nextInt();
            switch(pilihan){
                case 1:
                    belanja -= belanja*5/100;
                    diskon = true;
                    aman = false;
                    break;
                case 2:
                    belanja -= belanja*3/100;
                    diskon = true;
                    aman = false;
                    break;
                case 3:
                    belanja -= belanja*2/100;
                    diskon = true;
                    aman = false;
                    break;
                case 4:
                    aman = false;
                    break;
                default:
                    System.out.println("Input Anda tidak valid");
                    break;
            }
        }
        String status_diskon = (diskon) ? "Anda mendapatkan diskon" : "Anda tidak mendapatkan diskon";
        System.out.println(status_diskon);
        System.out.println("Total belanja Anda sekarang adalah: Rp" + belanja);
    }
}
