
import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a category for your quiz:");
        System.out.println("""
                Press 1 for Science
                Press 2 for History
                Press 3 for Sports
                """);
        System.out.print("Enter your category: ");
        switch(scanner.nextLine()){
            case "1": Science(); break;
            case "2": History(); break;
            case "3": Sports(); break;
            default: System.out.println("Invalid choice");
        }
    }
    public static void Science(){
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.println("ANSWER WITH THE LETTER BEFORE YOUR ANSWER ONLY");
        // Question 1
        System.out.println("Question 1: What is the chemical symbol for water?");
        System.out.println("a) CO2");
        System.out.println("b) H2O");
        System.out.println("c) O2");
        System.out.println("d) CH4");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("b")) {
            System.out.println("Correct! You earned 1 point.");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is H2O.");
        }

        // Question 2
        System.out.println("Question 2: What planet is known as the Red Planet?");
        System.out.println("a) Earth");
        System.out.println("b) Venus");
        System.out.println("c) Mars");
        System.out.println("d) Jupiter");
        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("c")) {
            System.out.println("Correct! You earned 1 point.");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is Mars.");
        }

        // Question 3
        System.out.println("Question 3: How many bones are in the adult human body?");
        System.out.println("a) 206");
        System.out.println("b) 305");
        System.out.println("c) 250");
        System.out.println("d) 198");
        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("a")) {
            System.out.println("Correct! You earned 1 point.");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is 206.");
        }

        // Question 4
        System.out.println("Question 4: What gas do plants absorb from the atmosphere?");
        System.out.println("a) Oxygen");
        System.out.println("b) Carbon Dioxide");
        System.out.println("c) Nitrogen");
        System.out.println("d) Hydrogen");
        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("b")) {
            System.out.println("Correct! You earned 1 point.");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is Carbon Dioxide.");
        }

        // Question 5
        System.out.println("Question 5: What is the powerhouse of the cell?");
        System.out.println("a) Nucleus");
        System.out.println("b) Ribosome");
        System.out.println("c) Mitochondria");
        System.out.println("d) Cytoplasm");
        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("c")) {
            System.out.println("Correct! You earned 1 point.");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is Mitochondria.");
        }

        // Display final score
        System.out.println("Quiz over! Your total score is: " + score + " out of 5.");

    }
    public static void History() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.println("ANSWER WITH THE LETTER BEFORE YOUR ANSWER ONLY");
        // Question 1
        System.out.println("Question 1: Who was the first President of the United States?");
        System.out.println("a) Thomas Jefferson");
        System.out.println("b) George Washington");
        System.out.println("c) Abraham Lincoln");
        System.out.println("d) John Adams");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("b")) {
            System.out.println("Correct! You earned 1 point.");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is George Washington.");
        }

        // Question 2
        System.out.println("Question 2: In which year did World War II end?");
        System.out.println("a) 1941");
        System.out.println("b) 1945");
        System.out.println("c) 1950");
        System.out.println("d) 1939");
        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("b")) {
            System.out.println("Correct! You earned 1 point.");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is 1945.");
        }

        // Question 3
        System.out.println("Question 3: Which civilization built the pyramids?");
        System.out.println("a) Romans");
        System.out.println("b) Mayans");
        System.out.println("c) Egyptians");
        System.out.println("d) Mesopotamians");
        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("c")) {
            System.out.println("Correct! You earned 1 point.");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is Egyptians.");
        }

        // Question 4
        System.out.println("Question 4: Who was the first man to step on the moon?");
        System.out.println("a) Yuri Gagarin");
        System.out.println("b) Neil Armstrong");
        System.out.println("c) Buzz Aldrin");
        System.out.println("d) John Glenn");
        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("b")) {
            System.out.println("Correct! You earned 1 point.");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is Neil Armstrong.");
        }

        // Question 5
        System.out.println("Question 5: In which city did the assassination of Archduke Franz Ferdinand, which triggered World War I, take place?");
        System.out.println("a) Vienna");
        System.out.println("b) Sarajevo");
        System.out.println("c) Berlin");
        System.out.println("d) Paris");
        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("b")) {
            System.out.println("Correct! You earned 1 point.");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is Sarajevo.");
        }

        // Display final score
        System.out.println("Quiz over! Your total score is: " + score + " out of 5.");
    }
    public static void Sports() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Question 1
        System.out.println("Question 1: In which sport would you perform a slam dunk?");
        System.out.println("a) Soccer");
        System.out.println("b) Basketball");
        System.out.println("c) Tennis");
        System.out.println("d) Baseball");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("b")) {
            System.out.println("Correct! You earned 1 point.");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is Basketball.");
        }

        // Question 2
        System.out.println("Question 2: How many players are there in a soccer (football) team on the field?");
        System.out.println("a) 10");
        System.out.println("b) 9");
        System.out.println("c) 11");
        System.out.println("d) 12");
        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("c")) {
            System.out.println("Correct! You earned 1 point.");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is 11.");
        }

        // Question 3
        System.out.println("Question 3: Who holds the record for the most Grand Slam titles in men's tennis?");
        System.out.println("a) Rafael Nadal");
        System.out.println("b) Roger Federer");
        System.out.println("c) Novak Djokovic");
        System.out.println("d) Pete Sampras");
        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("c")) {
            System.out.println("Correct! You earned 1 point.");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is Novak Djokovic.");
        }

        // Question 4
        System.out.println("Question 4: In which sport would you find the terms ‘love’, ‘deuce’, and ‘ace’?");
        System.out.println("a) Badminton");
        System.out.println("b) Cricket");
        System.out.println("c) Tennis");
        System.out.println("d) Volleyball");
        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("c")) {
            System.out.println("Correct! You earned 1 point.");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is Tennis.");
        }

        // Question 5
        System.out.println("Question 5: In which country were the first modern Olympic Games held?");
        System.out.println("a) France");
        System.out.println("b) Greece");
        System.out.println("c) USA");
        System.out.println("d) Italy");
        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("b")) {
            System.out.println("Correct! You earned 1 point.");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is Greece.");
        }

        // Display final score
        System.out.println("Quiz over! Your total score is: " + score + " out of 5.");
    }

}
