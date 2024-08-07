package com.twoday.kotlin_spring_boot.basic_class;

public class JavaClass {

    private final String name;
    private final int age;
    private final String address;

    public JavaClass(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

}
