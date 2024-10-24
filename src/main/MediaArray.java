public class MediaArray {
    public static double mediaArray() {
        double media;
        int suma = 0;
        int[] nums = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

        for (int i = 0; i < nums.length; i++) {
            suma += nums[i];
        }
        media = (double) suma / nums.length;

        return media;
    }

    public static void main(String[] args) {
        System.out.println("La media es: " + mediaArray());
    }
}