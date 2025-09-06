package OopsInJava;

public class Constructors3 {
    public static class Player{
        String name;
        int age;
        int NoOfMatches;
        String country;

        //static keyword so that our value must get updated
        static int noOfPlayers;     //Ek alag box ban jayega it will not be in constructor

        public Player(){

        }     //Default Constructor

        public Player(String n,int a,int m,String c){
            name=n;
            age=a;
            NoOfMatches=m;
            country=c;

            noOfPlayers++;
        }
    }


    public static void main(String[] args) {
        Player p1=new Player("Virat Kholi",32,227,"India");
        System.out.println(p1.name);
        System.out.println(p1.noOfPlayers);

        Player p2=new Player("Rohit Sharma",35,233,"India");
        System.out.println(p2.noOfPlayers);

        Player p3=new Player("Hardik Pandya",27,118,"India");
        System.out.println(p3.noOfPlayers);

        System.out.println(p1.noOfPlayers);   //Since Value is Static so updated value show hoegi
    }
}
