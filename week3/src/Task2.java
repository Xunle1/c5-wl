import java.util.ArrayList;

public class Task2 {
    static class Employee {
        private int id;
        private String name;
        private int salary;
        private String managerId;

        public Employee() {}

        public Employee(int id, String name, int salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public Employee(int id, String name, int salary, String managerId) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.managerId = managerId;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    ", managerId=" + managerId +
                    '}';
        }
    }
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Joe", 70000, "3"));
        list.add(new Employee(2, "Henry", 80000, "4"));
        list.add(new Employee(3, "Sam", 60000));
        list.add(new Employee(4, "Max", 90000));
        for (Employee employee:list) {
            System.out.println(employee);
        }
    }
}
