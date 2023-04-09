import java.util.Scanner; //importing scanner from package
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creating Scanner instance
        int a = sc.nextInt(); //getting task number from the user
        switch (a){
            case 1:
                Task1.task1_main(); //performing first task for case 1
                break;
            case 2:
                Task2.task2_main();
                break;
            case 3:
                Task3.task3_main();
                break;
            case 4:
                Task4.task4_main();
                break;
            case 5:
                Task5.task5_main();
                break;
            case 6:
                Task6.task6_main();
                break;
            default:
                System.out.println("please enter number from 1 to 10"); //if the number doesn't match print message
                break;
        }
    }
}

class Task1 {
    public static void task1_main(){
        Scanner scanner = new Scanner(System.in); //creating a Scanner instance
        System.out.println("Enter the length of an array");  //getting the length of an array from user
        int length = scanner.nextInt(); //storing the input in length variable
        int[] arr = new int[length]; //declare a new array with the given length entered by user

        System.out.println("Enter the values of an array"); //getting the values of an array from user
        for (int i=0; i<length; i++) //iterate the array staring with index "0" to "length-1"
        {
            arr[i] = scanner.nextInt(); //reading the values by Scanner
        }
        int minimum = findMin(arr, length); //calling the findMin function to calculate the minimum value
        System.out.println(minimum); //printing the result
    }

    /**
     * Finding the minimum number in an int array using recursion
     * @param arr the integer array
     * @param n the length of the array
     * @return the minimum number in the array
     */

    public static int findMin(int[] arr, int n){
    if (n == 1)
        return arr[0]; //if array has only one value, return it as an answer
        else {
        int min = findMin(arr, n - 1); //calling the function recursively
        return Math.min(min, arr[n-1]); //assessing the smallest value identified until now with the last element in array
        }
    }
}

class Task2 {
    public static void task2_main(){
        Scanner scanner = new Scanner(System.in); //creating a Scanner instance
        System.out.println("Enter the length of an array");  //getting the length of an array from user
        int length = scanner.nextInt(); //storing the input in length variable
        int[] arr = new int[length]; //declare a new array with the given length entered by user

        System.out.println("Enter the values of an array"); //getting the values of an array from user
        for (int i=0; i<length; i++) //iterate the array staring with index "0" to "length-1"
        {
            arr[i] = scanner.nextInt(); //reading the values by Scanner
        }

        double average = findAvrg(arr, arr.length); //calling the findAvrg function to calculate the average
        System.out.println(average); //print the average
        }

        /**
         * Finding the average of n elements in the array using recursive method
         * @param arr an array
         * @param n the number of elements
         * @return the average value of n elements in array
         */
        public static double findAvrg(int[] arr, int n)
        {
            if( n == 0 )
                return 0; //if the value is equal to zero return zero
            else{
                double sum = findAvrg(arr,n-1)*(n-1); //performing the function findAvrg to get the sum of the first n-1 elements
                sum += arr[n-1]; //adding the n-th element to the sum
                return sum/n; //return the average value of n elements
                }
        }
}

class Task3 {
    public static void task3_main() {
        Scanner scanner = new Scanner(System.in); //creating a Scanner instance
        System.out.print("Enter a number: "); //getting a value from user
        int n = scanner.nextInt(); //storing the input in variable n
        if (isPrime(n)) { //checking if the result of isPrime function
            System.out.println("Prime"); //if true, print "Prime"
        } else {
            System.out.println("Composite"); //if false, print "Composite"
        }
    }

    /**
     *Checking if the number is prime or not
     * @param x the integer value that should be checked
     * @return true if the integer value is prime, false if not
     */
    public static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        else {
            return isPrimeRecursion(x, 2); //calling the isPrimeRecursion function with arguments x and 2
        }
    }

    /**
     * Assesing if a given number is prime or not
     * @param a The value to check whether it is prime or not
     * @param b The divisor to check if value "a" is divisible by value b
     * @return True if value "a" is prime, false otherwise
     */
    private static boolean isPrimeRecursion(int a, int b) {
        if (b == a) {
            return true; //if both values are equal, return true
        } else if (a % b == 0) {
            return false; //if "a" is divisible by "b", return false
        } else {
            return isPrimeRecursion(a, b + 1); //call the isPrimeRecursion function recursively
        }
    }
}


class Task4 {
    public static void task4_main() {
        Scanner scanner = new Scanner(System.in); //creating a Scanner instance
        System.out.print("Enter a number: "); //getting a value from user
        int n = scanner.nextInt(); //storing the input in variable n

        int factorial = isFactorial(n); //calling the isFactorial function
        System.out.println(factorial); //printing the result
        }

    /**
     * Calculating the factorial of a number by recursive method
     * @param a the value to calculate the factorial
     * @return the factorial of the value
     */
    public static int isFactorial(int a) {
        if (a == 0) {
            return 1; // base case when number is equal to zero it returns 1
        } else {
            return a * isFactorial(a - 1); // calling func recursively to find factorial
        }
    }
}

class Task5 {
    public static void task5_main(){
        Scanner sc = new Scanner(System.in);  //creating a Scanner instance
        System.out.print("Enter a number: "); //getting a value from user
        int n = sc.nextInt(); //storing the input in variable n

        int fbnc = findFibonacci(n); //calling the findFibonacci to calculate the value of n-th element
        System.out.println(fbnc); //printing the n-th element of the sequence
    }

    /**
     * Finding n-th element of Fibonacci sequence by using recursion
     * @param n index of the element in the sequence
     * @return the value of element with index n
     */
    public static int findFibonacci(int n) {
        if (n == 0) {
            return 0; //base case when n is zero, result is 0
        }
        else if (n == 1) {
            return 1; //base case when n is one, result is one
        }
        else {
            return findFibonacci(n-1) + findFibonacci(n-2); //recursively calculating using the formula
        }
    }
}


class Task6 {
    public static void task6_main(){
        Scanner scanner = new Scanner(System.in); //creating a Scanner instance
        System.out.println("Enter the number");  //getting the number from user
        int a = scanner.nextInt(); //storing the input in variable a

        System.out.println("Enter the power of number to be calculated");  //getting the power of number from user
        int n = scanner.nextInt(); //storing the input in variable n

        int power = Power(a, n); //calling the Power function
        System.out.println(power); //printing the result
    }

    /**
     * Calculating the value of a raised to the power of n using recursion
     * @param a The integer number base
     * @param n The exponent
     * @return Result of "a" to the power of "n"
     */
    public static int Power(int a, int n){
        if (n == 0) {
            return 1; //base case, if n is zero return 1
        }
        if (n > 0) {
            return a * Power(a, n-1); //recursively call the Power function and multiply it with the result
        }
        return -1; //required by compiler
    }
}