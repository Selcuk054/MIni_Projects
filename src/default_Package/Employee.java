package default_Package;

public class Employee { //Calisan class i

    private String name;
    private String department;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public void showInfos(){

        System.out.println("Bilgiler..");
        System.out.println("Isim :"+this.name);
        System.out.println("Department :"+this.department);
        System.out.println("Maas :"+this.salary);
    }
}
