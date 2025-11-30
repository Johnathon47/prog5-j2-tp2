package org.wesley.entity;

public class Person implements Locationneurable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void rent(Locationable item) {
        System.out.println(name + "rented a " + item.getDescription());
    }
}
