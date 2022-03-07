import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        intro();
    }
    public static void intro() {
        System.out.println("You are in a land full of dragons.");
        System.out.println("In front of you, you see two caves.");
        System.out.println("In one cave, the dragon is friendly and will share his treasure with you.");
        System.out.println("The other dragon is greedy, hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? /n (1 or 2)");
        choice();
    }
    public static void choice() {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        in.close();

        if (input == 1) {
            disaster();
        }
        else if (input == 2) {
            reward();
        }
        else {
            intro();
        }
    }
    public static void reward() {
        System.out.println("The friendly dragon welcomes you warmly.");
        System.out.println("You and your new friend live happily ever after!");

        System.out.println("\nThe End.");

        System.exit(0);
    }
    public static void disaster() {
        System.out.println("You approach the cave...");
        System.out.println("It's dark and spooky...");
        System.out.println("A huge dragon leaps out in front of you!");
        System.out.println("He opens his jaws and swallows you whole!");

        System.out.println("\nThe End.");

        System.exit(0);
    }
}
