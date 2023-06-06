package com.SpringAssignment3.SpringAssignment3.Repository;

import com.SpringAssignment3.SpringAssignment3.entities.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
