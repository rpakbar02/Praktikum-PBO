public class App {
    public static void main(String[] args) throws Exception {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.processPayment(50000);
        paymentMethod.processPayment(50000, "USD");
        PaymentMethod creditCard = new CreditCard();
        creditCard.processPayment(50000);
        creditCard.processPayment(50000, "JPY");
        PaymentMethod eWallet = new EWallet();
        eWallet.processPayment(50000);
        eWallet.processPayment(50000, "EUR");
        PaymentMethod bankTransfer = new BankTransfer();
        bankTransfer.processPayment(50000);
        bankTransfer.processPayment(50000, "GBP");
    }
}

class PaymentMethod{
    public void processPayment(double amount){
        System.out.println("Pembayaran senilai Rp" + amount + " Berhasil!");
    }
    public void processPayment(double amount, String currency){
        System.out.println("Pembayaran senilai "+ currency + " " + amount + " Berhasil!");
    }
}

class CreditCard extends PaymentMethod{
    @Override
    public void processPayment(double amount){
        System.out.println("Pembayaran dengan Kartu Kredit senilai Rp" + amount + " Berhasil!");
    }
    @Override
    public void processPayment(double amount, String currency){
        System.out.println("Pembayaran dengan Kartu Kredit senilai "+ currency + " " + amount + " Berhasil!");
    }
}

class EWallet extends PaymentMethod{
    @Override
    public void processPayment(double amount){
        System.out.println("Pembayaran menggunakan E-Wallet senilai Rp" + amount + " Berhasil!");
    }
    @Override
    public void processPayment(double amount, String currency){
        System.out.println("Pembayaran menggunakan E-Wallet senilai "+ currency + " " + amount + " Berhasil!");
    }
}

class BankTransfer extends PaymentMethod{
    @Override
    public void processPayment(double amount){
        System.out.println("Pembayaran melalui transfer bank senilai Rp" + amount + " Berhasil!");
    }
    @Override
    public void processPayment(double amount, String currency){
        System.out.println("Pembayaran melalui transfer bank senilai "+ currency + " " + amount + " Berhasil!");
    }
}