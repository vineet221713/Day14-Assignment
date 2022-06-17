package Day14.Qustion1;

public class InsufficientFundsException extends Exception{
    String massege;

    InsufficientFundsException(String massege){
        super(massege);
    }

}
