import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner input=new Scanner(System.in);

        for(int i=0;i<5;i++){
            list.add(input.nextInt());
        }

//        System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
