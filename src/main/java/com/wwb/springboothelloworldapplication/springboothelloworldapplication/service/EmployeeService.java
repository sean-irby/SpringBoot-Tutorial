package com.wwb.springboothelloworldapplication.springboothelloworldapplication.service;

import com.wwb.springboothelloworldapplication.springboothelloworldapplication.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    Employee getEmployeeById(Long employeeId);

    List<Employee> getAllEmployees();

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Long employeeId);
}
