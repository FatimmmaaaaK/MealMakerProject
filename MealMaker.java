import java.util.Scanner;

public class MealMaker {

    private static String meatChoice;
    private static String riceChoice;
    private static String beansChoice;
    private static String toppingsChoice;

    private static String tacoChoice;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Meal Maker!");
        System.out.println("Would you like to make a burrito? (y/n)");

        String response = input.nextLine();

        if (response.equalsIgnoreCase("y")) {
            System.out.println("Great! Let's get started.");
            int meatCalories = chooseMeat(input);
            int riceCalories = chooseRice(input);
            int beansCalories = chooseBeans(input);
            int toppingsCalories = chooseToppings(input);


            int totalCalories = meatCalories + riceCalories + beansCalories + toppingsCalories ;


            System.out.println("Would you like to know nutrition details for your meal? (y/n)");
            String decision = input.nextLine();
            if (decision.equalsIgnoreCase("y")){
                System.out.println("Your burrito is ready! You ordered a burrito with the following items:");
                System.out.println("- " + getMeatChoice() + " (" + meatCalories + " calories)");
                System.out.println("- " + getRiceChoice() + " (" + riceCalories + " calories)");
                System.out.println("- " + getBeansChoice() + " (" + beansCalories + " calories)");
                System.out.println("- " + getToppingsChoice() + " (" + toppingsCalories + " calories)");
                System.out.println("Total Calories: " + totalCalories);
            }else {
                System.out.println("Your burrito is ready! You ordered a burrito with the following items:");
                System.out.println("- " + getMeatChoice());
                System.out.println("- " + getRiceChoice());
                System.out.println("- " + getBeansChoice());
                System.out.println("- " + getToppingsChoice() );
            }

        } else if (response.equalsIgnoreCase( "n")){
        System.out.println("Okay, maybe you're not in the mood for a burrito...");
        System.out.println("Would you like to make a Taco? (y/n)");
        String responseTwo = input.nextLine();

            if (responseTwo.equalsIgnoreCase("y")) {
                System.out.println("Great! All of our Tacos are made with corn tortillas but you can chose your meat and toppings!");

                int tacoCalories = chooseTaco(input);
                int tacoShellCalories = 62;

                int totalCalories = tacoCalories + tacoShellCalories;

                System.out.println("Your taco is ready! You ordered the " +  getTacoChoice() + " taco! Great Choice!:");
                System.out.println("- " + getTacoChoice());
                System.out.println("Total Calories: " + totalCalories);

            }else {
                System.out.println("Sorry, I only have burritos and tacos. Maybe next time. GoodBye!");
            }
        }

        input.close();
    }

    public static int chooseRice(Scanner input) {
        System.out.println("What type of rice would you like to add to your Burrito? (white or brown)");
        String choice = input.nextLine();
        setRiceChoice(choice);

        switch (choice.toLowerCase()) {
            case "white":
                return 120;
            case "brown":
                return 110; 
            default:
                System.out.println("Sorry, I couldn't understand that. You need to pick a base for your burrito, Please try again.");
                return chooseRice(input);
            }
    }
    public static int chooseBeans(Scanner input) {
        System.out.println("What type of beans would you like? (black, pinto, or refried)");
        String choice = input.nextLine();
        setBeansChoice(choice);

        switch (choice.toLowerCase()) {
            case "black":
                return 115;
            case "pinto":
                return 120;
            case "refried":
                return 115;
            case "none":
                return 0;
            default:
                System.out.println("Hmmm can you try again, I didn't understand your response.");
                return chooseBeans(input);
            }
        }
    public static int chooseMeat(Scanner input) {
        System.out.println("What type of meat would you like? (chicken, beef, pork, or tofu)");
        String choice = input.nextLine();
        setMeatChoice(choice);
    
        switch (choice.toLowerCase()) {
            case "chicken":
                return 160;
            case "beef":
                return 200;
            case "pork":
                return 200;
            case "beyondMeat":
                return 270;
            case "tofu":
                return 95;
            default:
            System.out.println("Hmm I didn't quite understand what you'd like. Try again, or if you would not like any meat, you can add some extras to your meal a little later to make it yummy!");
            return chooseMeat(input);
        }
    }
    public static int chooseToppings(Scanner input) {
        System.out.println("What type of toppings would you like? (guacamole, cheese, or sour cream)");
        String choice = input.nextLine();
        setToppingsChoice(choice);
    
        switch (choice.toLowerCase()) {
            case "guacamole":
                return 45;
            case "cheese":
                return 115;
            case "sour cream":
                return 25;
            case "none":
                return 0;
            default:
            System.out.println("Hmm I didn't quite understand what you'd like. Try again, or if you would not like any meat, you can add some extras to your meal a little later to make it yummy!");
            return chooseMeat(input);
        }
    }

    public static int chooseTaco(Scanner input) {
        System.out.println("Which taco would you like? Al pastor,steak,chicken,pork,or shrimp");
        String choice = input.nextLine();
        setTacoChoice(choice);

        switch (choice.toLowerCase()) {
            case "al pastor":
                return 175;
            case "steak":
                return 170;
            case "chicken":
                return 160;
            case "pork":
                return 200;
            case "shrimp":
                return 85;
        default:
            System.out.println("Hmm I didn't quite understand what you'd like. Try again,please");
            return chooseTaco(input);
        }

        }

        
    public static String getMeatChoice() {
        return meatChoice;
    }

    public static void setMeatChoice(String choice) {
        meatChoice = choice;
    }

    public static String getRiceChoice() {
        return riceChoice;
    }

    public static void setRiceChoice(String choice) {
        riceChoice = choice;
    }

    public static String getBeansChoice() {
        return beansChoice;
    }

    public static void setBeansChoice(String choice) {
        beansChoice = choice;
    }

    public static String getToppingsChoice() {
        return toppingsChoice;
    }

    public static void setToppingsChoice(String choice) {
        toppingsChoice = choice;
    }

    public static String getTacoChoice(){
        return tacoChoice;
    }
    public static void setTacoChoice(String choice){
        tacoChoice = choice;
    }

    }
