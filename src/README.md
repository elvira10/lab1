# Task 1
### Description
Finding the minimum number of an array of "n" elements containing "n" values
### Explanation
Base case: if there is 1 element in array, return it; otherwise the function recursively calls itself with a smaller array of size n-1 and compares the result with the last value of the initial array to find the minimum value.
### Solution
    public static int findMin(int[] arr, int n){
    if (n == 1)
        return arr[0]; //if array has only one value, return it as an answer
        else {
        int min = findMin(arr, n - 1); //calling the function recursively
        return Math.min(min, arr[n-1]); //assessing the smallest value identified until now with the last element in array
        }
    }

# Task 2
### Description
Finding the average number of an array of "n" elements containing "n" values
### Explanation
Base case: if there is 0 element in array, return 0; otherwise the function recursively calls itself with a smaller array of size and multiplying it with the average of first 'n-1' elements. The last element of an array then is added this sum and the final average is calculated by dividing this sum by n.
### Solution
        public static double findAvrg(int[] arr, int n)
        {
            if( n == 0 )
                return 0; //if the value is equal to zero return zero
            else{
                double sum = findAvrg(arr, n-1)*(n-1); //performing the function findAvrg to get the sum of the first n-1 elements
                sum += arr[n-1]; //adding the n-th element to the sum
                return sum/n; //return the average value of n elements
                }
        }

# Task 3
### Description
Checking if the given number n is prime or not by using recursion
### Explanation
Base case: if b is equal to a, return true value; then it checks if a is divisible by b without any remainder, then it prints false; otherwise the function recursively calls itself with arguments a and b+1, which will check the next integer as a divisor.
### Solution
    private static boolean isPrimeRecursion(int a, int b) {
        if (b == a) {
            return true; //if both values are equal, return true
        } else if (a % b == 0) {
            return false; //if "a" is divisible by "b", return false
        } else {
            return isPrimeRecursion(a, b + 1); //call the isPrimeRecursion function recursively
        }
    }

# Task 4
### Description
Finding the factorial of given number n using recursive method
### Explanation
Base case: if a is equal to 0,  return 1, since 0! = 1; otherwise the function recursively calls itself with a smaller number of value a-1 and multiplies it with result of the previous recursive call until it reaches the base case condition, then it returns the result.
### Solution
    public static int isFactorial(int a) {
        if (a == 0) {
            return 1; // base case when number is equal to zero it returns 1
        } else {
            return a * isFactorial(a - 1); // calling func recursively to find factorial
        }
    }

# Task 5
### Description
Finding the n-th element of Fibonacci sequence by given number n using recursion
### Explanation
Base case: if there n is equal to 0, return 0; if n is equal to 1, return 1; otherwise the function recursively calls itself twice with arguments n-1 and n-2 to find previous numbers and adds their results to get the n number of Fibonacci sequence.
### Solution
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

# Task 6
### Description
Finding the value of an a raised to the power of n using recursion
### Explanation
Base case: if n is 0, return 1, since any number raised to the power of zero is equal to 1; otherwise the function recursively calls itself with a smaller power of n-1 and multiplies it with the result of previous recursive call with argument "a".
### Solution
    public static int Power(int a, int n){
        if (n == 0) {
            return 1; //base case, if n is zero return 1
        }
        if (n > 0) {
            return a * Power(a, n-1); //recursively call the Power function and multiply it with the result
        }
        return -1; //required by compiler
    }

# Task 7
### Description
Printing the array of n elements and with n values in reverse order by recursive method without using any array data structure
### Explanation
Base case: if there is 0 elements in array, the function returns and terminates; otherwise the function recursively calls itself printing the last element with the remaining values of an array using the index n-1, until the function meets the base case condition.
### Solution
    public static void printReversed(int[] arr, int n) {
        if (n == 0) {
            return; //base case
        } else {
            System.out.print(arr[n-1] + " "); //print the last element of array
            printReversed(arr, n-1); //recursively call the function printReversed
        }
    }

# Task 8
### Description
Checking the given string s to assess whether it consists of all digits or not
### Explanation
Base case: if there is no elements in array, return true; otherwise the function recursively calls itself with the first character of the string and checks whether it is a digit using isDigit() method, then does the same operations with remaining string until the base case condition is met. If the first character of the string is not a digit, it automatically returns false.
### Solution
    public static boolean ConsistsAllDigits(String s) {
        if (s.length() == 0) {
            return true; //base case for empty string
        } else {
            char first = s.charAt(0); //declaring first character of string
            if (Character.isDigit(first)) { //checking whether the first character is digit
                String remaining = s.substring(1); //get the remaining substring
                return ConsistsAllDigits(remaining); //checking the remaining substring recursively if it consists of all digits
            }
            else {
                return false; //if fist character of a string is not a digit, then return false
            }
        }
    }

# Task 9
### Description
Calculating the binomial coefficient with given numbers n and k by recursion
### Explanation
Base case:if k is equal to zero or n, return 1 as a result of calculating the binomial coefficient; otherwise the function recursively calls itself with a smaller array "n choose k = (n-1) choose (k-1) + (n-1) choose k", then prints the result in the end.
### Solution
    public static int findingBinomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1; //base case
        } else {
            return findingBinomial(n - 1, k - 1) + findingBinomial(n - 1, k); //calling the function recursively to calculate the result
        }
    }

# Task 10
### Description
Finding GCD of two numbers a and b using recursion by Euclidean Algorithm
### Explanation
Base case:if there is a or b is equal to 0, return b and a, respectively; otherwise the function recursively calls itself with arguments b and remainder of a divided by b, then prints the GCD of two numbers.
### Solution
    public static int calculateGCD(int a, int b){
        if (a == 0) {
            return b; //base case
        }
        else if (b == 0){
            return a; //GCD(a,0)=a
        }
        else {
            return calculateGCD(b, a % b); //recursion using Euclidean algorithm
        }
    }