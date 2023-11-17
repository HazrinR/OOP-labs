package week7;
import java.util.ArrayList;
import java.util.List;
record Employee(int id, String name, double salary){ }

class EmployeeManagementSystem {
    //metoda: napravimo novi array i u njega ubacimo sve employeee koji imaju vecu ili jednaku platu od minimalne plate
    public List<Employee>filterEmployeesBySalary(List<Employee> employees, double minSalary)
    {
        List<Employee> filteredEmployees=new ArrayList<>();
        for(Employee employee: employees){
            if(employee.salary()>=minSalary){
                filteredEmployees.add(employee);
            }
        }return filteredEmployees;
    }
    //metoda: uzima listu employeers i sracunaj total salary od njih
    public double calculateTotalSalary(List<Employee> employees){
        double totalSalary=0;
        for(Employee employee: employees){
            totalSalary+=employee.salary();
        }
        return totalSalary;
    }
    //metoda: da prikazemo detalje sve za svakog employeeee
    public void displayEmployeeDetails(List<Employee> employees){
        for(Employee employee: employees){
            System.out.println("ID: "+employee.id()+ ", Name: "+ employee.name()+ ", Salary: "+employee.salary());
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        // Creating a list of employees
        List<Employee> employees = List.of(
                new Employee(1, "John Doe", 50000.0),
                new Employee(2, "Jane Smith", 60000.0),
                new Employee(3, "Bob Johnson", 75000.0),
                new Employee(4, "Alice Brown", 45000.0)
        );

        // Filtering employees by minimum salary
        double minSalary = 55000.0;
        List<Employee> filteredEmployees = ems.filterEmployeesBySalary(employees, minSalary);

        // Calculating total salary of all employees
        double totalSalary = ems.calculateTotalSalary(employees);

        // Displaying employee details
        ems.displayEmployeeDetails(employees);

        // Displaying filtered employee details
        System.out.println("\nFiltered Employees (Minimum Salary: " + minSalary + "):");
        ems.displayEmployeeDetails(filteredEmployees);

        // Displaying total salary
        System.out.println("\nTotal Salary of All Employees: " + totalSalary);
    }
}
