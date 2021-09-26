import gifts.*;


public class Base {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Candy1", 55.90, 13.6, "Шоколадные");
        Candy candy2 = new Candy("Candy2", 12, 53, "Карамель");
        Candy candy3 = new Candy("Candy3", 123.12, 12, "Ириски");
        Cake cake1 = new Cake("Cake1", 66.33, 689, "Глобус");
        Cake cake2 = new Cake("Cake2", 903, 12.88, "Ашан");
        Cake cake3 = new Cake("Cake3", 90.44, 56, "Спар");
        Cookie cookie1 = new Cookie("Cookie1", 3, 0.98, "Россия");
        Cookie cookie2 = new Cookie("Cookie2", 4.44, 6.8, "Чехия");
        Cookie cookie3 = new Cookie("Cookie3", 12.36, 8.88, "Польша");
        Jellybean jellybean1 = new Jellybean("Jellybean1", 65.7, 45.34, "Красный");
        Jellybean jellybean2 = new Jellybean("Jellybean2", 88.432, 90.43, "Зеленый");
        Jellybean jellybean3 = new Jellybean("Jellybean3", 5, 4, "Синий");
        Gift[] box = {candy1, candy2, candy3, cake1, cake2, cake3, cookie1, cookie2, cookie3, jellybean1, jellybean2, jellybean3};
        for (Gift someGift : box) {
            System.out.println(someGift.toString());
        }
    }
}
