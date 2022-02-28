
public class Ex112Main {

  public static void main(String[] args) {
    Person p = new Person("Person");
    Student s = new Student("Student");
    Faculty f = new Faculty("Faculty");
    Employee e = new Employee("Employee");
    Staff st = new Staff("Staff");
    
    System.out.println(p.toString());
    System.out.println(s.toString());
    System.out.println(f.toString());
    System.out.println(e.toString());
    System.out.println(st.toString());
  }

}
