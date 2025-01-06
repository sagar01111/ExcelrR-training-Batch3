public class Employee {

    private String name;
    private  String lastName;
    private  double salary;

    public  String getLastName() { return lastName; }
    public  String getName() { return name; }
    public  double getSalary() { return salary; }

    public  void raise(double raise) { salary = salary + (salary * .1); }

    public  Employee(String name, String lastName, double salary) {
        this.name = name;
        this.lastName = lastName;

        if (salary > 0.0) {
          this.salary = salary;
        }
    }
} 

public class EmployeeTest {

    public  static void main(String[] args) {

        Employee raise1 = new Employee("Betty", "Jones", 4000.0);
        Employee raise2 = new Employee("Sally", "Mae", 6000.0);

        System.out.printf("Employee #1\nFirst Name: %s\nLast Name: %s\n\n" + "Salary: $%f", raise1.getName(), raise1.getLastName(), raise1.getSalary());

        System.out.printf("Her raise will be: %d", raise1.raise(salary));

        System.out.printf("Employee #1\nFirst Name: %s\nLast Name: %s\n\n" + "Salary: %f", raise1.getName(), raise1.getLastName(), raise1.getSalary());

        raise2.raise(salary);
    }
}