import java.util.Random;

public class Store {
    private String name;
    private Cheese[] cheeseArr;
    private Turkey[] turkeyArr;
    private int cnt1 = 0;
    private int cnt2 = 0;

    public String getCurrentStock() {
        return "Current Stock of " + name + ":\nCheese: " + cnt1 + "\nTurkey: " + cnt2;
    }

    public Store(String name) {
        this.name = name;
        cheeseArr = new Cheese[5];
        turkeyArr = new Turkey[5];
    }

    public void addStock(Cheese val) {
        cheeseArr[cnt1] = val;
        cnt1++;
    }

    public void addStock(Turkey val) {
        turkeyArr[cnt2] = val;
        cnt2++;
    }

    public Cheese removeCheese() {
        Cheese temp;
        if (cnt1 == 0) {
            for (int i = 0; i < 5; i++) {
                cheeseArr[i] = new Cheese();
                cnt1++;
            }
        }
        temp = cheeseArr[cnt1 - 1];
        cheeseArr[cnt1 - 1] = null;
        cnt1--;
        return temp;
    }

    public Turkey removeTurkey() {
        Turkey temp;
        Random rd = new Random();
        int num = rd.nextInt(60);
        if (cnt2 == 0) {
            for (int i = 0; i < 5; i++) {
                turkeyArr[i] = new Turkey(num);
                cnt2++;
            }
        }
        temp = turkeyArr[cnt2 - 1];
        turkeyArr[cnt2 - 1] = null;
        cnt2--;
        return temp;
    }
}
