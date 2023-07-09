import java.util.Arrays;

public class SubtractArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        try {
            int[] result = subtractArrays(array1, array2);
            System.out.println(Arrays.toString(result));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int[] subtractArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Длины массивов не совпадают");
        }

        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] - array2[i];
        }

        return result;
    }
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}