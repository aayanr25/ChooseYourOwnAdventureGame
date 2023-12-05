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
        System.out.println();
        System.out.println("You are currently on the main campgrounds.");
        System.out.print("Would you like to pursue " + target.getName() + " (1) or power up your weapon (2)? Enter a 1 or 2: ");
        int choice = scan.nextInt();
        if (choice == 1) { // this choice is the user choosing to pursue their target.
            pursue();
            System.out.print("Do you want to attack (1) or back out (2)? Enter a 1 or 2. ");
            choice = scan.nextInt();
            if (choice == 1) { // this choice is the user choosing to attack the target.
                attack();
            } else {
                System.out.println("You ran away.");
            }
        } else {
            weapon.powerUp();
            System.out.println("You powered up your " + weapon.getName() + "!");
            pursue();
            System.out.println("You found " + target.getName() + "!");
            System.out.print("Do you want to attack (1) or back out (2)? Enter a 1 or 2. ");
            choice = scan.nextInt();
            if (choice == 1) { // this choice is the user choosing to attack the target.
                attack();
            } else {
                System.out.println("You ran away.");
            }
        }
        scan.nextLine();
    }

    // the pursue() method concludes when the player has successfully tracked down the target.
    private void pursue() {
        System.out.println("You are now pursuing " + target.getName());
        System.out.println("PURSUIT\n-------------");
        System.out.print("Do you want to go to the volleyball court (1) or the archery range (2)? Enter a 1 or 2. ");
        int userChoice = scan.nextInt();
        if (userChoice == 1) {
            if (attemptSuccess()) { // the attemptSuccess() method randomly evaluates to true or false based on luck.
                System.out.println("You found " + target.getName() + " at the volleyball court!");
            } else {
                System.out.println(target.getName() + " was not at the volleyball court.");
                System.out.print("Do you want to go to the cabins (1) or the petting zoo (2)? ");
                userChoice = scan.nextInt();
                if (userChoice == 1) {
                    System.out.println("You found " + target.getName() + " at the cabins!");
                } else {
                    System.out.println("You found " + target.getName() + " at the petting zoo!");
                }
            }
        } else {
            if (attemptSuccess()) {
                System.out.println("You found " + target.getName() + " at the archery range!");
            } else {
                System.out.println(target.getName() + " was not at the archery range.");
                System.out.print("Do you want to go to the docks (1) or the baseball field (2)? Enter a 1 or 2: ");
                userChoice = scan.nextInt();
                if (userChoice == 1) {
                    System.out.println("You found " + target.getName() + " at the docks!");
                } else {
                    System.out.println("You found " + target.getName() + " at the baseball field!");
                }
            }
        }
        scan.nextLine();
    }
    public void attack() {
        System.out.println("ATTACK\n-------------");
        int dmg = (weapon.getStrength());
        if (attemptSuccess()) {
            target.takeDamage(dmg);
            System.out.println("You attack. " + target.getName() + " is now at " + target.getHealth() + " health.");
            if (target.getHealth() <= 0) {
                System.out.println("You have defeated " + target.getName() + "!");
            } else {
                System.out.println("Do you want to keep attacking? Enter 1 for yes, 2 for no: ");
                int num = scan.nextInt();
                if (num == 1) {
                    attack();
                }
            }
        } else {
            System.out.println("The attack failed!");
            System.out.println("Do you want to keep attacking? Enter 1 for yes, 2 for no: ");
            int num = scan.nextInt();
            if (num == 1) {
                attack();
            }
        }
    }

    public int getLuck() {
        luck = (int) (Math.random() * 10) + 1;
        return luck;
    }
    // this method determines if the player successfully executes an action. More luck, greater chance of success.
    private boolean attemptSuccess() {
        if (getLuck() > 5) {
            return ((Math.random() * 10) + 1) < 8;
        } else if (getLuck() > 3) {
            return ((Math.random() * 8) + 1) < 5;
        } else {
            return ((Math.random() * 5) + 1) < 3;
        }
    }

}