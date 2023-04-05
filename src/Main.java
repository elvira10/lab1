public class Main {
    public static void main(String[] args) {
        int[] arr ={3, 2, 4, 1}; //creating an array with given numbers

        double average = findavrg(arr, arr.length); //calling the findavrg function
        System.out.println(average); //print the average
    }

    /**
     * Finding the average of n elements in the array using recursive method
     * @param arr an array
     * @param n the number of elements
     * @return the average value of n elements in array
     */
    public static double findavrg(int[] arr, int n)
    {
        if( n == 0 )
            return 0; //if the value is equal to zero return zero
        else{
            double sum = findavrg(arr,n-1)*(n-1); //performing the function findavrg to get the sum of the first n-1 elements
            sum += arr[n-1]; //adding the n-th element to the sum
            return sum/n; //return the average value of n elements
        }
    }
}