import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class testStaff {

  @Test
  void testTitle() {
  Staff s = new Staff("Paul");
  s.setTitle("JUnit Sensei");
  String actual = s.getTitle();
  String expected = "JUnit Sensei";
  assertEquals(actual, expected);
  
  }
  @Test
  void testTitle_complex() {
  Staff s = new Staff("Staff", "JUnit Sensei");
  s.setTitle("Broom Guy");
  String actual = s.getTitle();
  String expected = "Broom Guy";
  assertEquals(actual, expected);
  }
  
  @Test
  void testToString() {
    Staff s = new Staff("Ashton Jarvis");
    String actual = s.toString();
    String expected = "Name: Ashton Jarvis Class: Staff";
    assertEquals(actual, expected);
  }
  }

