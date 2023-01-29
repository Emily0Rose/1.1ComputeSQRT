import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        double n = sc.nextDouble();
        double guess = n / 2;   // n/2 is an initial guess
        double r;

        // loop start
        boolean check = true;
        while(check) {
            double prev = guess;
            r = n / guess;
            guess = (guess + r) / 2;    
            if(Math.abs(guess - prev) < 0.01) check = false;
        }

        BigDecimal bd = new BigDecimal(String.valueOf(guess));
        BigDecimal bd2 = bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println(bd2.doubleValue());

        sc.close();
    }
}
