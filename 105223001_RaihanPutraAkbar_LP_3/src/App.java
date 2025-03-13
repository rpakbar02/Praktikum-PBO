import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int a = 0, i = 0, e = 0, u = 0, o = 0;
        Scanner input = new Scanner(System.in);
        String kalimat = input.nextLine();
        char[] kalimat_karakter;
        kalimat_karakter = new char[kalimat.length()];
        for (int j = 0; j < kalimat.length(); j++) {
            char huruf = kalimat.charAt(j);
            kalimat_karakter[kalimat.length()-1-j] = huruf;
            if(huruf == 'a'){
                a++;
            }else if (huruf == 'i') {
                i++;
            }else if (huruf == 'u') {
                u++;
            }else if (huruf == 'e') {
                e++;
            }else if (huruf == 'o') {
                o++;
            }
        }
        int vokal = (a+i+u+e+o) % 2;
        switch(vokal){
            case 0:
                System.out.println("Jumlah vokal genap");
                break;
            default:
                System.out.println("Jumlah vokal ganjil");
                break;
        }

        for (char k : kalimat_karakter) {
            System.out.print(k);
        }
    }
}
