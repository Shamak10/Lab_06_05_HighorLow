public class guessCalculator {
    public static void main(String[] args) {//Creating scanner to take input from the user
        Scanner scanner = new Scanner("7");//Asking for the user input
        int randomNumber = 7;
        System.out.print("Guess a number between 1 and 10: ");//choose a number between 1 and 10
        int userGuess = scanner.nextInt();
        System.out.println("The random number was: " + randomNumber);//The value of random number
        if (userGuess == randomNumber) {
            System.out.println("Your guess was on the money!");//The number guessed was right
        } else if (userGuess > randomNumber) {
            System.out.println("Your guess was too high!");//The number guessed was high
        } else {
            System.out.println("Your guess was too low!");//The number guessed was low
        }
    }
}
