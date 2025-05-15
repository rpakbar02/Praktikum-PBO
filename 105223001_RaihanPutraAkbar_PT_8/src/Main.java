class Vehicle{
    void startEngine(){
        System.out.println("Mesin Nyala");
    }
}

class Car extends Vehicle{
    void startEngine(){
        System.out.println("Mesin Mobil Nyala");
    }
}

class Motorcycle extends Vehicle{
    void startEngine(){
        System.out.println("Mesin Motor Nyala");
    }
}

class Driver{
    private String name;
    private Vehicle vehicle;
    private License lisensi;
    public Driver(String name, String nolisensi, int tahunBerlaku){
        this.name = name;
        this.lisensi = new License(nolisensi, tahunBerlaku+5);
    }
    public void tambahKendaraan(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public void tampilkandata(){
        System.out.println("Nama : " + this.name);
        System.out.print("Jenis Kendaraan : ");
        if(this.vehicle instanceof Car){
            System.out.println("Mobil");
        }else if(this.vehicle instanceof Motorcycle){
            System.out.println("Motor");
        }
        this.vehicle.startEngine();
        this.lisensi.tampilkanLisensi();
    }
}

class License{
    String nolisensi;
    int tahunBerlaku;
    public License(String nolisensi, int tahunBerlaku){
        this.nolisensi = nolisensi;
        this.tahunBerlaku = tahunBerlaku;
    }
    public void tampilkanLisensi(){
        System.out.println("Nomor Lisensi : " + this.nolisensi);
        System.out.println("Lisensi Berlaku Hingga: " + this.tahunBerlaku);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Driver driver1 = new Driver("Akbar", "1234", 2022);
        Car car = new Car();
        driver1.tambahKendaraan(car);
        driver1.tampilkandata();
        Driver driver2 = new Driver("Raihan", "2345", 2023);
        Motorcycle motorcycle = new Motorcycle();
        driver2.tambahKendaraan(motorcycle);
        driver2.tampilkandata();
    }
}
