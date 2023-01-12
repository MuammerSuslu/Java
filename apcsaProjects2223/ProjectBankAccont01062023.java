package apcsaProjects2223;

public class ProjectBankAccont01062023
{
    String accountholder;
    int accountnumber;
    double balance;
    public double checkingBalance()
    {
        return balance;
    }
    public String withdraw(double withdrawAmount)
    {
        balance = balance-withdrawAmount;
        return "you have been withdraw "+withdrawAmount+" dollars your current balance is "+balance;
    }
}
