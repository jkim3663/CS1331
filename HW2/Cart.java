public class Cart {
    private Cheese[] cheeses;
    private Turkey[] turkeys;
    private Store store;
    private static int cntCheese = 0;
    private static int cntTurkey = 0;

    public Cart(Store store) {
        this.store = store;
        cheeses = new Cheese[3];
        turkeys = new Turkey[3];
    }

    public void addToCart(String name) {
        if (name == "Cheese") {
            cheeses[cntCheese] = store.removeCheese();
            cntCheese++;
        } else if (name == "Turkey") {
            turkeys[cntTurkey] = store.removeTurkey();
            cntTurkey++;
        }
    }

    public static double calculateTotalPrice() {
        return cntCheese * Cheese.getPrice() + Turkey.calculateTotalPrice();
    }

    public double doCheckout(double money) {
        if (money >= calculateTotalPrice()) {
            return money - calculateTotalPrice();
        }
        return -1.0;
    }
}
