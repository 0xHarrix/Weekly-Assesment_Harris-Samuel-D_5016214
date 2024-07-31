class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
}

public class EmployeeManagement {
    private Employee[] employees;
    private int size;

    public EmployeeManagement(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee employee) {
        if (size < employees.length) {
            employees[size++] = employee;
        }
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].name + " - " + employees[i].position);
        }
    }

    public void deleteEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == employeeId) {
                employees[i] = employees[--size];
                employees[size] = null;
                break;
            }
        }
    }

    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement(10);
        Employee emp1 = new Employee(1, "Alice", "Manager", 50000.0);
        Employee emp2 = new Employee(2, "Bob", "Developer", 40000.0);

        management.addEmployee(emp1);
        management.addEmployee(emp2);

        management.traverseEmployees();

        management.deleteEmployee(1);
        management.traverseEmployees();
    }
}
