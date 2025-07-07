
class employe{
    String name;
    int id;
    double salary;

        public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class fulltime extends employe{
    public fulltime(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}

class parttime extends employe{
}
class contract extends employe{
}

public class EmployeePayroll {
    public static void main(String[] args) {
        fulltime emp1 = new fulltime("John Doe", 101, 50000);
        emp1.display();
    }
}