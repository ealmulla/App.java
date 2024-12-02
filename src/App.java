
public class App {
    public static void main(String[] args) throws Exception {
        int max =  findMax(new int[]{1, 3, 5,7,2});
        System.out.println("the max is: " + max);

    }
    public static Integer findMax(int[] arr) {
        int max = arr[0];
        for ( int i = 1;i< arr.length; i++){
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }
}
