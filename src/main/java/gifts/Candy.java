package gifts;

public class Candy extends Gift  {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Candy(String name, double price, double weight, String type) {
        super(name, price, weight);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Конфеты " + super.toString() + " Вид: " + type;
    }
}
