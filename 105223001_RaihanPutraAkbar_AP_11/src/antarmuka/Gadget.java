package antarmuka;

public interface Gadget {
    void hidupkan();

    default void cekBaterai(){
        System.out.println("FULL POWAH");
    }
    static void info() {
        System.out.println("Jadi kamu sedang pake gadget");
    }
}
