public class ParesImpares {
    public static int sumaPares(int[] nums) {
        int pares = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }

    public static int sumaImpares(int[] nums) {
        int impares = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                impares++;
            }
        }
        return impares;
    }

    public static void main(String[] args) {
        int[] nums = {-6, -72, -3, -1, -80, 4, 13, 110, 32, 65};
        System.out.println("Numero de pares: " + sumaPares(nums));
        System.out.println("Numero de impares: " + sumaImpares(nums));
    }
}