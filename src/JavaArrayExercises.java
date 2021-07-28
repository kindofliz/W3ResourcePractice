import java.util.Arrays;

public class JavaArrayExercises {
    public static void main(String[] args) {


    //1. Write a Java program to sort a numeric array and a string array.

        int[] numArray = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
        String[] textArray = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};

        System.out.println("1. Original numeric array: " + Arrays.toString(numArray));
        Arrays.sort(numArray);
        System.out.println("1. Sorted numeric array: " + Arrays.toString(numArray));

        System.out.println("1. Original string array: " + Arrays.toString(textArray));
        Arrays.sort(textArray);
        System.out.println("1. Sorted string array: " + Arrays.toString(textArray));



    //2. Write a Java program to sort a numeric array and a string array.

        int[] sumValuesArray = {55, 68, 99, 1552, 4, 15, 93, 102};
        int sum = 0;
//        for (int i = 0; i < sumValuesArray.length; i++) {
//            sum += sumValuesArray[i];
//        }
//        System.out.println("The sum of values in this array is (FOR LOOP): " + sum);

        for (int i : sumValuesArray)
            sum += i;
        System.out.println("2. The sum of values in this array is (FOR EACH): " + sum);



    //3. Write a Java program to print the following grid (10x10)

        System.out.println();
        System.out.println("3. Printing out a grid of 0 below: ");
        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d", a[i][j]);
            }
            System.out.println();
        }



    //4. Write a Java program to calculate the average value of array elements.

        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        int sumNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumNumbers += numbers[i];
        }
        double averageNumber = sumNumbers/numbers.length;
        System.out.println("4. The average value of array elements is: " + averageNumber);








    }
}
