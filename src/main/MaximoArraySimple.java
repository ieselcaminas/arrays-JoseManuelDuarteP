public class MaximoArraySimple {
    public static int maximoArray() {
        int[] nums = {6, 7, 3, 1, 8, 4, 13, 110, 32, 65};
        int max = 0;

        for (int i = 0 ; i < nums.length ; i++) {

            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("El más grande es: " + maximoArray());
    }
}