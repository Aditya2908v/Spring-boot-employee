package com.example.springDataJpaDemo.DAO;

import com.example.springDataJpaDemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
