public class Person {
protected String name;
protected String address;
protected String phoneNumber;
protected String email;




public Person(String name) {
this.name = name;
}
public String getName() {
return name;  
}
public void setName(String name) {
this.name = name;
}
public String getAddress() {
return address;  
}
public void setAddress(String address) {
this.address = address;
}
public String getPhone() {
return phoneNumber;
}
public void setPhone(String phoneNumber) {
this.phoneNumber = phoneNumber;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
@Override
public String toString() {

  
return "Name: " + getName() + " Class: " + this.getClass().getName();
}
}

