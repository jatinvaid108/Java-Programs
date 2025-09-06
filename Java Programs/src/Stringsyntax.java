public class Stringsyntax {
    public static void main(String[] args) {
        String a="Jatin";
        System.out.println(a);
        String b="Jatin";
        System.out.println(b);

        System.out.println(a==b);   //true becz both a and b are pointing towards same object in string pool

        //Wanna create different object ? use heap memory

        String c=new String("Kartik");
        String d=new String("Kartik");

        System.out.println(c==d);   //false becz two diff object ban gy na in( Heap Memory)
        System.out.println(c.equals(d));  // true Correct way to compare two objects

    }
}
