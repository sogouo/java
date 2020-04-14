package com.sogouo;


/**
 * 脚踏实地理解依赖注入(DI) 和 控制反转(IOC)
 *
 * 场景: 把任务指派给个程序员完成
 *
 * 案例基于面线对象编程来设计.
 * 通常在面向对象设计中, 名词皆可设计为对象。基于上面的场景,
 * 任务、程序员是名词, 因此需要创建两个类(Class): 任务(Task) 和 Phper(php程序员)
 *
 * 通常类库的(jar 包)使用者不需要也不应该来修改类库的源码, 如果大家都来修改类库都源码，类库就失去了
 *
 * 重用设计初衷
 *
 * 应该让用户来指派任务负责人
 *
 * Step2: 解决在不改变类库代码的情况下，可以指定任何Phper 程序员
 *
 * 从这示例中，任务依赖程序员, Task类依赖于Phper 类，v1.0 Task类绑定特定的实例，现在这种依赖可以在使用时
 * 按需绑定, 这就是依赖注入
 *
 */

public class StudyStart {

    public static void main(String[] args) {
        Task task = new Task("登录模块 #1");
        Phper owner = new Phper("赵六");
        task.setOwner(owner);
        task.start();
    }
}
