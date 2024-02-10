package com.UjjalDas.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UjjalDas.EmployeeManagement.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

