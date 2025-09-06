import java.util.Scanner;

public class StringExample {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String word=input.next();
        if(isPalindrome(word)){
            System.out.println("Yes the Given Word "+word+" is a palindrome");
        }
        else{
            System.out.println("Not a Palindrome ");
        }
    }
    static boolean isPalindrome(String word){
        int i=0,j=word.length()-1;
        while(i<j){
            if(word.charAt(i)!=word.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}


class reverseWord{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String word=input.next();
        String reversed=reverse(word);
        System.out.println("Reversed String: "+reversed);
    }
    static String reverse(String word){
        char[] arr=word.toCharArray();
        int i=0,j=arr.length-1;
        while(i<=j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}

class ToggleCase{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String sen=input.nextLine();
        System.out.println("Before Toggle Case :  "+sen);

        toggleCase(sen);
        String toggledSen = toggleCase(sen);
        System.out.println("After Toggle Case: " + toggledSen);
    }

    static String toggleCase(String sen){
        StringBuilder result=new StringBuilder();

        for(char ch: sen.toCharArray()){
            if(Character.isUpperCase(ch)){
                result.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch)){
                result.append(Character.toUpperCase(ch));
            }
            else{
                result.append(ch);
            }
        }
        return result.toString();
    }
}





