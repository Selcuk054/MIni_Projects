package default_Package;

public class Manager extends Employee  {

    private int num_of_employees;






    public Manager(String name, String department, int salary, int num_of_employees) {
        super(name, department, salary);
        this.num_of_employees=num_of_employees;

    }
    public void raiseSalary(int amount){
        System.out.println("Calisanlara "+ amount + " tl zam yapildi");


    }
    @Override
    public void showInfos() {
        System.out.println("Bilgiler..");
        System.out.println("Isim :"+getName());
        System.out.println("Department :"+getDepartment());
        System.out.println("Maas :"+getSalary() );
}
}