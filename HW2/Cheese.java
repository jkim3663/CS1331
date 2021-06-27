public class Cheese {
    private String name;
    private boolean shred;
    private static double price = 1.50;

    public Cheese(String name, boolean shred) {
        this.name = name;
        this.shred = shred;
    }

    public Cheese(String n) {
        this(n, true);
    }

    public Cheese() {
        this("Cheddar");
    }

    public static void changePrice(double x) {
        price = x;
    }

    public static double getPrice() {
        return price;
    }
}