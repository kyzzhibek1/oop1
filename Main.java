public class Main {
    public static void main(String[] args){

        PersonalAccount logIn = new PersonalAccount(123456, "Jibek Kanybekova");

        logIn.deposit(10000);
        logIn.getBalance();
        logIn.withdraw(1234);
        logIn.getBalance();
        logIn.getAccountHolder();
        logIn.getAccountNumber();
        logIn.printTransactionHistory();
    }
}