public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Ertiga", "Red", "Maruti");
        System.out.println(car1.model + " - " + car1.color + " - " + car1.brand);

        Car car2 = new Car("XUV 500", "Black", "Mahindra");
        System.out.println(car2.model + " - " + car2.color + " - " + car2.brand);

        Car car3 = new Car("CX5", "White", "Mazda");
        System.out.println(car3.model + " - " + car3.color + " - " + car3.brand);

    }
}
