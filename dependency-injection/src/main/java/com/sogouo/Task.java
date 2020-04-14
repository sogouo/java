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
    }

    public Phper getOwner() {
        return owner;
    }

    public void setOwner(Phper owner) {
        this.owner = owner;
    }

    public void start() {
        System.out.println(this.name + " started");
        this.owner.writeCoding();
    }
}
