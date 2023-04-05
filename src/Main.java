public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 1, 32, 3, 45}; //creating an array with given numbers
        int min = findMin(arr, arr.length);
        System.out.println(min); //printing min
    }

    /**
     *
     * @param arr
     * @param n
     * @return
     */
    public static int findMin(int[] arr, int n){
        if(n == 1)
            return arr[0];
        else {
            int min = findMin(arr, n - 1);
            return Math.min(min, arr[n-1]);
        }
    }
}