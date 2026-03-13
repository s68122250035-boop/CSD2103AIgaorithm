public class Battery {

    private int level;

    public Battery() {
        this.level = 100; // start 100%
    }

    public void drain(int amount) {
        level -= amount;

        if (level < 0) {
            level = 0;
        }
    }

    public int getLevel() {
        return level;
    }
}