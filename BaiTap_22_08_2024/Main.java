package BaiTap_22_08_2024;


import BaiTap_22_08_2024.entities.*;

public class Main {
    public static void main(String[] args) throws Exception{
        EmployeeManager employeeManager = new EmployeeManager();
        System.out.println("Danh sách sinh viên:");
        Employee fullTime = new FullTimeEmployee("1", "A", 100, 10);
        Employee fartTime = new PartTimeEmployee("2", "B", 120, 8, 20);
        Employee conTract = new ContractEmployee("3", "C", 110, 1000);
        employeeManager.addEmployee(fullTime);
        employeeManager.addEmployee(fartTime);
        employeeManager.addEmployee(conTract);
        employeeManager.listAllEmployees();
        System.out.println("---------------------------------------------");
        double totalSalary = employeeManager.calculateTotalSalary();
        System.out.println("Tổng lương tất cả nhân viên: " + totalSalary);
        System.out.println("---------------------------------------------");
        System.out.println("Tìm kiếm nhân viên theo ID");
        employeeManager.findEmployeeById("1");
        System.out.println("---------------------------------------------");
        System.out.println("Xoá nhân viên theo ID");
        employeeManager.removeEmployee("2");
        employeeManager.listAllEmployees();


    }
}
