package com.sogouo.study.repository;


/**
 * 注解:
 *      1、@Repository
 *      2、
 */

import com.sogouo.study.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;



@Repository("mysqlEmployeeRepository")
public interface EmployeeRepositoryImpl extends JpaRepository<Employee, Long>, EmployeeRepository {

    @Override
    default void insert(Employee employee) {
        save(employee);
    }

    @Override
    default List<Employee> getAllEmployees() {
        return findAll();
    }

    @Override
    default Optional<Employee> getEmployeeById(Long id) {
       return findById(id);
    }

    @Override
    default void updateEmployeeById(Long id, Employee employee) {
        save(new Employee(id, employee.getName()));
    }

    @Override
    default void deleteEmployeeById(long id) {
        deleteById(id);
    }
}
