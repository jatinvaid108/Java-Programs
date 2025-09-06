package OopsInJava;

//When Something is private : It becomes difficult to change it or access them .
//Therefore here comes the concept of getters and setters


//private wali cheez dot operator se nahi use ho skti but we can access them within the class na

public class Functions2 {
    public static class Stu{
        String name;
        private int rollno;
        double per;

        public int getRollNo(){
            return rollno;
        }

//        public void setRollNo(int y){
//           rollno=y;
//        }

        public void setRollNo(int rollno){

            this.rollno=rollno;
        }
    }
    public static void main(String[] args) {
        Stu s1=new Stu();
        s1.setRollNo(88);
        System.out.println(s1.getRollNo());
    }
}
