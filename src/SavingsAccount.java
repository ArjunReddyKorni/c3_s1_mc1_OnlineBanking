import java.util.Random;

public class SavingsAccount {

    public  String getAccountNumber(){
        Random object = new Random();
        String number = "";
        for (int i = 0; i <12 ; i++)
            number = number + object.nextInt(9);


        return number;
    }


    long accountNumber;
    String holdersName;
    double balance;
    String status;

    public double withdraw(double withdrawedAmount){
       if(withdrawedAmount < balance){
     balance = balance - withdrawedAmount;}
       return balance;
    }
    public double deposit(double deposit){

     return balance = balance + deposit;
    }
    public void checkBalance(double balance){

     System.out.println("balance = " + balance);
    }
    public void status(String status){

        System.out.println("status = " + status);
    }


}
