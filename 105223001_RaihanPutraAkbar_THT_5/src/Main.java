import librarysystem.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Buku buku1 = new Buku("Pemrograman Berbasis Objek", "Raihan", 2022);
        Buku buku2 = new Buku("Komputer dan Jaringan", "Herman", 2014);
        Buku buku3 = new Buku("Pemrograman Web", "Sandika", 2015);

        Perpustakaan perpustakaan = new Perpustakaan(5);

        User mahasiswa1 = new User("akbar", "12345");

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        perpustakaan.tampilkanBuku();

        mahasiswa1.pinjamBuku(buku3);
        mahasiswa1.kembalikanBuku(buku3);
    }
}
