public class Main {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("-----------");

        for(int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("------------");
        //BT: Viết 1 chương trình để in ra các số từ 1 đến 100.
        //Số nào chia hết cho 3 thì in ra "Fizz"
        //Số nào chia hết cho 5 thì in ra "Buzz"
        //Số chia hết cho cả 3 và 5 thì in ra "FizzBuzz"
        for(int i = 1; i <= 100; i++) {
//            Cách 1
//            if(i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }

//            Cách 2:
            if(i % 3 == 0) {
                if(i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else {
                if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
