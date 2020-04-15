package com.sogouo;


/**
 * 发布任务
 *
 *
 */
public class Task {

    private String name;
    private Coder owner;

    public Task(String name) {
        this.name = name;
    }

    public Coder getOwner() {
        return owner;
    }

    public void setOwner(Coder owner) {
        this.owner = owner;
    }

    public void start() {
        System.out.println(this.name + " started");
        this.owner.writeCode();
    }
}
