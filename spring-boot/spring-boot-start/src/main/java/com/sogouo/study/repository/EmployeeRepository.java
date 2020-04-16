package com.sogouo.study.repository;


import com.sogouo.study.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {

    // 新增员工
    void insert(Employee employee);

    // 所有信息
    List<Employee> getAllEmployees();

    // 单个信息
    Optional<Employee> getEmployeeById(Long id);

    // 更新
    void updateEmployeeById(Long id, Employee employee);

    // 删除
    void deleteEmployeeById(long id);
}
