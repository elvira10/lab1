import java.util.Scanner; //importing scanner from package
public class Main{
    public static boolean func(int a) {
        return Prime(a,2); //calling function Prime and giving the arguments
    }

    /**
     * Assesing if a given number is prime or not
     * @param a The value to check whether it is prime or not
     * @param b The divisor to check if value a is divisible by value b
     * @return True if value a is prime, false otherwise
     */
    private static boolean Prime(int a, int b) //recursive function
    {
        if (a <= 1 || a % b == 0) {  // checking if the number is less than or equal to 1 or if it is divisible by b
            return false;
        }
        if (b * b > a) { //checking if the square of b is greater than a
            return true;
        }
        return Prime(a,b + 1); // if both conditions aren't satisfied, call the function recursively
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creating an object of the Scanner class
        int n = sc.nextInt(); //taking inout value from user
        boolean Prime = func(n); //assessing if the number is prime

        if (Prime) {
            System.out.println("Prime"); //if true, then prime
        } else {
            System.out.println("Composite"); //if false, then composite
        }
    }
}