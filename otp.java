import java.util.Random;

public class otp {
    public static void main(String[] args) {
        
        int number ;
        Random random = new Random();
        number = random.nextInt(999abc);

        System.out.println("Your OTP is " +number);
    }
}
