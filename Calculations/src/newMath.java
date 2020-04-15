import java.util.Scanner;

public class newMath {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your first number!");
        int num1 = keyboard.nextInt();
        System.out.println("Enter your second number!");
        int num2 = keyboard.nextInt();

        int squared1 = (num1 * num1);
        int squared2 = (num2 * num2);
        int product = (num1 + num2);
        int sum = (num1 * num2);

        keyboard.nextLine();

        System.out.println("Enter your first input");
        String input1 = keyboard.nextLine();
        System.out.println("Enter your second input");
        String input2 = keyboard.nextLine();
        System.out.println(input1 + " " + input2);


    }
}