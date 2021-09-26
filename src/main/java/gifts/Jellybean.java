package gifts;

public class Jellybean extends Gift{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Jellybean(String name, double price, double weight, String color) {
        super(name, price, weight);
        this.color=color;
    }

    @Override
    public String toString() {
        return "Мармелад " + super.toString() + " Цвет: " + color;
    }
}
