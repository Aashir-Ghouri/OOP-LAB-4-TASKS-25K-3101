public class Employee {
    String id;
    String name;
    String dept;
    double salary;

    Employee(String Pid, String Pname, String Pdept, double Psalary){
        this.id = Pid;
        this.name = Pname;
        this.dept = Pdept;
        this.salary = Psalary;
    }

    Employee(Employee obj){
        this.id = obj.id;
        this.name = obj.name;
        this.dept = obj.dept;
        this.salary = obj.salary;
    }

    public void DisplayInformation(){
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("Department : " + this.dept);
        System.out.println("Salary : " + this.salary);
        System.out.println("------");
    }

    public static void main(String[] args){
        Employee e1 = new Employee("SE-12", "Sam", "Accounts",100000.0);
        Employee e2 = new Employee(e1);

        System.out.println("Original Object :");
        e1.DisplayInformation();

        System.out.println("Duplicate Object : ");
        e2.DisplayInformation();
    }
}
