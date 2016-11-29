package com.zrun.model;

/**
 * Created by zhao_xuesong on 2016/11/29.
 */
public class User extends BaseEntity {
    private Integer age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
