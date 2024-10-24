public class MinimoArray {
    public static int minimoArray() {
        int[] nums = {6, 7, 3, 1, 8, 4, 13, 110, 32, 65};
        int min = nums[0];

        for (int i = 0 ; i < nums.length ; i++) {

            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("El más pequeño es: " + minimoArray());
    }
}