//Unique elements More than 1,2,3
//Unique element Sum leetcode
//Shift element to the Right
//Shift element to the left
//Shifting the Negative number to one side WHile Preserving the order  gfg


import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraysQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Initialize ArrayList
        ArrayList<Integer> arr = new ArrayList<>();

        // Input elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }

        // Find unique elements
        ArrayList<Integer> uniqueElements = unique(arr);

        // Print unique elements
        System.out.println("Unique Elements: " + uniqueElements);

        sc.close();
    }

    static ArrayList<Integer> unique(ArrayList<Integer> arr) {
        int len = arr.size();

        // Sort the array
        Collections.sort(arr);

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            // If the current element appears only once, add it to the result
            if ((i == 0 || !arr.get(i).equals(arr.get(i - 1))) && (i == len - 1 || !arr.get(i).equals(arr.get(i + 1)))) {
                result.add(arr.get(i));
            }
        }

        return result;
    }
}


class insertionSort {
    public static void insertsort(int arr[])
    {
        int n,i,j,temp;
        n=arr.length;
        for (i=1;i<n;i++){
            temp = arr[i];
            j=i-1;
            while (j>=0 && arr[j]>=temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args){
        int arr[]={4,1,9,3,8,5,7,2};
        insertsort(arr);
        System.out.println(Arrays.toString(arr));
    }

}


//import java.util.Arrays;

class MergeSort {
    static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays back into arr[l..r]
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void mergesort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            mergesort(arr, l, m);
            mergesort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 7, 3, 1, 4};
        System.out.println("The array is: " + Arrays.toString(arr));
        mergesort(arr, 0, arr.length - 1);
        System.out.println("Sorted array is: " + Arrays.toString(arr));
    }
}




