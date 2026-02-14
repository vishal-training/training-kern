import java.util.*;

interface Employee {
    double calculateSalary();
}

class FullTimeEmployee implements Employee {
    public double calculateSalary() {
        return 50000;
    }
}

class PartTimeEmployee implements Employee {
    public double calculateSalary() {
        return 20000;
    }
}

class ContractEmployee implements Employee {
    public double calculateSalary() {
        return 30000;
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new FullTimeEmployee());
        list.add(new PartTimeEmployee());
        list.forEach(e -> System.out.println(e.calculateSalary()));
    }
}
