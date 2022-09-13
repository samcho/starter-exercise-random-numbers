import java.util.Random;

public class Random_Numbers {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Number: " + Math.abs(r.nextInt()));
    }
}
