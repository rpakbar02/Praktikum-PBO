package soal2;

class Orang{
    public Orang(){
        System.out.println("Orang dibuat!");
    }
}

class Dosen extends Orang{
    public Dosen(){
        super();
        System.out.println("Dosen dibuat!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dosen dsn1 = new Dosen();
    }
}
