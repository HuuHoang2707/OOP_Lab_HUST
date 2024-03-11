import java.util.Arrays;

public class Ex65 {
    public static void main(String[] args) {
        int[] arr = {1789, 2035, 1899, 1456, 2013};

        Arrays.sort(arr);

        double sum = 0;
        double avg_value = 0;

        for (int i:arr) {
            sum +=i;
        }

        avg_value = sum / arr.length;

        System.out.println("Sorted Arrays: " + Arrays.toString(arr));
        System.out.println("Sum: " + sum);
        System.out.println("Average Value : " + avg_value);

    }
}