package Day14.Qustion1;

public class Account {
    String accountNumber;
    double Balance;

    Account(String accountNumber){
        this.accountNumber=accountNumber;
    }

    void deposit(int amount){
        this.Balance=amount;
    }
    double  withdraw(int amount) throws InsufficientFundsException{
        if(amount>=this.Balance)  {
            InsufficientFundsException is=new InsufficientFundsException("Insificient  Balance");
            throw is;
        }else{
           double res= this.Balance-amount;
           return res;
        }


    }

}
