package Recursion;
import java.util.*;

public class Subsequence {
    static void func(int idx,int[] arr,int n, List<Integer> ds){
        if(idx>=n){
            System.out.println(ds);
            return;
        }

        ds.add(arr[idx]);
        func(idx+1,arr,n,ds);

        ds.remove(ds.size()-1);
        func(idx+1,arr,n,ds);

    }
    public static void main(String[] args) {
        int[] arr={3,1,2};
        int n=3;
        List<Integer> ds=new ArrayList<>();
        func(0,arr,n,ds);
    }
}


//Lets write function instead

class sequence{

    static List<List<Integer>> generateSubsequence(int idx,int n,int[] arr,List<Integer> ds){
        List<List<Integer>> result=new ArrayList<>();
        if(idx>=n){
            result.add(new ArrayList<>(ds));
            return result;
        }

        ds.add(arr[idx]);
        result.addAll(generateSubsequence(idx+1,n,arr,ds));

        ds.remove(ds.size()-1);
        result.addAll(generateSubsequence(idx+1,n,arr,ds));

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        int n = arr.length;

        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> allSubsequences = generateSubsequence(0, n,arr,ds);

        // Print all subsequences
        for (List<Integer> subseq : allSubsequences) {
            System.out.println(subseq);
        }
    }
}

class Test{
    public static void main(String[] args) {
        int arr[]={3,8,1,9};
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}


