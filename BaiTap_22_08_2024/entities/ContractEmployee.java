package BaiTap_22_08_2024.entities;

public class ContractEmployee extends Employee {
    private double contractAmount;
    public ContractEmployee(String employeeId, String name, double salary, double contractAmount) {
        super(employeeId, name, salary);
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return contractAmount;
    }
    @Override
    public String toString() {
        return super.toString() + " ContractEmployee [contractAmount= " + contractAmount + "]";
    }
}
