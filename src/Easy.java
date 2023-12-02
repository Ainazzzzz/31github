import java.util.Arrays;

public class Easy {
    public static void main(String[] args) {
        int[] aoa = {5,5,5,10,20};
        System.out.println(Arrays.toString(plusOne(aoa)));

    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }

    return   digits;}

}
