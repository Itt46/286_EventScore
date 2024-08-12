/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eventscore;

import java.util.Scanner;

/**
 *
 * @author ittak
 */
public class FootballScoreSystem {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        ScoreSource scoreSource = new ScoreSource();

        // Creating subscriber objects
        ScoreDisplay display1 = new ScoreDisplay("Display 1");
        ScoreDisplay display2 = new ScoreDisplay("Display 2");

        // Registering subscribers
        scoreSource.addScoreListener(display1);
        scoreSource.addScoreListener(display2);

        Scanner scanner = new Scanner(System.in);
        String input;

        // Continuously read input from the user
        while (true) {
            input = scanner.nextLine();
            if (input.isEmpty()) {
                break; // Exit if Enter is pressed without any input
            }
            System.out.println("Enter Score " + input + " <- KonPon");
            scoreSource.setScoreLine(input);
        }
    }
    
}
