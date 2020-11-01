package lesson2;

public class Loops {
    public static void main(String[] args) {

        // Task1: Create an array and fill it with 2 number.
        int[] array1 = {2, 2, 2, 2};
        int[] array2 = new int[]{2, 2, 2, 2};

        //Task2: Create an array and fill it with numbers from 1:1000.
        int[] array3 = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array3[i] = i + 1;
        }

        //Task3: Create an array and fill it with odd numbers from -20:20
        int[] array4 = new int[21];

        int index = 0;
        for (int i = -20; i <= 20; i += 2) {
                array4[index] = i;
                index++;
        }

        //Task4: Create an array and fill it. Print all elements which can be divided by 5.
        int[] array5 = {45, 32, -87, -5, -113, 7891, 1, 4, 8};

        for (int i = 0; i < array5.length; i++) {
            if (array5[i] % 5 == 0) {
                System.out.println("Can be divided by 5: " + array5[i]);
            }
        }

        //Task5: Create an array and fill it. Print all elements which are between 24.12 and 467.23.
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] >= 24.12d && array5[i] <= 467.23d) {
                System.out.println(array5[i]);
            }
        }

        //Task6: Create an array and fill it. Print count of elements which can be divided by 2.
        int[] array = {45, 32, -87, 45, -113, 7891, 1, 4, 8};

        int countOfEvenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 == 0)
                countOfEvenNumbers++;
        }
        System.out.println(countOfEvenNumbers);

        //Task7: Given an integer, 0 < N < 21 , print its first 10 multiples.
        int n = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
