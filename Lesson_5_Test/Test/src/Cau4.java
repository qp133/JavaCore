public class Cau4 {
    public static void main(String[] args) {
        System.out.println("Bài 4:");
        System.out.println("10 số nguyên tố đầu tiên:");
        int max = 10;
        //Cách 1:
        int demSoNguyenTo = 0;
        int i = 0;
        while (demSoNguyenTo < max) {
            if (isPrimeNumber(i)) {
                System.out.print(i + "\t");
                demSoNguyenTo++;
            }
            i++;
        }
        System.out.println();
        //Cách 2:
//        int count = 0;
//        for (int i = 0; count < max; i++) {
//            if (isPrimeNumber(i)) {
//                System.out.println(i + "\t");
//                count++;
//            }
//        }
//        System.out.println();

        System.out.println("Các số nguyên tố nhỏ hơn 10:");
        for (int j = 0; j < max; j++) {
            if (isPrimeNumber(j)) {
                System.out.print(j + "\t");
            }
        }

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
