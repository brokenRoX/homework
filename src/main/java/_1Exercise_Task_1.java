import java.util.Arrays;

public class _1Exercise_Task_1 { // Always need a class.

    public static void main(String[] args) { // This is my main function.
        if (args.length != 2) { // Checks if there are 2 Arguments given.
            System.out.println("We need exactly 2 integers");
            return;
        }
        // Now we have the correct number of Arguments.
        String startNumberString = args[0];
        String endNumberString = args[1];
        if (isNotNumber(startNumberString)) {
            System.out.println("First number is not an integer");
            return;
        }
        if (isNotNumber(endNumberString)) {
            System.out.println("Second number is not an integer");
            return;
        }

        int startNumber = Integer.parseInt(startNumberString);
        int endNumber = Integer.parseInt(endNumberString);
        if (startNumber > endNumber) {
            System.out.println("Startnumber can't be higher than the endnumber");
            return;
        }

        if (endNumber < 2) { // Shortcut: There are no prime numbers below 2 per definition (not even negative numbers).
            System.out.println("There are no prime numbers between " + startNumber + " and " + endNumber + ".");
            return;
        }
        // Creating an array with all entries as true (which then are prime).
        boolean[] sieve = new boolean[endNumber + 1]; // This is an array with the name "sieve" which contains endNumber booleans.
        Arrays.fill(sieve, true); // Gives every boolean in the array the default value "true".

        for (int i = 2; i < sieve.length / 2; i++) { // For loop with starting point at 2 (because it's the first prime number) to endnumber+1 - i increases by 1 every round.
            if (!sieve[i]) { // If i is not prime then continue with the next number.
                continue;
            }
            // i is a prime!
            // Marks all multiples of i as not prime (switching them to false).
            int iMultiple = i + i;
            while (iMultiple < sieve.length) {
                sieve[iMultiple] = false;
                iMultiple += i;
            }
        }
        System.out.print("The prime numbers between " + startNumber + " and " + endNumber + " are:");
        int lowestCounter = Math.max(2, startNumber);
        for (int i = lowestCounter; i < sieve.length; i++) {
            if (sieve[i]) {
                System.out.print(" " + i + ",");
            }
        }
    }

    private static boolean isNotNumber(String numberString) {
        return !numberString.matches("^-?[0-9]+$"); // Regex: string starts with 1 or 0 "-", then must have at least 1 digit(0-9) then nothing else.
    }
}
