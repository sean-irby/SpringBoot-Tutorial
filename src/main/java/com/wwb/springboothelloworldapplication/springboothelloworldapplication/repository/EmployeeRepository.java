package com.wwb.springboothelloworldapplication.springboothelloworldapplication.repository;

import com.wwb.springboothelloworldapplication.springboothelloworldapplication.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
