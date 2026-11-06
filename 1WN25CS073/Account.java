package transaction;
public class Account
{
String acc_num;
double balance;
public Account(String acc_num,double balance)
{
this.acc_num=acc_num;
this.balance=balance;
}
public void deposit(double amount)
{
balance=balance+amount;
System.out.println("Deposited="+amount);
}
public void withdraw(double amount)
{
if(amount<=balance)
{
balance=balance-amount;
System.out.println("Withdrawed="+amount);
}
else
{
System.out.println("Insufficient balance");
}
}
public void display()
{
System.out.println("Account number:"+acc_num);
System.out.println("Balance:"+balance);
}
}