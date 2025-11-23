import java.util.*;

public class Selection_sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int arr[] = new int[n];

        // Input
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        // Output
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
