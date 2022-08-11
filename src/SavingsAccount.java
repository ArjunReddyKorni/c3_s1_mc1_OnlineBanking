import java.util.Random;

public class SavingsAccount {

    public  long getAccountNumber(){
        Random object = new Random();
        long number;
        for (int i = 0; i <12 ; i++) {
            number = object.nextLong(9);

        }
        return number;
    }


    long accountNumber;
    String holdersName;
    double balance;
    String status;

    public double withdraw(double balance){
       double withdrawedAmount;
     return balance - withdrawedAmount;
    }
    public double deposit(double balance){
       double deposit;
     return balance + deposit;
    }
    public void checkBalance(double balance){

     System.out.println("balance = " + balance);
    }
    public void status(String status){
     System.out.println("status = " + status);
    }

}
