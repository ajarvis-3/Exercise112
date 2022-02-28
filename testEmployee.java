import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class testEmployee {

  @Test
  void testgetOffice() {
    Employee e = new Employee("George");
    e.setOffice("Ypsilanti");
      String actual = e.getOffice();
      String expected = "Ypsilanti";
      assertEquals(actual, expected);
      
  }
  @Test
  void testgetSalary() {
    Employee e = new Employee("George");
    e.setSalary(1234.00);
      double actual = e.getSalary();
      double expected = 1234.00;
      assertEquals(actual, expected);
      
  
}
  @Test
  void testgetdateHired() {
    Employee e = new Employee("George");
      MyDate actual = new MyDate(1,1,1);
      actual = e.getdateHired();
      MyDate expected = new MyDate(1,1,1);
      equals(actual == expected);
      
  
}
  @Test 
  void testGetOffice_complex() {
    Employee e = new Employee("Ashton Jarvis", 1234.00, "Ypsilanti", null);
    e.setOffice("Ann Arbor");
    String actual = e.getOffice();
    String expected = "Ann Arbor";
    assertEquals(actual, expected);
  }
  @Test
  void testgetSalary_complex() {
    Employee e = new Employee("George", 1234.00, "Ypsilanti", null);
        e.setSalary(234.00);
        double actual = e.getSalary();
        double expected = 234.00;
        assertEquals(actual, expected);
  }
  @Test
  void testdateHired_complex() {
      MyDate d = new MyDate(1,1,1);
      Employee e = new Employee("George", 1234.00, "Ypsilanti", d);
      MyDate actual = e.getdateHired();
      MyDate expected = new MyDate(1,1,1);
      equals(actual == expected);
  }
  @Test
  void testToString() {
    Employee e = new Employee("Ashton Jarvis");
    String actual = e.toString();
    String expected = "Name: Ashton Jarvis Class: Employee";
    assertEquals(actual, expected);
  }
}