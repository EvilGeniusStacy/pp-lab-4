import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {

    public static void main(String[] args) {
       
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("pracownik 1", 2000.0, 0);
        employees[1] = new Worker("pracownik 2", 2500.0, "stanowisko 1");
        employees[2] = new Employee("pracownik 3", 3000.0);
        employees[3] = new Worker("pracownik 4", 3500.0,"stanowisko 2");
        employees[4] = new Worker("pracownik 5", 4000.0,"stanowisko 3");
        employees[5] = new Manager("pracownik 6", 7000.0, 0);
        employees[6] = new Worker("pracownik 7", 5000.0,"stanowisko 4");

        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary()+500);
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(2);
                employee.setSalary(75000);
       }
   }
   System.out.println("Dane wszystkich pracowników:");
   for (Employee employee : employees) {
       System.out.println(employee);
   }
}
}