    public class Account {
        String account_number;
        long phone_number;
        String type=" Saving";
        double balanace;
        void Withdrawl(double amount){
            if(amount<= balanace){
        balanace=balanace - amount;
        System.out.println("withdrawl successfull!");
        System.out.println("current balance is: "+ balanace);
            }
            else{
    System.out.println("Insufficient Balance");
}
            System.out.println("------------");
        }
        void deposit(double amount){
        if(amount>0){
            balanace+=amount;
            System.out.println("Balance Deposit");
            System.out.println("current balace is :"+ balanace);
        }
        }
        void checkbalance(){
            System.out.println("balance is :"+ balanace);
        }
        void account_info(){
       System.err.println("Account number : "+ account_number);            
       System.out.println("Phone no:- "+ phone_number);
       System.out.println("Account type "+ type);
       System.out.println("Balance:"+ balanace);
       System.out.println("----------------");

        }
    }
