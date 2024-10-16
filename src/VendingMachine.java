import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Options:");
        System.out.println("""
                Code "A1": Product "Soda" - Price: $1.50
                Code "B2": Product "Chips" - Price: $1.25
                Code "C3": Product "Candy" - Price: $0.75
                Code "D4": Product "Water" - Price: $1.00
                """);
        System.out.println("Enter the Product you want to buy:");
        String op = scanner.nextLine().toUpperCase();
        switch(op){
            case "A1":
                System.out.println("Product \"Soda\" - Price: $1.50");
                break;
            case "B2":
                    System.out.println("Product \"Chips\" - Price: $1.25");
                    break;
            case "C3":
                System.out.println("Product \"Candy\" - Price: $0.75");
                break;
            case "D4": System.out.println("Product \"Water\" - Price: $1.00");
                break;
            default:
                System.out.println("Error. Invalid Option"); break;
        }
    }
}
