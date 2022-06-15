import java.util.Random;

public class Cau3 {
    public static void main(String[] args) {
        System.out.println("Bài 3: ");
        Random rd = new Random();
        int randomNumbers = rd.nextInt();
        System.out.println("Số ngẫu nhiên: " + randomNumbers);
        System.out.println("Số ngẫu nhiên " + randomNumbers + (isPrimeNumber(randomNumbers) ? " là số nguyên tố" : " không là số nguyên tố"));

        System.out.println();
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
