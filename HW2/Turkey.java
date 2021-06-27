public class Turkey {
    private double ounce;
    private static double price = 1.99;
    private static double count = 0;

    public Turkey(double ounce) {
        this.ounce = ounce;
        count += ounce;
    }

    public static double calculateTotalPrice() {
        return Math.round(count * price * 100) / 100.0;
    }

    public static void changePrice(double x) {
        price = x;
    }
}
