import java.util.*;
import java.util.stream.Collectors;

public class EmployeeManagementSystem {

    private final Map<Integer, Employee> employeeMap;

    public EmployeeManagementSystem() {
         // Implementation here
         this.employeeMap=new HashMap<>();
    }

    public void addEmployee(int id, String name, int age, double salary) {
         // Implementation here
         employeeMap.put(id,new Employee(id,name,age,salary));
    }

    public Employee getEmployeeById(int id) {
         // Implementation here
         return employeeMap.get(id);
    }

    public void updateEmployee(int id, String name, int age, double salary) {
         // Implementation here
         employeeMap.put(id,new Employee(id,name,age,salary));
    }

    public void deleteEmployee(int id) {
         // Implementation here
         employeeMap.remove(id);
    }

    public List<Employee> getAllEmployees() {
         // Implementation here
         return new ArrayList<>(employeeMap.values());
    }

    public List<Employee> sortEmployeesByName() {
         // Implementation here
         return new ArrayList<>.sort(Employee.values());
    }

    public List<Employee> findEmployeesBySalary(double salaryThreshold) {
         // Implementation here
       ArrayList<Employee> em=new ArrayList<Employee>();
    
        int i;
        while(true)
        {
            Employee e;
            int count=employeeMap.size();
            for(int i=1;i<=count;i++)
            {
            e=getEmployee(i);
            if(e.salary==salaryThreshold)
            em.add(e);
            }
        }
        return em;
        // return new ArrayList<>(Employee.values(salaryThreshold));

    }

    public double calculateAverageSalary() {
        // Implementation here
        return 1;
    }
    
    
    
    //donot touch

    class Employee {
        private final int id;
        private final String name;
        private final int age;
        private final double salary;

        public Employee(int id, String name, int age, double salary) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{id=" + id + ", name='" + name + "', age=" + age + ", salary=" + salary + '}';
        }
    }
	
	
	//donot touch
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        int numberOfOperations = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 0; i < numberOfOperations; i++) {
            String[] operation = scanner.nextLine().trim().split(" ");

            switch (operation[0]) {
                case "addEmployee":
                    int id = Integer.parseInt(operation[1]);
                    String name = operation[2];
                    int age = Integer.parseInt(operation[3]);
                    double salary = Double.parseDouble(operation[4]);
                    system.addEmployee(id, name, age, salary);
                    break;

                case "getEmployeeById":
                    id = Integer.parseInt(operation[1]);
                    System.out.println(system.getEmployeeById(id));
                    break;

                case "updateEmployee":
                    id = Integer.parseInt(operation[1]);
                    name = operation[2];
                    age = Integer.parseInt(operation[3]);
                    salary = Double.parseDouble(operation[4]);
                    system.updateEmployee(id, name, age, salary);
                    break;

                case "deleteEmployee":
                    id = Integer.parseInt(operation[1]);
                    system.deleteEmployee(id);
                    break;

                case "getAllEmployees":
                    List<Employee> employees = system.getAllEmployees();
                    employees.forEach(System.out::println);
                    break;

               case "sortEmployeesByName":
                    List<Employee> sortedEmployees = system.sortEmployeesByName();
                    sortedEmployees.forEach(System.out::println);
                    break;

                case "findEmployeesBySalary":
                    double salaryThreshold = Double.parseDouble(operation[1]);
                    List<Employee> employeesBySalary = system.findEmployeesBySalary(salaryThreshold);
                    employeesBySalary.forEach(System.out::println);
                    break;

                case "calculateAverageSalary":
                    System.out.println(system.calculateAverageSalary());
                    break;

                default:
                    System.out.println("Invalid operation");
                    break;
            }
        }

        scanner.close();
    }
}