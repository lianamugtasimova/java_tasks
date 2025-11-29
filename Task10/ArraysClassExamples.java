import java.util.Arrays;

public class ArraysClassExamples {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 3};
        int[] numbers2 = {5, 2, 8, 1, 9, 3};
        int[] numbers3 = {1, 2, 3, 4, 5};
        
        System.out.println("numbers: " + Arrays.toString(numbers));
        
        // Сравнивает два массива поэлементно
        System.out.println("numbers == numbers2: " + (numbers == numbers2)); // false (разные ссылки)
        System.out.println("Arrays.equals(numbers, numbers2): " + Arrays.equals(numbers, numbers2)); // true
        System.out.println("Arrays.equals(numbers, numbers3): " + Arrays.equals(numbers, numbers3)); // false
        
        // Сортирует массив
        System.out.println("before sorting: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("after sorting: " + Arrays.toString(numbers));
        
        // Бинарный поиск 
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("index on number 8: " + index);
        
        index = Arrays.binarySearch(numbers, 4); // 4 нет в массиве
        System.out.println("index of number 4: " + index); // отрицательный
        
        // Сравнивает два массива лексикографически
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};
        int[] arr3 = {1, 2, 3};
        
        System.out.println("compare(arr1, arr2): " + Arrays.compare(arr1, arr2)); // отрицательное (arr1 < arr2)
        System.out.println("compare(arr2, arr1): " + Arrays.compare(arr2, arr1)); // положительное (arr2 > arr1)
        System.out.println("compare(arr1, arr3): " + Arrays.compare(arr1, arr3)); // 0 (равны)
    }
}