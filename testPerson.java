import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class testPerson {

  @Test
  void testgetName() {
    Person p = new Person("Ashton Jarvis");
    String actual = p.getName();
    String expected = "Ashton Jarvis";
    assertEquals(actual, expected);
  }
  @Test
  void testSetName() {
    Person p = new Person("Paul");
    p.setName("Steve");
    String actual = p.getName();
    String expected = "Steve";
    assertEquals(actual, expected);
  }
  @Test
  void testgetAddress() {
    Person p = new Person("Ashton Jarvis");
    p.setAddress("400 W Circle Dr");
    String actual = p.getAddress();
    String expected = "400 W Circle Dr";
    assertEquals(actual, expected);
  }
  @Test
  void testPhoneNumber() {
    Person p = new Person("Ashton Jarvis");
    p.setPhone("7346751234");
    String actual = p.getPhone();
    String expected = "7346751234";
    assertEquals(actual, expected);
  }
  @Test
  void testemail() {
    Person p = new Person("Ashton Jarvis");
    p.setEmail("myname@gmail.com");
    String actual = p.getEmail();
    String expected = "myname@gmail.com";
    assertEquals(actual, expected);
  }
  @Test
  void testToString() {
    Person p = new Person("Ashton Jarvis");
    String actual = p.toString();
    String expected = "Name: Ashton Jarvis Class: Person";
    assertEquals(actual, expected);
  }
}
