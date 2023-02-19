import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManagementSystem {
    // This is to a create a map to store employees, where each employee has a unique ID
    private Map<Integer, Employee> employees = new HashMap<>();

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("Welcome to the Employee Management System!");
            System.out.println("Please select one of the following options:");
            System.out.println("1. Add an Employee");
            System.out.println("2. Remove an Employee");
            System.out.println("3. View Employee Information");
            System.out.println("4. View All Employees");
            System.out.println("5. Update Employee Information");
            System.out.println("6. Search for an Employee by Name");
            System.out.println("7. Quit");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    system.addEmployee(scanner);
                    break;
                case 2:
                    system.removeEmployee(scanner);
                    break;
                case 3:
                    system.viewEmployee(scanner);
                    break;
                case 4:
                    system.viewAllEmployees();
                    break;
                case 5:
                    system.updateEmployeeInformation(scanner);
                    break;
                case 6:
                    system.searchEmployeeByName(scanner);
                    break;
                case 7:
                    quit = true;
                    break;
                default:
                System.out.println("Oops! That's an invalid option. Please try again.");
                    break;
            }
        }
    }

    // This is a method to add a new employee
    public void addEmployee(Scanner scanner) {
        System.out.println("Great! Let's add a new employee.");
        System.out.println("What's the name of the employee?");
        String name = scanner.nextLine();
        System.out.println("What's the employee's ID number?");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What's the employee's position?");
        String position = scanner.nextLine();
        System.out.println("What's the employee's email (optional)?");
        String email = scanner.nextLine();
        System.out.println("What's the employee's phone number (optional)?");
        String phoneNumber = scanner.nextLine();
        Employee newEmployee = new Employee(name, id, position, email, phoneNumber);
        employees.put(id, newEmployee);
        System.out.println("Success! Employee with ID " + id + " has been added.");
    }

    // This is a method to remove an employee
    public void removeEmployee(Scanner scanner) {
        System.out.println("What's the ID of the employee you'd like to remove?");
        int id = scanner.nextInt();
        scanner.nextLine();
        Employee removedEmployee = employees.remove(id);
        if (removedEmployee != null) {
            System.out.println("Great! Employee with ID " + id + " has been removed.");
        } else {
            System.out.println("Oops! No employee with ID " + id + " was found.");
        }
    }

    // This is a method to view the employee information

    public void viewEmployee(Scanner scanner) {
        System.out.println("What's the ID of the employee you'd like to view?");
        int id = scanner.nextInt();
        scanner.nextLine();
        Employee e = employees.get(id);
        if (e != null) {
            System.out.println("Here's the information for employee with ID " + id + ":");
            System.out.println("Name: " + e.getName());
            System.out.println("ID: " + e.getId());
            System.out.println("Position: " + e.getPosition());
            System.out.println("Email: " + e.getEmail());
            System.out.println("Phone Number: " + e.getPhoneNumber());
        } else {
            System.out.println("Oops! No employee with ID " + id + " was found.");
        }
    }

    // The method to view all employees

    public void viewAllEmployees() {
        if (employees.size() == 0) {
            System.out.println("There are no employees in the system.");
        } else {
        System.out.println("Here's a list of all employees:");
        for (Employee e : employees.values()) {
        System.out.println("Name: " + e.getName());
        System.out.println("ID: " + e.getId());
        System.out.println("Position: " + e.getPosition());
        System.out.println("Email: " + e.getEmail());
        System.out.println("Phone Number: " + e.getPhoneNumber());
        System.out.println("------------");}
        }
    }
        
    // This is the method to update the employee information
        
    public void updateEmployeeInformation(Scanner scanner) {
        System.out.println("Please enter the ID of the employee you would like to update:");
        int id = scanner.nextInt();
        scanner.nextLine();
        Employee e = employees.get(id);
        if (e != null) {
            System.out.println("Please enter the updated employee's name (press enter to keep current name):");
            String name = scanner.nextLine();
            if (!name.isEmpty()) {
                e.setName(name);
            }
            System.out.println("Please enter the updated employee's position (press enter to keep current position):");
            String position = scanner.nextLine();
            if (!position.isEmpty()) {
                e.setPosition(position);
            }
            System.out.println("Please enter the updated employee's email (press enter to remove email):");
            String email = scanner.nextLine();
            e.setEmail(email);
            System.out.println("Please enter the updated employee's phone number (press enter to remove phone number):");
            String phoneNumber = scanner.nextLine();
            e.setPhoneNumber(phoneNumber);
            System.out.println("Employee with ID " + id + " has been updated.");
        } else {
            System.out.println("No employee with ID " + id + " was found.");
        }
    }

    // This is the method to search an employee by name
    
    public void searchEmployeeByName(Scanner scanner) {
        System.out.println("Please enter the name of the employee you would like to search for:");
        String name = scanner.nextLine();
        boolean foundEmployee = false;
        for (Employee e : employees.values()) {
            if (e.getName().equalsIgnoreCase(name)) {
                System.out.println("Name: " + e.getName());
                System.out.println("ID: " + e.getId());
                System.out.println("Position: " + e.getPosition());
                System.out.println("Email: " + e.getEmail());
                System.out.println("Phone Number: " + e.getPhoneNumber());
                System.out.println("------------");
                foundEmployee = true;
            }
        }
        if (!foundEmployee) {
            System.out.println("No employee with name " + name + " was found.");
        }
    }
}


