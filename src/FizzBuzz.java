public class FizzBuzz {
    /*
    Write a program that prints the numbers from 1 to 100.
    But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
    For numbers which are multiples of both three and five print “FizzBuzz
     */
    public static void main(String[] args) {
        // bakary kamara //

        int i = 0;
        while (i < 100) {
            i++;
            if (isBothAMultiplyOfThreeAndFive(i)) {
                System.out.println("FizzBuzz");
            } else if (isMultiplyOfFive(i)) {
                System.out.println("Buzz");
            } else if (isMultiplyOfThree(i)) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    private static boolean isMultiplyOfThree(int number) {
        return number % 3 == 0; // " la fonction Module" de 3
    }

    private static boolean isMultiplyOfFive(int number) {
        return number % 5 == 0; // " la fonction Module" de 5
    }

    private static boolean isBothAMultiplyOfThreeAndFive(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }
}
