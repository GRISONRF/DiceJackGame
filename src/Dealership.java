import java.util.Scanner;

public class Dealership {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Java Dealership");
        System.out.println("Select option 'a' to buy a car.");
        System.out.println("Select option 'b' to sell a car.");
        String option = scan.nextLine();

//        if (option.equals('a')) {
//            System.out.println("Good choice, I will buy your car");
//        } else if (option.equals('b')) {
//            System.out.println("Ok, let's sell it");
//        } else {
//        System.out.println("Invalid option");
//        }

        switch (option) {
            case "a": System.out.println("you chose option " + option); break;
            case "b": System.out.println("you chose option " + option); break;
            default: System.out.println("Invalid option");
        }
        scan.close();

        System.out.println("Please entre a number");
        int num = scan.nextInt();

        scan.nextLine();
        System.out.println("Please write a sentence");
        String sentence = scan.nextLine();

        scan.close();




    }
}
