import java.util.Scanner; //importing scanner from package
public class Main {
    /**
     * Finding n-th element of Fibonacci sequence by using recursion
     * @param n index of the element in the sequence
     * @return the value of element with index n
     */
    public static int func(int n) {
        if (n == 0) { //base case when n is zero, result is 0
            return 0;
        }
        else if (n == 1) { //base case when n is one, result is one
            return 1;
        }
        else {
            return func(n-1) + func(n-2); //recursively calculating using the formula
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creating an object of the Scanner class
        int n = sc.nextInt(); //taking user's input and storing it in variable n
        int fbnc = func(n); //calling the function to calculate the value of n-th element
        System.out.println(fbnc); //printing the n-th element of the sequence
    }
}