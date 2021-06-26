package classes_and_objects;

public class Student {
    public  String name;
   private final int rollNo;
   private static int numStudets;


  public Student(String name,int rollNo){
    //  System.out.println(this);
     this.name = name;
     this.rollNo = rollNo;
     numStudets++;
  }

   public int getRollNo(){
       return rollNo;
   }

   public static int getNumStudets(){
      return numStudets;
   }


   public void print(){
       System.out.println(name + ": " + rollNo);
   }

}
