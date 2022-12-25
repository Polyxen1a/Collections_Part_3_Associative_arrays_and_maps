package Auto_racing_app;

public class Car {
    private final String model;
    private final String brand;

    public Car(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public static class Builder {
        private String model;
        private String brand;

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Car build() {
            return new Car(model, brand);
        }

    }
}
