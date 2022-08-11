import java.util.Random;

public class AccountNumber {

    public static void main(String[] args) {
        
        Math.random();
        Random object = new Random();

       // System.out.println("Math.random()*100000000000L = " + Math.random()*100000000000L);
        String number = "";
        for (int i = 0; i < 12; i++) {
            System.out.print(object.nextLong(9));
            number = number + object.nextInt(9);
            System.out.println("number = " + number);
        }

    }
   
}
