import java.util.Arrays;

public class DivideArrays {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30};
        int[] array2 = {2, 5, 0};

        try {
            int[] result = divideArrays(array1, array2);
            System.out.println(Arrays.toString(result));
        } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static int[] divideArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов не совпадают");
        }

        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0) {
                throw new RuntimeException("Деление на ноль");
            }
            result[i] = array1[i] / array2[i];
        }

        return result;
    }
}