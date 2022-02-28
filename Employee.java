
public class Employee extends Person {
protected String office;
protected double salary;
protected MyDate dateHired;



// Default
public Employee(String name) { 
  this(name,0,"none",new MyDate());
}




// Complex
public Employee(String name, double salary, String office, MyDate dateHired) {
  super(name);
  this.salary = salary;
  this.office = office;
  this.dateHired = dateHired;
}

public String getOffice() {
return office;  
}

public void setOffice(String office) {
this.office = office;
}

public double getSalary() {
return salary;
}

public void setSalary(double salary) {
this.salary = salary;
}

public MyDate getdateHired() {
return dateHired;
}

public void setSalary(MyDate dateHired) {
this.dateHired = dateHired;
}

@Override
public String toString() {

  
return "Name: " + getName() + " Class: " + this.getClass().getName();
}
}
