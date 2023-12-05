
public class Target {
    private String name;
    private int stat;
    private int health = 50;

    public Target(String name, int stat) {
        this.name = name;
        this.stat = stat;
    }

    public String getName() {
        return name;
    }
    public int getStrength() {
        return stat;
    }
    public int getIntelligence() {
        return stat;
    }
    public int getAdaptability() {
        return stat;
    }
    public int getSpeed() {
        return stat;
    }

    public int getHealth() {
        if (health <= 0) {
            health = 0;
        }
        return health;
    }

    public boolean isAlive() {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
    }
}