package com.example.dynammodb.DynamoDB.controller;

import com.example.dynammodb.DynamoDB.entity.Employee;
import com.example.dynammodb.DynamoDB.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

@RestController("/employee")
public class EmployeeController {

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    private EmployeeRepository employeeRepository;

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeRepository.saveEmployee(employee);
    }

    @PutMapping("/{employeeId}")
    public String updateEmployee(@PathVariable String employeeId, @RequestBody Employee employee) {
        return employeeRepository.updateEmployee(employeeId, employee);
    }

    @GetMapping("/{employeeId}")
    public Employee getEmployeeById(@PathVariable String employeeId) {
        return employeeRepository.getEmployeeById(employeeId);
    }

    @DeleteMapping("/{employeeId}")
    public void deleteEmployee(@PathVariable String employeeId) {
        employeeRepository.deleteEmployee(employeeId);
    }

}
