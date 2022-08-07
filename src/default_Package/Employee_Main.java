package default_Package;

public class Employee_Main {
    public static void main(String[] args) {
        Employee employee=new Employee("Selcuk Kardes", "Bilisim",3000);

        employee.showInfos();

        Manager manager =new Manager("Selcuk Kardes","Bilisim",3000,10);
        manager.showInfos();
        manager.raiseSalary(100);
    }
}
