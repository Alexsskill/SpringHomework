package org.example.HomeWork1;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-5, 0, 1, 1, 2, 3, 6, 8, 22, 45, 678};
        int[] arr2 = {-10, 2, 3, 6, 7, 7, 7, 9, 11, 1000, 1010, 1100};

        int[] arr3 = twoArr(arr, arr2);

        // Вывод результата
        for (int num : arr3) {
            System.out.print(num + " ");
        }
    }

    public static int[] twoArr(int[] one, int[] two) {
        int n = one.length;
        int m = two.length;

        int[] result = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (one[i] <= two[j]) {
                result[k++] = one[i++];
            } else {
                result[k++] = two[j++];
            }
        }

        while (i < n) {
            result[k++] = one[i++];
        }

        while (j < m) {
            result[k++] = two[j++];
        }

        return result;
    }
}
