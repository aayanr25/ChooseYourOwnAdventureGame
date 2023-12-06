import java.util.Scanner;

public class Dialogue {

    private Scanner scan;
    private Player player;

    // these instance variables define all the targets and weapons that will be used in the program.
    private Target barthy = new Target("Barthy", 5);
    private Target michael = new Target("Michael A.", 10);
    private Target piper = new Target("Piper", 15);
    private Target jenna = new Target("Jenna", 20);
    private Target jonah = new Target("J. Jonah Jameson", 30);

    private Weapon seed = new Weapon ("Watermelon Seed", 3, 7, 9, 2);
    private Weapon candlestick = new Weapon("Candlestick", 13, 9, 11, 13);
    private Weapon snickers = new Weapon("Snickers Bar", 10, 18, 17, 8);
    private Weapon lava = new Weapon ("Bucket of Lava", 24, 16, 27, 24);
    private Weapon alienGun = new Weapon("Alien Ray Gun", 35, 31, 27, 31);

    private boolean gameOver;

    public Dialogue(Player player) {
        this.player = player;
    }
    public Dialogue() {
        scan = new Scanner(System.in);
    }

    public void start() {
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println(name + ", prepare to begin.\n\n");
        Player newPlayer = new Player(name);
        gameOver = false;
        intro();
        while (!(isGameOver())) {
            menu();
        }
        if (!(barthy.isAlive() || michael.isAlive() || piper.isAlive() || jenna.isAlive() || jonah.isAlive())) {
            System.out.println("Congrats " + name + "! You've won!");
        }


    }

    public void intro() {
        System.out.println("Welcome to Wonderland Retreat! For you, it's not much of a retreat. You have been tasked with 'eliminating' 5 members of the camp, using any weapons at your disposal.");
        System.out.println("Randy is your personal assistant in your quest to eliminate all of your targets.");
        System.out.println("Press enter to continue.");
        scan.nextLine();
    }



    // these two methods list the attributes of each target and each weapon, respectively.
    public String listOutTarget(Target target) {
        if (target.isAlive()) {
            String a = target.getName();
            String b = "" + target.getStrength();
            String c = "" + target.getSpeed();
            String d = "" + target.getAdaptability();
            String e = "" + target.getIntelligence();
            String f = "" + target.getHealth();
            return "---------------\nName: " + a + " \n Strength: " + b + " \n Speed: " + c + " \n Adaptability: " + d + " \n Intelligence: " + e + " \n Health: " + f + "\n---------------";
        } else {
            return target.getName() + " has already been defeated.";
        }
    }
    public String listOutWeapon(Weapon weapon) {
        String a = weapon.getName();
        String b = "" + weapon.getStrength();
        String c = "" + weapon.getSpeed();
        String d = "" + weapon.getAdaptability();
        String e = "" + weapon.getIntelligence();
        return "---------------\nName: " + a + " \n Strength: " + b + " \n Speed: " + c + " \n Adaptability: " + d + " \n Intelligence: " + e + "\n---------------";
    }

    public Target chooseTarget(int userNum) {
        if (userNum == 1) {
            return barthy;
        }
        if (userNum == 2) {
            return michael;
        }
        if (userNum == 3) {
            return piper;
        }
        if (userNum == 4) {
            return jenna;
        }
        if (userNum == 5) {
            return jonah;
        }
        else {
            return null;
        }
    }
    public Weapon chooseWeapon(int userNum) {
        if (userNum == 1) {
            return seed;
        }
        if (userNum == 2) {
            return candlestick;
        }
        if (userNum == 3) {
            return snickers;
        }
        if (userNum == 4) {
            return lava;
        }
        if (userNum == 5) {
            return alienGun;
        }
        else {
            return null;
        }
    }

    // returns true if all the targets have been eliminated.
    public boolean isGameOver() {
        if (!(gameOver)) {
            if (!(barthy.isAlive() || michael.isAlive() || piper.isAlive() || jenna.isAlive() || jonah.isAlive())) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    public void menu() {
        System.out.println("-----------------------------");
        System.out.println("When interacting with Randy, type one of these numbers to take an action.");
        System.out.println("1) Show me my targets");
        System.out.println("2) Show me my weapons");
        System.out.println("3) Chase a new target");
        System.out.println("4) Exit game");
        System.out.println("-----------------------------");
        int optionChoice = scan.nextInt();
        if (optionChoice == 1) {
            System.out.println("TARGET 1:\n" + listOutTarget(barthy));
            Buffer.buffer(500);
            System.out.println("TARGET 2:\n" + listOutTarget(michael));
            Buffer.buffer(500);
            System.out.println("TARGET 3:\n" + listOutTarget(piper));
            Buffer.buffer(500);
            System.out.println("TARGET 4:\n" + listOutTarget(jenna));
            Buffer.buffer(500);
            System.out.println("TARGET 5:\n" + listOutTarget(jonah));
            System.out.println();
        } else if (optionChoice == 2) {
            System.out.println("WEAPON 1:\n" + listOutWeapon(seed));
            Buffer.buffer(500);
            System.out.println("WEAPON 2:\n" + listOutWeapon(candlestick));
            Buffer.buffer(500);
            System.out.println("WEAPON 3:\n" + listOutWeapon(snickers));
            Buffer.buffer(500);
            System.out.println("WEAPON 4:\n" + listOutWeapon(lava));
            Buffer.buffer(500);
            System.out.println("WEAPON 5:\n" + listOutWeapon(alienGun));
            System.out.println();
        } else if (optionChoice == 3) {
            System.out.println("Barthy (1)\nMichael A.(2)\nPiper (3)\nJenna (4)\nJonah (5)");
            System.out.print("Enter the number that corresponds with the target you want to chase. Enter integer 1-5: ");
            int num1 = scan.nextInt();
            Target newTarget = chooseTarget(num1);
            if (newTarget.isAlive()) {  // checks to make sure the chosen target hasn't already been eliminated.
                System.out.println();
                System.out.println("Watermelon Seed (1)\nCandlestick (2)\nSnickers Bar (3)\nBucket of Lava (4)\nAlien Ray Gun (5)");
                System.out.print("Enter the number that corresponds with the weapon you want to use. Enter integer 1-5: ");
                int num2 = scan.nextInt();
                Weapon userWeapon = chooseWeapon(num2);
                Minigame newGame = new Minigame(newTarget, userWeapon);
                newGame.gameplay();  // the gameplay() method is in the Minigame class, and it contains the majority of code for the program output.
            } else {
                System.out.println(newTarget.getName() + " is already defeated!");
            }
            System.out.println();
        } else if (optionChoice == 4) {
            System.out.println("Randy~ See you later, pal!");
            gameOver = true;
        } else {
            System.out.println("Sorry, that's not an option");
        }
        System.out.println("Press enter to continue.");

        scan.nextLine(); // allows user to press enter in order to move forward.
        scan.nextLine();

    }
}