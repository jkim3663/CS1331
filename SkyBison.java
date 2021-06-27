public class SkyBison {
    private String name;
    private int fluffiness;
    private int health;

    public SkyBison(String n, int f, int h) {
        name = n;
        fluffiness = f;
        health = h;
    }

    public SkyBison(String n) {
        name = n;
        fluffiness = 100;
        health = 100;
    }

    public int getFluffiness() {
        if (fluffiness < 0) {
            fluffiness = 0;
        }
        return fluffiness;
    }

    public int getHealth() {
        if (health < 0) {
            health = 0;
        }
        return health;
    }

    public void setFluffiness(int fluffiness) {
        this.fluffiness = fluffiness;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void eatSnack(int[] val) {
        for (int i = 0; i < val.length; i++) {
            health += val[i];
        }
    }

    public void eatSnack(int val) {
        health += val;
    }

    public void fly(int hour) {
        health -= hour * 10;
        if (health < 0) {
            health = 0;
        }
    }

    public static void main(String[] args) {
        SkyBison sky1 = new SkyBison("James", 80, 80);
        SkyBison sky2 = new SkyBison("Donald");
        sky1.setFluffiness(76);
        sky1.setHealth(100);
        sky1.eatSnack(new int[]{1, 2, 3});
        sky1.eatSnack(10);
        sky1.fly(5);
        sky2.setFluffiness(76);
        sky2.setHealth(80);
        sky2.eatSnack(new int[]{1, 2, 3});
        sky2.eatSnack(10);
        sky2.fly(5);
        System.out.println(sky1.getHealth());
        System.out.println(sky1.getFluffiness());
        System.out.println(sky2.getHealth());
        System.out.println(sky2.getFluffiness());
    }

}