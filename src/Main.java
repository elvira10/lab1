import java.util.Scanner; //importing scanner from package
public class Main{
    /**
     * Calculating the factorial of a number by recursive method
     * @param a the value to calculate the factorial
     * @return the factorial of the value
     */
        public static int func(int a) {
            if (a == 0) { // base case when number is equal to zero it returns 1
                return 1;
            }
            else {
                return a * func(a-1); // calling func recursively to find factorial
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); //creating an object of the Scanner class
            int n = sc.nextInt(); //taking user's input and storing it in variable n
            int factorial = func(n); //calculating the factorial
            System.out.println(factorial); //printing the factorial
        }
    }