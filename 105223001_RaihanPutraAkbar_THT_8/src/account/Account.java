package account;
import java.util.ArrayList;
public class Account {
    private static ArrayList<String> userName = new ArrayList<>();
    private static ArrayList<String> passWord = new ArrayList<>();
    
    public static void addAccount(String username, String password){
        userName.add(username);
        passWord.add(password);
    }

    public static boolean checkAccount(String username, String password){
        for(int i = 0; i < userName.size(); i++){
            if(userName.get(i).equals(username) && passWord.get(i).equals(password)){
                return true;
            }
        }
        return false;
    }
    
}
