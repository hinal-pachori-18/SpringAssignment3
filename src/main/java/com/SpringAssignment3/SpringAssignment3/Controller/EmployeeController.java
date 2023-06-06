package com.SpringAssignment3.SpringAssignment3.Controller;

import com.SpringAssignment3.SpringAssignment3.Service.EmployeeService;
import com.SpringAssignment3.SpringAssignment3.entities.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    private static Logger logger = LoggerFactory.getLogger(Employee.class);
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return this.employeeService.showAllEmployees();
    }

    @GetMapping("/employees/{empId}")
    public Optional<Employee> getEmployeeById(@PathVariable String empId) {
        logger.info("Get the data based on Id");
        return this.employeeService.showEmployeeById(Long.parseLong(empId));
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{empId}")
    @ResponseBody
    public String deleteEmployee(@PathVariable String empId) {
        try {
            this.employeeService.deleteEmployee(Long.parseLong(empId));
            logger.info("Successfully deleted");
            return "Successfully deleted";
        } catch (Exception e) {
            logger.warn("Please enter Integer data");
        }
        return null;
    }
}
