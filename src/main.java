public class main {
    public static void main(String[] args) {
        user_account userAccount = new user_account(10000.00); 
        atm atms = new atm(userAccount);
        atms.displayMenu();
    }
}