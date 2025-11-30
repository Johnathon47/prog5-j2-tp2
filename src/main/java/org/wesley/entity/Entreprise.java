package org.wesley.entity;

public class Entreprise implements Locationneurable {
    private String name;

    public Entreprise(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void rent(Locationable item) {
        System.out.println("Entreprise" + name + "rent a " + item.getDescription());
    }
}
