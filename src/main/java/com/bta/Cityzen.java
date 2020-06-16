package com.bta;

public class Cityzen {
    private long id;
    private String last_name;
    private int age;
    private String name;

    public Cityzen(long id, String last_name, int age, String name) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.age = age;

    }

    public Cityzen(String name, int age, String last_name) {
        this.name = name;
        this.last_name = last_name;
        this.age = age;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nCityzen{" +
                "id=" + id +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


