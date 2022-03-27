package gb.ru;

import java.util.Arrays;
import java.util.Random;

public class HomeWork {
    public static void main(String[] args) {
        inversionArr(10);
        System.out.println();
        completionArr();
        System.out.println();
        multiplicationArr();
        System.out.println();
        completionDiagonalArr(5);
        System.out.println(Arrays.toString(completionArr2(4, 5)));
        toFindMaxAndMin(10);
        int[] arr = {2, 2, 3, 4, 2, 1};
        System.out.println(checkBalance(arr));
        System.out.println(Arrays.toString(shiftArr(arr, 3)));

    }

    public static void inversionArr(int length) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(2);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
                System.out.print(arr[i] + " ");
            } else {
                arr[i] = 0;
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void completionArr() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void multiplicationArr() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }

    }

    public static void completionDiagonalArr(int length) {
        int[][] arr = new int[length][length];
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                if (arr[x] == arr[y] || x + y == length - 1) {
                    arr[x][y] = 1;
                }
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static int[] completionArr2(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void toFindMaxAndMin(int length) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(200) - 100;
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[1];
        int min = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Максимальное зеачение " + max);
        System.out.println("Минимальное значение " + min);
    }

    public static boolean checkBalance(int[] arr) {
        int fullSum = 0;
        int sum1 = 0;
        int sum2;
        for (int i = 0; i < arr.length; i++) {
            fullSum = fullSum + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i];
            sum2 = fullSum - sum1;
            if (sum1 == sum2) {
                return true;
            }
        }
        return false;
    }

    public static int[] shiftArr(int[] arr, int n) {
        for (int i = 0; i < arr.length - n - 1; i++) {
            arr[i] = arr[i + n];
        }
        return arr;
    }
}
