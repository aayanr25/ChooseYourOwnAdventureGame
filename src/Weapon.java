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

    public String getName() {
        return name;
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

    // increases effectiveness of the chosen weapon.
    public void powerUp() {
        if (strength < 10) {
            strength = 15;
        } if (speed < 10) {
            speed = 15;
        }
    }
}
