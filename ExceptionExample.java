public class ExceptionExample {
    public static void main(String[] args) {
        ExceptionExample example = new ExceptionExample();
        example.throwNullPointerException();
        example.throwIndexOutOfBoundsException();
        example.throwArithmeticException();
    }

    // Метод, генерирующий NullPointerException
    public void throwNullPointerException() {
        String str = null;
        try {
            System.out.println(str.length()); // Вызов метода у null-ссылки
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }

    // Метод, генерирующий IndexOutOfBoundsException
    public void throwIndexOutOfBoundsException() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[5]); // Обращение к несуществующему индексу массива
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException: " + e.getMessage());
        }
    }

    // Метод, генерирующий ArithmeticException
    public void throwArithmeticException() {
        int result;
        try {
            result = 10 / 0; // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}