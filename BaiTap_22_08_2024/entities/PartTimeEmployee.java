package BaiTap_22_08_2024.entities;

public class PartTimeEmployee extends Employee {
    private int hoursWorked; // số giờ làm việc
    private double hoursSalary; // mức lương theo giờ

    public PartTimeEmployee(String employeeId, String name, double salary, int hoursWorked, double hoursSalary) {
        super(employeeId, name, salary);
        this.hoursWorked = hoursWorked; //Số giờ làm việc.
        this.hoursSalary = hoursSalary;//Mức lương theo giờ.
    }

    @Override
    public double calculateSalary() {
        return hoursSalary * hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() + " PartTimeEmployee " + "[hoursWorked= " + hoursWorked + ", hoursSalary= " + hoursSalary + "]";
    }

}
