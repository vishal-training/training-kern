class Employee {
    String name;
    double salary;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Developer extends Employee {
}

class Manager extends Employee {
}

public class EmployeeTypes {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.name = "Rahul";
        dev.salary = 60000;

        Manager mgr = new Manager();
        mgr.name = "Anita";
        mgr.salary = 80000;

        System.out.println("Developer Details");
        dev.displayDetails();

        System.out.println("Manager Details");
        mgr.displayDetails();
    }
}

