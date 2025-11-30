package org.wesley.entity;

public class Association implements Locationneurable{
    private String name;

    public Association(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void rent(Locationable item) {
        System.out.println("Association" + name + "rent a " + item.getDescription());
    }
}
