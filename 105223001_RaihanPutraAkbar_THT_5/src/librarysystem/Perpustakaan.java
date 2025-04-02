package librarysystem;
public class Perpustakaan {
    private Buku[] koleksiBuku;
    private int bukuTersimpan;

    public Perpustakaan(int banyakBuku){
        this.koleksiBuku = new Buku[banyakBuku];
        this.bukuTersimpan = 0;
    }
    public void tambahBuku(Buku buku){
        koleksiBuku[this.bukuTersimpan] = buku;
        this.bukuTersimpan++;
    }

    public void tampilkanBuku(){
        for(int j = 0; j < bukuTersimpan; j++){
            System.out.println((j+1) + ". " + koleksiBuku[j].getJudul() + ", " + koleksiBuku[j].getPenulis() + ", " + koleksiBuku[j].getTahunTerbit());
        }
    }
}