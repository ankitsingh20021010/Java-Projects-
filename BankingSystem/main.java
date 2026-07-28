
import java.util.*;

class main{
    public static void main(String[] args) {
       System.out.println("code run successfully"); 
       Scanner sc=new Scanner(System.in);
       Account a1=new Account();
       Account a2=new Account();
       Account a3=new Account();
       a1.account_number="6392887349";
       a1.phone_number=638843615L;
       a1.balanace=100;
       a1.account_info();
       a1.Withdrawl(700);
       a1.checkbalance();
       a1.deposit(10000);
    }
}
