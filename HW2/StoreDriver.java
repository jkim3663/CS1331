public class StoreDriver {
    public static void main(String[] args) {
        Turkey t1 = new Turkey(4);
        Turkey t2 = new Turkey(8);
        Turkey.changePrice(4);
        Cheese c1 = new Cheese();
        Cheese c2 = new Cheese("Blue");
        Cheese.changePrice(2);
        System.out.println(Cheese.getPrice());
        System.out.println(Turkey.calculateTotalPrice());

        /*Created Store*/
        Store store = new Store("Store1");
        store.addStock(c1);
        store.addStock(c2);
        store.addStock(t1);
        store.addStock(t2);
        System.out.println(store.getCurrentStock());
        store.removeCheese();
        store.removeTurkey();

        /*Created Cart*/
        Cart cart = new Cart(store);
        System.out.println(store.getCurrentStock());
        cart.addToCart("Cheese");
        cart.addToCart("Cheese");
        System.out.println(cart.calculateTotalPrice());

        /*doCheckout does check out*/
        System.out.println(cart.doCheckout(51));
    }
}
