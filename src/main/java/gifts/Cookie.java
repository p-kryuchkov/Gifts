package gifts;

public class Cookie extends Gift  {
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Cookie(String name, double price, double weight, String country) {
        super(name, price, weight);
        this.country = country;

    }

    @Override
    public String toString() {
        return "Печенье " + super.toString() + " Страна-производитель: " + country;
    }
}
