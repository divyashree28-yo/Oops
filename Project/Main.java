import transaction.Account;
import reports.TransactionReport;
public class Main
{
public static void main(String args[])
{
Account a=new Account("KA101",10000);
a.deposit(1000);
a.withdwar(500);
TransactionReport r=new TransactionReport();
r.generateReport(a);
}
}