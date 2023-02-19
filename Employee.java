// This is a class for an Employee object, which represents an employee in the Employee Management System
public class Employee {
    private String name;
    private int id;
    private String position;
    private String email;
    private String phoneNumber;

// This is the constructor for an Employee object, which initializes its instance variables with the given values
    public Employee(String name, int id, String position, String email, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getPosition() {
        return position;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}    