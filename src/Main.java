import java.util.Scanner;

public class Main {
    public static void intro(){
        System.out.println(
                """
                Hello! What is your name?
                """
        );
        System.out.println("Well, " + getName() + ", I am thinking of a number between 1 and 20." +
                "Take a guess..."
        );
    }
    public static String getName(){
        return new Scanner(System.in).nextLine();
    }
    public static int getNumber(){
        return new Scanner(System.in).nextInt();
    }

    public static void ending(int number) {
        int counter = 0;
        while(number != 4) {

            if(number >= 5) {
                counter++;
                System.out.println("Too high, try again!");
                number = getNumber();

            } else if (number <= 3) {
                counter++;
                System.out.println("Too low, try again!");
                number = getNumber();

            }
        }
        if (number == 4) {
            counter++;
            System.out.println("You guessed correctly! It only took you: " + counter + " tries!");
        }
    }
    public static void main(String[] args) {
        intro();
        ending(getNumber());
    }
}

