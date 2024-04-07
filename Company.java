import employees.Employee;
import employees.Manager;

public class Company {

    public static void main(String[] args) {
       
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("pracownik 1", 2000.0);
        employees[1] = new Employee("pracownik 2", 2500.0);
        employees[2] = new Employee("pracownik 3", 3000.0);
        employees[3] = new Employee("pracownik 4", 3500.0);
        employees[4] = new Employee("pracownik 5", 4000.0);

   int nonManagerCount = 0;
   for (Employee employee : employees) {
       if (!(employee instanceof Manager)) {
           nonManagerCount++;
       }
   }
   ((Manager) employees[0]).setNumberOfSubordinates(nonManagerCount);

   employees[0].setSalary(7500.0);

   System.out.println("Dane wszystkich pracowników:");
   for (Employee employee : employees) {
       System.out.println(employee);
   }
}
}