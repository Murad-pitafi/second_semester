class job
{
   private String role; private int id , salary;

   public String getRole() {
      return role;
   }

   public void setRole(String role) {
      this.role = role;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getSalary() {
      return salary;
   }

   public void setSalary(int salary) {
      this.salary = salary;
   }
}
class Person
{
   job obj = new job() ;
   Person()
   {
      obj.setSalary(56456);
      System.out.println("salary " + obj.getSalary());
   }

}
public class OOPLAB9_TASK1 {
   public static void main(String[] args) {
     try
     {
        Person obj1 = new Person();
     }catch (NullPointerException e )
     {
        System.out.println(e);
     }

   }
}
