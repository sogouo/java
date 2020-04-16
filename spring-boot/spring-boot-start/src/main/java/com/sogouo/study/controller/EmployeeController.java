package com.sogouo.study.controller;

import com.sogouo.study.model.Employee;
import com.sogouo.study.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * 员工控制层
 * @ RestController
 *      包含如下注解:
 *          @ Controller
 *          @ ResponseBody
 *
 * @ RequestMapping
 *      包含如下注解:
 *          @ GetMapping
 *          @ PostMapping
 *
 * @ RequestBody
 *      获取请求头参数
 *      @ pathVariable
 *      @ pathParam
 *
 * @ Autowired
 *      依赖注入
 *      Target:
 *          ElementType.CONSTRUCTOR,
 *          ElementType.METHOD,
 *          ElementType.PARAMETER,
 *          ElementType.FIELD,
 *          ElementType.ANNOTATION_TYPE
 *
 * 数据校验
 * @ NonNull
 * @ Valid
 *
 */

@RestController
// 类似与Flask 框架里的蓝图bp
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;
    /*
        模拟路由: REST STYLE

        /employees  POST 新建
        /employees GET 所有列表
        /employees/{id} GET 员工详情
        /employees/{id} PUT 更新
        /employees/{id} DELETE 删除
     */
    // 将 EmployeeService 依赖注入到EmployeeController 层
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // 类似Flask 里面的bp.route("", methods=['POST', 'GET', 'PUT', 'DELETE'])
    @RequestMapping(value="", method= RequestMethod.POST)
    void insert(@NonNull @Valid @RequestBody Employee employee) {
        employeeService.insert(employee);
    }

    @RequestMapping(value="", method= RequestMethod.GET)
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
