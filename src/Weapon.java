public class Weapon {
    private int strength;
    private int speed;
    private int adaptability;
    private int intelligence;
    public Weapon(int strength, int speed, int adaptability, int intelligence) {
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

    public boolean isValidWeapon(People person, Weapon weapon) {
        int numStats = 0;
        if (weapon.getStrength() > person.getStrength()) {
            numStats ++;
        } if (weapon.getSpeed() > person.getSpeed()) {
            numStats ++;
        } if (weapon.getAdaptability() > person.getAdaptability()) {
            numStats ++;
        } if (weapon.getIntelligence() > person.getIntelligence()) {
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
