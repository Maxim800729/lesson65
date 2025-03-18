//interface Testable
//class Test{
//    void sum(int a, int b){
//
//    }
//}
//class Test2 extends Test{
//    @Override
//    void sum(int a, int b) {
//        super.sum(a, b);
//    }
//}
//class Myclass implements Testable {
//    @Override
//
//    public void sum(int a, int b) {
//        System.out.println(a+b);
//    }
//}
//abstract class Test {
//    abstract void sum(int a, int b);
//    abstract int sum(int a, int b, int c);
//}
//interface Tasteble{

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//   void sum(int a, int b);
//int foo(int a, int b);
//}
//interface Predicate {
//    // boolean filter(int value);
//    // void filter(int value);
//    //  int sum(int x, int y);
//     int sum();
//
//    boolean test(int i);
//}


//
//    public static void printArray(List<Integer> list) {
//        for (Integer num : list) {
//            System.out.print(num + " ,");
//        }
//        System.out.println();
//    }
//
//    public static void printArrayEven(List<Integer> list) {
//        for (Integer num : list) {
//            if (num % 2 == 0) {
//                System.out.print(num + " ,");
//            }
//
//        }
//        System.out.println();
//    }
//
//    public static void printArraynotEven(List<Integer> list) {
//        for (Integer num : list) {
//            if (num % 2 != 0) {
//                System.out.print(num + " ,");
//            }
//
//        }
//        System.out.println();
//    }
//
//    public static void printArrayPositive(List<Integer> list) {
//        for (Integer num : list) {
//            if (num > 0) {
//                System.out.print(num + " ,");
//            }
//
//        }
//        System.out.println();
//    }
//
//    public static void printArrayNegative(List<Integer> list) {
//        for (Integer num : list) {
//            if (num < 0) {
//                System.out.print(num + " ,");
//            }
//
//        }
//        System.out.println();
//    }

//      public static void printArrayByFilter(List<Integer> list, Predicate predicate) {
//          for (Integer num : list) {
//              if (predicate.test(num)) {
//                  System.out.print(num + " ,");
//              }
//
//          }
//          System.out.println();
//      }

//    public static void main(String[] args) {
//         List<Integer> list = List.of(-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
//        java.util.function.Predicate<Integer> isEven = x -> x%2 == 0;
//        printArrayByFilter(list,isEven );
//        System.out.println(isEven.test(10));

//        Predicate predicate = () -> 10;


//        Predicate p = x -> {
//            System.out.println(x);
//            System.out.println(x * 10);
//        };
//        List<Integer> list = List.of(-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
//    boolean filter(int value);
//        Predicate all=num -> true;
//        Predicate Even=num -> num % 2 == 0;
//        Predicate NotEven=num -> num % 2 != 0;
//        Predicate Positive=num -> num > 0;
//        Predicate Negative=num -> num < 0;
//        Predicate Delna5=num -> num % 5 == 0;
//        Predicate Delna5i3=num -> num % 5 == 0 && num % 3 == 0;
//        Predicate Delna2ili6=num -> num % 2 == 0 || num % 6 == 0;
//        Predicate Delna7ili11=num -> num % 7 == 0 || num % 11 == 0;

//        printArrayByFilter(list,all );
//        printArrayByFilter(list,Even );
//        printArrayByFilter(list,NotEven );
//        printArrayByFilter(list,Positive );
//        printArrayByFilter(list,Negative );
//        printArrayByFilter(list,Delna5 );
//        printArrayByFilter(list,Delna5i3 );
//        printArrayByFilter(list,Delna2ili6 );
//        printArrayByFilter(list,Delna7ili11 );


//        printArray(list);
//        printArrayEven(list);
//        printArraynotEven(list);
//        printArrayPositive(list);
//        printArrayNegative(list);
//        printArrayDelna5(list);
//        void sum(int a, int b);

//Tasteble tasteble=(x,y)->  x+y;
//tasteble.sum(10,20);
//        Tasteble plus=(x,y)->{
//            x*=2;
//            y*=3;
//            return x+y;
//        };
//        Tasteble minus=(x,y)->x-y;
//        Tasteble delen=(x,y)->x/y;
//        Tasteble umnoj=(x,y)->x*y;
//        System.out.println(plus.foo(10,2));
//        System.out.println(minus.foo(30,88));
//        System.out.println(delen.foo(30,88));
//        System.out.println(umnoj.foo(30,88));
//        Test test = new Test() {
//            @Override
//            void sum(int a, int b) {
//                System.out.println(a + b);
//            }
//
//            @Override
//            int sum(int a, int b, int c) {
//                return a+b+c;
//            }
//        };
//        test.sum(10,20);
//        Test test=new Test() {
//            @Override
//            public void sum(int a, int b) {
//                System.out.println(a + b);
//            }
//        };
//            @Override
//            void sum(int a, int b) {
//                super.sum(a, b);
//            }
//        };
//        test.sum(10,30);


//        Myclass myclass=new Myclass();
//        myclass.sum(10,20);
//        Testable testable = new Testable() {
//            @Override
//            public void sum(int a, int b) {
//                System.out.println(a + b);
//            }
//        };
//        testable.sum(10, 50);

//    }
//}
//
//interface Testable1 {
//
//    int sum(int a, int b);
//}
//
//interface Testable2 {
//    boolean isEmpty(String str);
//}
//
//interface Length {
//    int len(String str);
//}
//
//interface MaxNumber {
//    int max(int a, int b);
//}
//
//interface isEven {
//    boolean foo(int a);
//}
//
//interface Square {
//    int num(int a);
//}
//
//interface MessagePrinter {
//    void printMessage();
//}
//
//interface StringTransformer {
//    String transformer(String str3);
//}
//
//interface StringChecker {
//    boolean containsSubstring(String str4, String substring);
//}
//
//interface StringToNumber {
//    int convert(String str5);
//}
//
//public class Main {


//    public static void main(String[] args) {
////1) Напишите лямбда-выражение, которое принимает два целых числа и возвращает их сумму.
//        Testable1 testable1 = (a, b) -> a + b;
//        System.out.println(testable1.sum(10, 20));
////2) Создайте лямбда-выражение, которое проверяет, является ли строка пустой.
//        Testable2 testable2 = (str -> str.isEmpty());
//        String str = "Hello!";
//        System.out.println(testable2.isEmpty(str));
////3) Напишите лямбда-выражение, которое принимает строку и возвращает её длину.
//        Length length = len -> len.length();
//        System.out.println(length.len(str));
////4) Создайте лямбда-выражение, которое возвращает максимальное из двух чисел.
//        MaxNumber maxNumber = (x, y) -> x > y ? x : y;
//        System.out.println(maxNumber.max(10, 40));
////5) Напишите лямбда-выражение для проверки, является ли число четным.
//
//        isEven isEven = x -> x % 2 == 0;
//        System.out.println(isEven.foo(7));
////6) Напишите лямбда-выражение, которое возводит число в квадрат.
//        Square square = x -> x * x;
//        System.out.println(square.num(10));
////7) Создайте лямбда-выражение, которое выводит на экран строку.
//        MessagePrinter printer = () -> System.out.println("Hello");
//        printer.printMessage();
////8) Напишите лямбда-выражение, которое принимает строку и возвращает её в верхнем регистре.
//        StringTransformer toUpperCase = str3 -> str.toUpperCase();
//        String result = toUpperCase.transformer("hello");
//        System.out.println(result);
////9) Напишите лямбда-выражение, которое проверяет, содержит ли строка подстроку.
//        StringChecker containsChecker = (str4, substring) -> str.contains(substring);
//        System.out.println(containsChecker.containsSubstring("hello , java", "world"));
//        System.out.println(containsChecker.containsSubstring("hello , java", "World"));
////10) Напишите лямбда-выражение, которое преобразует строку в число.
//        StringToNumber stringToInt = str5 -> Integer.parseInt(str5);
//        System.out.println(stringToInt.convert("123"));
////11) Создайте лямбда-выражение, которое умножает isдва числа и возвращает результат.
//        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
//        int result1 = multiply.apply(3, 5);
//        System.out.println("Результат умножения: " + result1);
////12) Напишите лямбда-выражение, которое проверяет, является ли число положительным.
//        Predicate<Integer> isPositive = num -> num > 0;
//        System.out.println(isPositive.test(4));
//        System.out.println(isPositive.test(-4));
//
////13) Напишите лямбда-выражение для фильтрации всех чётных чисел из списка.
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> evenNumbers = numbers.stream()
//                .filter(num -> num % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println("Четные числа" + evenNumbers);
//
//
//// 14) Напишите лямбда-выражение, которое находит наибольший элемент в списке чисел.
//        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Optional<Integer> maxNumber2 = numbers.stream()
//                .max(Integer::compareTo);
//        maxNumber2.ifPresent(max -> System.out.println("наибольший элемент в списке чисел " + max));
//
////15) Напишите лямбда-выражение, которое сортирует список строк по длине.
//        List<String> words = Arrays.asList("Bannan", "dog", "house", "apple");
//        words.sort(Comparator.comparingInt(String::length));
//        System.out.println("Отсортированные строки по длине " + words);
//// 16) Создайте лямбда-выражение, которое возвращает строку без пробелов в начале и в конце.
//        Function<String, String> trimString = s -> s.trim();
//        String input = "  Hello, Java!  ";
//        String result3 = trimString.apply(input);
//        System.out.println("Исходная строка: \"" + input + "\"");
//        System.out.println("Обработанная строка: \"" + result3 + "\"");
////17) Напишите лямбда-выражение, которое объединяет два списка в один.
//        List<Integer> list1 = Arrays.asList(1, 2, 3);
//        List<Integer> list2 = Arrays.asList(4, 5, 6);
//
//        List<Integer> mergedList = mergeLists(list1, list2, (l1, l2) ->
//                Stream.concat(l1.stream(), l2.stream())
//                        .collect(Collectors.toList()));
//        System.out.println(mergedList);
//    }
//
//    public static <T> List<T> mergeLists(List<T> list1, List<T> list2,
//                                         Merger<List<T>, List<T>, List<T>> merger) {
//        return merger.merge(list1, list2);
//    }
//
//    @FunctionalInterface
//    interface Merger<T, U, R> {
//        R merge(T t, U u);
//
//        //18) Напишите лямбда-выражение, которое возвращает строку с первой буквой в верхнем регистре.
//        Function<String, String> capitalize = str ->
//                (str == null || str.isEmpty()) ? str : str.substring(0, 1).toUpperCase() + str.substring(1);
//
//        System.out.println(capitalize.apply("hello"));
//
//
////19) Напишите лямбда-выражение, которое находит разницу между двумя датами.
////        20) Напишите лямбда-выражение, которое проверяет, является ли строка числом.
//    }
//}
//
//
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.*;

public class LambdaTasks {
    public static void main(String[] args) {
        // 1) Сумма двух чисел
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println("Сумма: " + sum.apply(5, 7));

        // 2) Проверка на пустую строку
        Predicate<String> isEmpty = str -> str == null || str.isEmpty();
        System.out.println("Строка пустая? " + isEmpty.test(""));

        // 3) Длина строки
        Function<String, Integer> stringLength = String::length;
        System.out.println("Длина строки: " + stringLength.apply("Hello"));

        // 4) Максимальное из двух чисел
        BinaryOperator<Integer> maxNumber = Math::max;
        System.out.println("Максимальное число: " + maxNumber.apply(10, 20));

        // 5) Проверка на четность
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Число четное? " + isEven.test(8));

        // 6) Возведение в квадрат
        UnaryOperator<Integer> square = num -> num * num;
        System.out.println("Квадрат числа: " + square.apply(4));

        // 7) Вывод строки на экран
        Consumer<String> printString = System.out::println;
        printString.accept("Выводим строку!");

        // 8) Строка в верхний регистр
        Function<String, String> toUpperCase = String::toUpperCase;
        System.out.println("Верхний регистр: " + toUpperCase.apply("java"));

        // 9) Проверка, содержит ли строка подстроку
        BiPredicate<String, String> containsSubstring = String::contains;
        System.out.println("Содержит подстроку? " + containsSubstring.test("hello world", "world"));

        // 10) Объединение двух строк
        BinaryOperator<String> concatenate = String::concat;
        System.out.println("Объединенные строки: " + concatenate.apply("Hello, ", "World!"));

        // 11) Проверка на положительное число
        Predicate<Integer> isPositive = num -> num > 0;
        System.out.println("Число положительное? " + isPositive.test(10));

        // 12) Фильтрация четных чисел из списка
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        numbers.stream().filter(isEven).forEach(System.out::println);

        // 13) Поиск наибольшего элемента в списке
        List<Integer> numList = Arrays.asList(3, 7, 2, 9, 5);
        Optional<Integer> maxElement = numList.stream().max(Integer::compare);
        maxElement.ifPresent(value -> System.out.println("Наибольшее число: " + value));

        // 14) Сортировка списка строк по длине
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "strawberry");
        strings.sort(Comparator.comparingInt(String::length));
        System.out.println("Сортированные строки: " + strings);

        // 15) Удаление пробелов в начале и конце строки
        Function<String, String> trimString = String::trim;
        System.out.println("Обрезанная строка: '" + trimString.apply("   hello   ") + "'");

        // 16) Объединение двух списков
        BiFunction<List<Integer>, List<Integer>, List<Integer>> mergeLists = (l1, l2) -> {
            List<Integer> result = new ArrayList<>(l1);
            result.addAll(l2);
            return result;
        };
        List<Integer> merged = mergeLists.apply(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));
        System.out.println("Объединенный список: " + merged);

        // 17) Первая буква в верхнем регистре
        Function<String, String> capitalizeFirst = str ->
                str.isEmpty() ? str : str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.println("Первая буква заглавная: " + capitalizeFirst.apply("java"));

        // 18) Разница между датами
        BiFunction<LocalDate, LocalDate, Long> dateDifference = (d1, d2) ->
                ChronoUnit.DAYS.between(d1, d2);
        System.out.println("Разница в днях: " + dateDifference.apply(LocalDate.of(2023, 3, 1), LocalDate.of(2023, 3, 15)));

        // 19) Проверка, является ли строка числом
        Predicate<String> isNumeric = str -> str.matches("-?\\d+(\\.\\d+)?");
        System.out.println("Строка - число? " + isNumeric.test("1234"));
    }
}

