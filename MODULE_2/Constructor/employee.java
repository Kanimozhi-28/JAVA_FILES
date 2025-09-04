public class employee {
    String name;
    int age;
    double salary;
    static String companyname;

    public employee(String a, int b, double c) {
        name = a;
        age = b;
        salary = c;

    }
}

class mainfunction {
    public static void main(String[] args) {
        employee emp = new employee("kani", 21, 80.90);
        System.out.println(emp.name);
        System.out.println(emp.age);
        System.out.println(emp.salary);
        System.out.println(employee.companyname);
        System.out.println("--------");
        employee emp1 = new employee("mozhi", 11, 70.90);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.salary);
        System.out.println(employee.companyname);
        System.out.println("--------");

        employee emp2 = new employee("kani", 21, 80.90);
        System.out.println(emp2.name);
        System.out.println(emp2.age);
        System.out.println(emp2.salary);
        System.out.println(employee.companyname);
    }
}
