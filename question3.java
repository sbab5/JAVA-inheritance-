//Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.
import java.util.Scanner;

class Person {
    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }
}

class Employee extends Person {
    private String empid;
    private String jobtitle;

    public Employee(String firstname, String lastname, String empid, String jobtitle) {
        super(firstname, lastname);
        this.empid = empid;
        this.jobtitle = jobtitle;
    }

    public String getEmployeeId() {
        return empid;
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    public String getJobTittle(){
        return jobtitle;

    }
}

public class question3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the details:");
        System.out.println("Enter first name of employee:");
        String firstName = scn.nextLine();
        System.out.println("Enter last name of employee:");
        String lastName = scn.nextLine();
        System.out.println("Enter employee id:");
        String empId = scn.nextLine();
        System.out.println("Enter job title:");
        String jobTitle = scn.nextLine();

        Employee emp = new Employee(firstName, lastName, empId, jobTitle);
        
        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
      //  System.out.println("Job Title: " + getJobTitle());
    }
}
