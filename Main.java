import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int choose = 1;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (choose == 1 || choose == 2) {

            choose = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Do you want to drawn a number or a people?\n\n[1] - Number\n[2] - People\n[3] - Exit\n\n"));
            if (choose == 3) {
                scanner.close();

                JOptionPane.showMessageDialog(null, "Thanks for enjoying!");
            }

            if (choose == 1) {

                System.out.println();

                int numbers = Integer.parseInt(JOptionPane.showInputDialog("How many numbers you want to draw?"));

                int randomNumber = random.nextInt(numbers);

                JOptionPane.showMessageDialog(null, "Result: " + randomNumber);

            }

            if (choose == 2) {


                int peopleCount = Integer.parseInt(JOptionPane.showInputDialog("How many peoples you want do draw?"));

                String[] names = new String[peopleCount]; // Cria uma lista names

                for (int i = 0; i < peopleCount; i++) {

                    String name = JOptionPane.showInputDialog("Name of people " + (i + 1) + ": ");
                    names[i] = name;

                }

                int randomWinner = random.nextInt(names.length);


                JOptionPane.showMessageDialog(null, "The winner is: " + names[randomWinner]);

            }

        }
    }


}