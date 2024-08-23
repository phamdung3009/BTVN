package BaiTap_22_08_2024.entities;

public class FullTimeEmployee extends Employee { // ke thua employee
    private double bonus;

    //constructor: Khởi tạo đối tượng FullTimeEmployee.
    public FullTimeEmployee(String employeeId, String name, double salary, double bonus) {
        super(employeeId, name, salary); //super()->ke thua constructor cua lop cha
        this.bonus = bonus;
    }

    //calculateSalary(): Tính lương của nhân viên full-time bằng cách cộng lương cơ bản với tiền thưởng
    @Override
    public double calculateSalary() {
        return getSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " FullTimeEmployee [bonus=" + bonus + "]";
    }
}
