package com.wwb.springboothelloworldapplication.springboothelloworldapplication.controller;

import com.wwb.springboothelloworldapplication.springboothelloworldapplication.entity.Employee;
import com.wwb.springboothelloworldapplication.springboothelloworldapplication.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping("employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> createUser(@RequestBody Employee user) {
        Employee savedEmployee = employeeService.createEmployee(user);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> getUserById(@PathVariable("id") Long userId) {
        Employee user = employeeService.getEmployeeById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Employee>> getAllUsers() {
        List<Employee> users = employeeService.getAllEmployees();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Employee> updateUser(@PathVariable("id") Long userId, @RequestBody Employee user) {
        user.setId(userId);
        Employee updatedUser = employeeService.updateEmployee(user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId) {
        employeeService.deleteEmployee(userId);
        return new ResponseEntity<>("User successfully deleted", HttpStatus.OK);
    }
}
