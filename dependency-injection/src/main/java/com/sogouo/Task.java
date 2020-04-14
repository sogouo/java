package com.sogouo;


/**
 * 发布任务
 *
 *
 */
public class Task {

    private String name;
    private Phper owner;

    public Task(String name) {
        this.name = name;
        this.owner = new Phper("李四");
    }

    public void start() {
        System.out.println(this.name + " started");
        this.owner.writeCoding();
    }
}
