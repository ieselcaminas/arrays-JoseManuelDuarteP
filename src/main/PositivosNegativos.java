public class PositivosNegativos {
    public static int sumaPositivos(int[] nums) {
        int positivos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                positivos += nums[i];
            }
        }
        return positivos;
    }

    public static int sumaNegativos(int[] nums) {
        int negativos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                negativos += nums[i];
            }
        }
        return negativos;
    }

    public static void main(String[] args) {
        int[] nums = {-6, -72, -3, -1, -80, 4, 13, 110, 32, 65};
        System.out.println("Los positivos suman: " + sumaPositivos(nums));
        System.out.println("Los negativos suman: " + sumaNegativos(nums));
    }
}