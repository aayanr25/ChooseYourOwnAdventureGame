import java.util.Scanner;

public class Minigame {
    private Target target;
    private Weapon weapon;
    private int luck;
    Scanner scan = new Scanner(System.in);

    public Minigame(Target target, Weapon weapon) {
        this.target = target;
        this.weapon = weapon;
    }

    public void gameplay() {
        System.out.println("You are currently on the main campgrounds.");
    }

    public int getLuck() {
        luck = (int) (Math.random() * 10) + 1;
        return luck;
    }

    public boolean attemptSuccess() {
        if (getLuck() > 5) {
            return ((Math.random() * 2) + 1) < 2;
        } else if (getLuck() > 3) {
            return ((Math.random() * 4) + 1) < 2;
        } else {
            return ((Math.random() * 6) + 1) < 2;
        }
    }

    public void attack() {
        int dmg = (weapon.getStrength() / 2);
        if (attemptSuccess()) {
            target.takeDamage(dmg);
            System.out.println("You attack. " + target.getName() + " is now at " + target.getHealth() + " health.");
        } else {
            System.out.println("The attack failed!");
        }

    }

}