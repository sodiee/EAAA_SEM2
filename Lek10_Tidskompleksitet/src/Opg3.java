import java.util.Arrays;

public class Opg3 {
    static int[] tal = {5, 10, 5, 6, 4, 9, 8};

    public static double[] prefixAverage(int[] inputTal) {
        double[] prefixArray = new double[inputTal.length];
        double sum = 0;
        for (int i = 0; i < inputTal.length; i++) {
            sum += inputTal[i];
            prefixArray[i] = sum / (i + 1);
        }
        return prefixArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(prefixAverage(tal)));
    }
}
