# Примеры кода

В данном репозитории представлены примеры кода на языке Java. Каждый пример решает определенную задачу и содержит соответствующие комментарии для лучшего понимания.

## Содержание

1. [Обработка исключений](#обработка-исключений)
2. [Представленный код ](#Представленный-код)
3. [Вычитание элементов массивов](#вычитание-элементов-массивов)
4. [Деление элементов массивов](#деление-элементов-массивов)



## Обработка исключений

### Описание

Пример кода `ExceptionExample.java` содержит методы, которые генерируют различные типы исключений, такие как `NullPointerException`, `IndexOutOfBoundsException` и `ArithmeticException`. В каждом методе происходит попытка выполнить определенное действие, которое приводит к генерации соответствующего исключения.

### Использование

```java
ExceptionExample example = new ExceptionExample();
example.throwNullPointerException();
example.throwIndexOutOfBoundsException();
example.throwArithmeticException();
```

## Представленный код

### Описание

В представленном коде можно получить следующие типы исключений:

```java
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
```

1. `NumberFormatException`: Метод `Integer.parseInt()` вызывается для преобразования строки в целое число. Если строка не может быть корректно преобразована в число, будет сгенерировано исключение `NumberFormatException`.

2. `ArrayIndexOutOfBoundsException`: Во внутреннем цикле `for`, если значение переменной `j` превышает количество столбцов (`5`), то обращение к элементу `arr[i][j]` будет выходить за границы массива `arr` и вызовет исключение `ArrayIndexOutOfBoundsException`.

3. `NullPointerException`: Если переменная `arr` имеет значение `null` или один из элементов массива `arr[i]` равен `null`, то при попытке обратиться к `arr[i][j]` будет сгенерировано исключение `NullPointerException`.

Таким образом, в представленном коде есть потенциал для генерации трех разных типов исключений: `NumberFormatException`, `ArrayIndexOutOfBoundsException` и `NullPointerException`.


## Вычитание элементов массивов

### Описание

Пример кода `SubtractArrays.java` содержит метод `subtractArrays`, который принимает в качестве аргументов два целочисленных массива и возвращает новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, генерируется исключение `IllegalArgumentException`.

### Использование

```java
int[] array1 = {1, 2, 3};
int[] array2 = {4, 5, 6};

try {
    int[] result = SubtractArrays.subtractArrays(array1, array2);
    System.out.println("Результат вычитания массивов: " + Arrays.toString(result));
} catch (IllegalArgumentException e) {
    System.out.println("Ошибка: " + e.getMessage());
}
```

## Деление элементов массивов

### Описание

Пример кода `DivideArrays.java` содержит метод `divideArrays`, который принимает в качестве аргументов два целочисленных массива и возвращает новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны или происходит деление на ноль, генерируется исключение

`RuntimeException`.

### Использование

```java
int[] array1 = {10, 20, 30};
int[] array2 = {2, 5, 0};

try {
    int[] result = DivideArrays.divideArrays(array1, array2);
    System.out.println("Результат деления массивов: " + Arrays.toString(result));
} catch (RuntimeException e) {
    System.out.println("Ошибка: " + e.getMessage());
}
```

В каждом примере приведено описание задачи, описание метода (класса) и пример использования. В случае возникновения исключений, пользователю будет показано сообщение об ошибке.