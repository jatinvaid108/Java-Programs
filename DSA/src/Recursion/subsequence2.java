package Recursion;

//Write the code to count the no of subsequence who sum is k/target......

public class subsequence2 {

    static int countSubsequences(int idx, int currSum, int[] arr, int target, int n) {
        // Base Case
        if (idx == n) {
            if(currSum == target ) return 1;
            else return 0;
        }

        // Include current element
        currSum += arr[idx];
        int left = countSubsequences(idx + 1, currSum, arr, target, n);
        currSum -= arr[idx];  // backtrack

        // Exclude current element
        int right = countSubsequences(idx + 1, currSum, arr, target, n);

        return left + right;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int n = arr.length;
        int k = 2;

        int count = countSubsequences(0, 0, arr, k, n);
        System.out.println("Total subsequences with sum " + k + " = " + count);
    }
}
