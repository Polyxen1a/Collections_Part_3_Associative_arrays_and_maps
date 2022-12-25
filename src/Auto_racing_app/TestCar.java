package Auto_racing_app;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car.Builder().setBrand("audi").build();
        Car car2 = new Car.Builder().setBrand("audi").setModel("Q6").build();
        System.out.println(car);
        System.out.println(car2);
    }
}
