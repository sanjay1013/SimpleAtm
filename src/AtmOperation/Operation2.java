package AtmOperation;
import java.util.Scanner;
public class  Operation2  extends OperationAtm implements Process1Atm
{
double balance=0;
static long amount; //For deposit
static long amt; //For withdraw
public void deposit()
{

balance=balance+amount;
System.out.println("************************************************");
System.out.println("Deposited :"+amount);
System.out.println("*************************************************");
}
public void withdrawl()
{
if(balance>=amt&&amt>0)
{
balance=balance-amt;
System.out.println("****************************************");
System.out.println("Withdrawn :"+amt);
System.out.println("**************************************");
} 
else
{ 
System.out.println("***************************************");
System.out.println(" INSUFFICIENT BALANCE");
System.out.println("***************************************");
} 
}
public void CheckBalance()
{
System.out.println("***********************************************");
System.out.println("Balance :"+balance);
System.out.println("***********************************************");
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Operation2 b=new Operation2();
b.details();
char ch;
do
{
System.out.println("**********WELCOME**********");
System.out.println("A. Display Account Details");
System.out.println("B. Deposit");
System.out.println("C. Withdrawl");
System.out.println("D. Check Balance");
System.out.println("E. Exit");
System.out.println("Enter Your Choice");
ch=sc.next().charAt(0);
switch(ch)
{
case 'A':
{
b.display();
break;
}
case 'B':
{
System.out.println("Enter the Amount to Deposit :");
amount=sc.nextLong();
b.deposit();
System.out.println("***********************************");
break;
}
case 'C':
{
System.out.println("Enter the Amount to Withdraw :");
amt=sc.nextLong();
b.withdrawl();
System.out.println("***********************************");
break;
}
case 'D':
{
b.CheckBalance();
System.out.println("***********************************");
break;
}
case 'E':
{
System.out.println("---------------------------------");
System.out.println("******THANK YOU!! ******");
System.out.println("---------------------------------");
break;
}
}
} while(ch!='E');
sc.close(); // for scanner class(it is not an issue)
}
}




