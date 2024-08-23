package BaiTap_22_08_2024.entities;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    //Thêm một nhân viên vào danh sách
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    //Tìm kiếm và trả về thông tin của nhân viên dựa vào employeeId. Nếu không tìm thấy nhân viên, ném ra ngoại lệ EmployeeNotFoundException.
    public void findEmployeeById(String employeeId) throws Exception {
        if (employees.contains(employeeId)) {
            throw new Exception(employeeId + " EmployeeNotFoundException");
        }
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(employeeId)) {
                System.out.println(employee);
                break;
            }
        }
    }

    //Xóa một nhân viên khỏi danh sách dựa vào employeeId. Nếu không tìm thấy nhân viên, ném ra ngoại lệ EmployeeNotFoundException.
    public void removeEmployee(String employeeId) throws Exception {
        if (employees.contains(employeeId)) {
            throw new Exception(employeeId + " EmployeeNotFoundException");
        }
        employees.remove(employeeId);
    }

    //Tính tổng lương của tất cả các nhân viên trong danh sách.
    public double calculateTotalSalary() {
        double sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    }

    //Liệt kê tất cả các nhân viên trong công ty.
    public void listAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
