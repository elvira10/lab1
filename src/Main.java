public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 1, 32, 3, 45}; //creating an array with given numbers
        int min = findMin(arr, arr.length); //calling the findMin function and store it in min
        System.out.println(min); //printing minimum
    }

    /**
     * Finding the minimum number in an int array using recursion
     * @param arr the integer array
     * @param n the length of the array
     * @return the minimum number in the array
     */
    public static int findMin(int[] arr, int n){
        if(n == 1) //if the length of an array is equal to 1, return the single value
            return arr[0];
        else {
            int min = findMin(arr, n - 1); //calling the function recursively
            return Math.min(min, arr[n-1]); //assessing the smallest value identified until now with the last element in array
        }
    }
}