package az.kontakt.shop.service;

import az.kontakt.shop.model.Employee;
import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployeeList() throws Exception;

    List<Employee> searchEmployeeData(String keyword) throws Exception;

    void deleteEmployee(Long employeeId) throws Exception;

    void addEmployee(Employee employee) throws Exception;

    Employee getEmployeeByID(Long selectedId) throws Exception;

    void updateEmployee(Employee employee) throws Exception;
}