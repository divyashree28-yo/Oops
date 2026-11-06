package reports;
import transaction.Account;
public class TransactionReport
{
public void generateReport(Account a)
{
System.out.println("\n Transaction report");
a.display();
}
}