package ClassObekt;

public class BankAccount {
    int id = 10;
    String name = "Peter";
    double ballance = 100;

}
class BankAccountTest{
    public static void main(String[] args){

            BankAccount MyAccount = new BankAccount();
            BankAccount YorAccount = new BankAccount();
            BankAccount HisAccount = new BankAccount();

            MyAccount.id = 1;
            MyAccount.name = "Sergey";
            MyAccount.ballance = 11.512;

            YorAccount.id = 2;
            YorAccount.name = "Ivan";
            YorAccount.ballance = 10.59;

            HisAccount.id = 3;
            HisAccount.name = "Andrey";
            HisAccount.ballance = 8.40;

            System.out.println(MyAccount.name);
            System.out.println(MyAccount.name);







    }
}




