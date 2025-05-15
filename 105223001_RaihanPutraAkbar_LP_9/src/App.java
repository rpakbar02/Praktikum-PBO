class Animal{
    private HealthRecord healthRecord;
    public Animal(String noRekam, String tanggal){
        this.healthRecord = new HealthRecord(noRekam, tanggal);
    }
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
    public HealthRecord getHealthRecord(){
        return healthRecord;
    }
}

class Dog extends Animal{
    private HealthRecord healthRecord;
    public Dog(String noRekam, String tanggal){
        super(noRekam, tanggal);
    }
    public void makeSound(){
        System.out.println("Guk-Guk!");
    }
}

class Cat extends Animal{
    private HealthRecord healthRecord;
    public Cat(String noRekam, String tanggal){
        super(noRekam, tanggal);
    }
    public void makeSound(){
        System.out.println("Meong!");
    }
}

class HealthRecord{
    String noRekam;
    String tanggal;
    public HealthRecord(String noRekam, String tanggal){
        this.noRekam = noRekam;
        this.tanggal = tanggal;
    }
    public void printHealthRecord(){
        System.out.println("No rekam: " + noRekam + "\nTanggal: " + tanggal);
    }
}

class Owner{
    private String nama;
    private Animal peliharaan;
    public Owner(String nama){
        this.nama = nama;
    }

    public void tambahPeliharaan(Animal peliharaan){
        this.peliharaan = peliharaan;
    }

    public void tampilkanJenisPeliharaan(){
        if (peliharaan instanceof Dog) {
            System.out.println("Jenis peliharaan: Dog");
        } else if (peliharaan instanceof Cat) {
            System.out.println("Jenis peliharaan: Cat");
        }
    }

    public void tampilkanNamaPemilik(){
        System.out.println("Nama pemilik: " + nama);
    }

    public Animal getPeliharaan(){
        return peliharaan;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Dog dog1 = new Dog("01", "2023-01-01");
        Cat cat1 = new Cat("02", "2023-01-01");
        Owner owner1 = new Owner("John");
        owner1.tambahPeliharaan(cat1);
        owner1.tambahPeliharaan(dog1);
        owner1.tampilkanNamaPemilik();
        owner1.getPeliharaan().makeSound();
        owner1.tampilkanJenisPeliharaan();
        owner1.getPeliharaan().getHealthRecord().printHealthRecord();
    }
}
