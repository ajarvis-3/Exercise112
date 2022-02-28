import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class testFaculty {

  @Test
  void testOfficeHrs() {
    Faculty f= new Faculty("Bob");
    f.setOfficeHrs("9 - 6");
    String actual = f.getofficeHrs();
    String expected = "9 - 6";
    assertEquals(actual, expected);
  }
  @Test
  void testgetRank() {
    Faculty f = new Faculty("Bob");
   f.setRank("Teaching Assistant");
   String actual = f.getRank();
   String expected = "Teaching Assistant";
   assertEquals(actual, expected);
  }
  @Test
  void testOfficeHrs_complex() {
    Faculty f = new Faculty("Bob", "9 - 5", "Teaching Assistant");
    f.setOfficeHrs("9 - 6");
    String actual = f.getofficeHrs();
    String expected = "9 - 6";
    assertEquals(actual, expected);
    
  }
  @Test
  void testgetRank_complex() {
    Faculty f = new Faculty("Bob", "9 - 5", "Teaching Assistant");
    f.setRank("Teaching Tech");
    String actual = f.getRank();
    String expected = "Teaching Tech";
    assertEquals(actual, expected);
  }
  @Test
  void testToString() {
    Faculty f = new Faculty("Bob");
    String actual = f.toString();
    String expected = "Name: Bob Class: Faculty";
    assertEquals(actual, expected);
  }
}
