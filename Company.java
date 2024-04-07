import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {

    public static void main(String[] args) {
       
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("pracownik 1", 2000.0, 0);
        employees[1] = new Worker("pracownik 2", 2500.0, "stanowisko 1");
        employees[2] = new Employee("pracownik 3", 3000.0);
        employees[3] = new Worker("pracownik 4", 3500.0,"stanowisko 2");
        employees[4] = new Worker("pracownik 5", 4000.0,"stanowisko 3");

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