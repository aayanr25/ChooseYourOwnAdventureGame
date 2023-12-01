public class Target {
    private String name;
    private int stat;
    private int health = 50;
    private Target barthy = new Target("Barthy", 5);
    private Target michael = new Target("Michael A.", 10);
    private Target piper =
    private Target jenna = new Target("Jenna", 20);
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
    public int getSpeed() {
        return stat;
    }
    public int getAdaptability() {
        return stat;
    }
    public int getIntelligence() {
        return stat;
    }
    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }



}
