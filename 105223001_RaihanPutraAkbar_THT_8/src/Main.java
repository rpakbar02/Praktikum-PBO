import account.*;
import character.*;
import java.util.Scanner;
import scenario.*;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Welcome to the Game ===");
        boolean isLogin = false;
        while (!isLogin) { 
            System.out.print("1. Sign in\n2. Sign up\n3. Exit\nYour Choice: ");
            switch (input.nextInt()) {
                case 1:
                    System.out.print("Username: ");
                    input.nextLine();
                    String username = input.next();
                    System.out.print("Password: ");
                    String password = input.next();
                    if (Account.checkAccount(username, password)) {
                        System.out.println("Login Success!");
                        isLogin = true;
                    } else {
                        System.out.println("Login Failed!");
                    }
                    break;
                case 2:
                    System.out.print("Username: ");
                    input.nextLine();
                    username = input.nextLine();
                    System.out.print("Password: ");
                    password = input.nextLine();
                    Account.addAccount(username, password);
                    System.out.println("Sign Up Success!");
                    isLogin = true;
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }    
        }
        System.out.print("Pick Your Name: ");
        String name = input.nextLine();
        System.out.print("Choose Your Job:\n1. Knight\n2. Mage\nYour Choice: ");
        int pilihan = input.nextInt();
        Player player = Karakter.CreateCharacter(pilihan, name);
        player.ShowInfo();
        Act1 act1 = new Act1(player);
    }
}