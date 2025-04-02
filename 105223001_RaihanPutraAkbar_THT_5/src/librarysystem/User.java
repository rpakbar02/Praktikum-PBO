package librarysystem; 
public class User{
    private String nama;
    private String idUser;

    public User(String nama, String idUser) {
        this.nama = nama;
        this.idUser = idUser;
    }

    public void pinjamBuku(Buku buku){
        buku.pinjamBuku(buku);
    }

    public void kembalikanBuku(Buku buku){
        buku.kembalikanBuku(buku);
    }
}