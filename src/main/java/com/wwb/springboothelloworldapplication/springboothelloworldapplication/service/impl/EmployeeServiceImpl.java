package com.wwb.springboothelloworldapplication.springboothelloworldapplication.service.impl;

import com.wwb.springboothelloworldapplication.springboothelloworldapplication.entity.Employee;
import com.wwb.springboothelloworldapplication.springboothelloworldapplication.repository.EmployeeRepository;
import com.wwb.springboothelloworldapplication.springboothelloworldapplication.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        return employeeRepository.findById(employeeId).get();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee existingEmployee = employeeRepository.findById(employee.getId()).get();
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());
        Employee updatedEmployee = employeeRepository.save(existingEmployee);
        return updatedEmployee;
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
