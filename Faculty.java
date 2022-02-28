
public class Faculty extends Employee {
  public static String TEACHING_ASSISTANT = "Teaching Assistant";
  public static String ADJUNCT_PROFESSOR = "Adjunct Professor";
  
  
  protected String officeHrs;
  protected String rank;
  
  
  
  public Faculty(String name) { // Default constructor
  this(name,"9 - 5","Faculty Member");
  }
  
  
  
  public Faculty(String name, String officeHrs, String rank) {
    super(name);
    this.officeHrs = officeHrs;
    this.rank = rank;
  }

  public String getofficeHrs() {
    return officeHrs;  
    }
  
  public void setOfficeHrs(String officeHrs) {
    this.officeHrs = officeHrs;
    }
  public String getRank() {
    return rank;  
    }
  public void setRank(String rank) {
    this.rank = rank;
    }

  @Override
  public String toString() {

    
  return "Name: " + getName() + " Class: " + this.getClass().getName();
  }
}
