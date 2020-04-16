package com.sogouo.study.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 *
 * 1、声明员工类
 * 2、将员工类与数据库员工类通过 JPA 映射关联
 *
 * 需要如下注解
 *
 * 1、@Entity
 * 2、@Table
 * 3、@Id
 * 4、GeneratedValue: 生成值
 *      在运行时进行注入到Bean容器中
 *      可以添加在方法或者属性上
 *      主要就是为一个实体生成一个唯一标识的主键
 *      (JPA要求每一个实体Entity,必须有且只有一个主键),
 *      @GeneratedValue 提供了主键的生成策略, 默认是 GenerationType.AUTO
 *
 *
 * 5、@NotBlank: 不能为空
 *
 *
 * No default constructor for entity:  : com.sogouo.study.model.Employee;
 * nested exception is org.hibernate.InstantiationException:
 * No default constructor for entity:  : com.sogouo.study.model.Employee
 * 对该实体没有默认构造函数
 */
@Entity
@Table(name = "employee")
public class Employee {

    // 自增id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // 姓名
    @NotBlank
    private String name;

    // No default constructor for entity
    // 为啥是默认初始化呢?
    public Employee() {
    }

    public Employee(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
