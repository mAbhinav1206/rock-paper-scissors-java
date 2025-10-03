package Beginner_project_1;

import java.util.*;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        System.out.print("Choose Rock, Paper or Scissors : ");
        Scanner sc = new Scanner(System.in);
        String user_input = sc.nextLine().toLowerCase();
        String comp_choice = choices[random.nextInt(choices.length)];
        if (!Arrays.asList(choices).contains(user_input)) {
            System.out.print("Invalid input! Please try again.");
        } else {
            System.out.println("Your choice : " + user_input);
            System.out.println("Computer choice : " + comp_choice);
            if (user_input.equals(comp_choice)) {
                System.out.println("Draw. Please try again.");
            }
            else if (user_input.equals("scissors") && comp_choice.equals("paper")) {
                System.out.println("You win!");
            }
            else if (user_input.equals("paper") && comp_choice.equals("rock")) {
                System.out.println("You win!");
            }
            else if (user_input.equals("rock") && comp_choice.equals("scissors"))  {
                System.out.println("You win!");
            }
            else {
                System.out.println("You lose.");
            }
            System.out.println("Play again? (yes / no)");
            String response = sc.next().toLowerCase();
            if (response.equals("yes")) {
                main(args);
                return;
            }
            else {
                System.out.print("Thanks for playing! \uD83D\uDC4B");
            }
        }
        sc.close();
    }
}
