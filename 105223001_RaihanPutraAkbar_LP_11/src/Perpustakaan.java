import java.util.Scanner;

class InputNotValid extends Exception {
    public InputNotValid(String message) {
        super(message);
    }
}

public class Perpustakaan {
    static String[] IDBuku = {"B001", "B002", "B003"};
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Masukkan nama Anda: ");
            String nama = input.nextLine();
            if(nama.isEmpty()){
                throw new InputNotValid("Nama tidak boleh kosong!");
            }
            System.out.println("Daftar buku: ");
            for (int i = 0; i < IDBuku.length; i++) {
                System.out.println(IDBuku[i]);
            }
            System.out.println("Masukkan ID buku yang ingin dipinjam: ");
            String ID = input.nextLine();
            boolean jumpa = false;
            for(int i = 0; i < IDBuku.length; i++){
                if(ID.equals(IDBuku[i])){
                    jumpa = true;
                }
            }
            if(!jumpa){
                throw new InputNotValid("ID buku tidak ditemukan");
            }
            System.out.println("Masukkan lama peminjaman: ");
            int lama = input.nextInt();
            if(lama < 0){
                throw new InputNotValid("Lama peminjaman tidak boleh negatif!");
            }
            else if(lama > 14){
                throw new InputNotValid("Lama peminjaman tidak boleh melebihi 14 hari!");
            }
        } catch (InputNotValid e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            System.out.println("Terjadi kesalahan. Silahkan lakukan penginputan ulang! ");
            input.close();
        }
    }
}
