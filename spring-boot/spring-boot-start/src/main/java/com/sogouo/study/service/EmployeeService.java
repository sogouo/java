package com.sogouo.study.service;

import com.sogouo.study.model.Employee;
import com.sogouo.study.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 *
 *  员工业务层
 *  1、添加员工
 *  2、查询员工
 *  3、所有员工列表
 *  4、删除员工
 *
 *  注解:
 *      1、@Service 注册业务层
 *      2、AutoWired 依赖注入
 *      3、@Qualifier
 *
 * java.util 工具下的两个工具
 * Optional
 * List
 */

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(@Qualifier("mysqlEmployeeRepository") EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void insert(Employee employee) {
        employeeRepository.insert(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    public Optional<Employee> getEmployeesById(Long id) {
        return employeeRepository.getEmployeeById(id);
    }

    public void updateEmployeeById(long id, Employee employee) {
        employeeRepository.updateEmployeeById(id, employee);
    }

    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteEmployeeById(id);
    }
}
