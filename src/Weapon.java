public class Weapon {
    private int strength;
    private String name;
    private int speed;
    private int adaptability;
    private int intelligence;
    public Weapon(String name, int strength, int speed, int adaptability, int intelligence) {
        this.name = name;
        this.strength = strength;
        this.speed = speed;
        this.adaptability = adaptability;
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return strength;
    }
    public int getSpeed() {
        return speed;
    }
    public int getAdaptability() {
        return adaptability;
    }
    public int getIntelligence() {
        return intelligence;
    }

    public Weapon seed = new Weapon ("Watermelon seed", 3, 7, 9, 2);
    public Weapon candlestick = new Weapon("Candlestick", 13, 9, 11, 13);
    public Weapon snickers = new Weapon("Snickers Bar", 10, 18, 17, 8);
    public Weapon lava = new Weapon ("Bucket of Lava", 24, 16, 27, 24);
    public Weapon alienGun = new Weapon("Alien Ray Gun", 35, 31, 27, 31);

    public boolean isValidWeapon(Target target, Weapon weapon) {
        int numStats = 0;
        if (weapon.getStrength() > target.getStrength()) {
            numStats ++;
        } if (weapon.getSpeed() > target.getSpeed()) {
            numStats ++;
        } if (weapon.getAdaptability() > target.getAdaptability()) {
            numStats ++;
        } if (weapon.getIntelligence() > target.getIntelligence()) {
            numStats ++;
        }
        if (numStats > 2) {
            return true;
        }
        return false;
    }

    public void powerUp() {
        if (strength < 10) {
            strength = 15;
        } if (speed < 10) {
            speed = 15;
        }
    }


}
