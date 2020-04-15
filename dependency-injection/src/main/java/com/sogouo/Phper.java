package com.sogouo;

/**
 * 接受任务的工程师: Phper 工程师
 *
 */
public class Phper implements Coder{

    private String name;

    public Phper(String name) {
        this.name = name;
    }

    public void writeCode() {
        System.out.println(this.name + " is writing php code");
    }
}
