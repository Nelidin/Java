package home_work.Seminar_6;

public class Brand {
    private String brand;

    public Brand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Бренд = " + brand;
    }
}