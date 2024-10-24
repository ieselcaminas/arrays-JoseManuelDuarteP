public class MaximoArray {
    public static int maximoArray() {
        int[] nums = {6, 7, 3, 1, 8, 4, 13, 110, 32, 65};
        int max = 0;
        int comp = 0;

        for (int i = 1 ; i < nums.length ; i++) {

                if (nums[i] > nums[comp] && nums[comp] > max) {
                    max = Math.max(nums[i], nums[comp]);
                }
                comp++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("El más grande es: " + maximoArray());
    }
}