package soal3;

class Produk{
    int harga = 10000;
}

class Buku extends Produk{
    int harga = 25000;

    public void bandingkanHarga(){
        System.out.println("Harga buku: " + harga);
        System.out.println("Harga Produk: " + super.harga);
    }
}

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.bandingkanHarga();
    }
}
