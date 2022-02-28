import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class testStudent {

  @Test
  void testStatus() {
  Student s = new Student("Ashton");
  s.setStatus("Junior");
  String actual = s.getStatus();
  String expected = "Junior";
  assertEquals(actual, expected);

  }
  @Test
  void testStatus_complex() {
  Student s = new Student("Ashton", "Junior");
  s.setStatus("Senior");
  String actual = s.getStatus();
  String expected = "Senior";
  assertEquals(actual, expected);
  }
  
  @Test
  void testToString() {
    Student s = new Student("Ashton Jarvis");
    String actual = s.toString();
    String expected = "Name: Ashton Jarvis Class: Student";
    assertEquals(actual, expected);
  }
}
