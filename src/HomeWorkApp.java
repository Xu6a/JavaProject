import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        zadanie1(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int [100];
        zadanie2(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        zadanie3(arr3);
        System.out.println(Arrays.toString(arr3));

        int[][] arr4 = new int [5][5];
        zadanie4(arr4);
        doubleArray(arr4);

        int initialValue = 3;
        int size = 7;
        int[] arr5 = zadanie5(initialValue, size);
        System.out.println(Arrays.toString(arr5));

    }

    public static void zadanie1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void zadanie2(int[] arr2) {
        for (int i=0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
    }

    public static void zadanie3(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
    }

    public static void zadanie4(int[][] arr4) {
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = 1;
        }
    }
    public static void doubleArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static int[] zadanie5(int initialValue, int len) {
        int[] arr5 = new int[len];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = initialValue;
        }
        return arr5;
    }
}