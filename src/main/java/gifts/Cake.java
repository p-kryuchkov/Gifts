package gifts;

public class Cake extends Gift {
    private String manufacturer;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Cake(String name, double price, double weight, String manufacturer) {
        super(name, price, weight);
        this.manufacturer = manufacturer;

    }

    @Override
    public String toString() {
        return "Торт " + super.toString() + " Производитель: " + manufacturer;
    }
}
