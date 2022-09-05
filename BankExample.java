class Banking
{
    void addAmount() // reuse this method in currentAccount class & SavingAccount
    {
        System.out.println("Amount is Added in Account");
    }
}
class CurrentAccount extends Banking
{

}
class SavingAccount extends Banking
{

}

public class BankExample {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.addAmount();
        CurrentAccount c = new CurrentAccount();
        c.addAmount();
    }
}
