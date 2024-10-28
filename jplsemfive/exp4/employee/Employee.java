package jplsemfive.exp4.employee;

import java.util.*;

public class Employee {
    private String name;
    private String id;
    private int age;

    public Employee(String name, String id, int age) {
        setName(name);
        setId(id);
        setAge(age);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }
}
