package com.UjjalDas.EmployeeManagement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UjjalDas.EmployeeManagement.Entity.Employee;
import com.UjjalDas.EmployeeManagement.Exceptions.ResourceNotFoundException;
import com.UjjalDas.EmployeeManagement.Repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id : " + id));
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        Employee employee = getEmployeeById(id);
        employee.setFirstName(updatedEmployee.getFirstName());
        employee.setLastName(updatedEmployee.getLastName());
        employee.setEmail(updatedEmployee.getEmail());
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        if (!employeeRepository.existsById(id)) {
            throw new ResourceNotFoundException("Employee not found with id : " + id);
        }
        employeeRepository.deleteById(id);
    }

    public List<Employee> searchEmployeesByFirstName(String firstName) {
        return employeeRepository.findByFirstName(firstName);
    }

    public List<Employee> getAllEmployeesSorted(String order) {
        if ("asc".equalsIgnoreCase(order)) {
            return employeeRepository.findAllByOrderByFirstNameAsc();
        } else if ("desc".equalsIgnoreCase(order)) {
            return employeeRepository.findAllByOrderByFirstNameDesc();
        } else {
            throw new IllegalArgumentException("Invalid sorting order: " + order);
        }
    }
}
