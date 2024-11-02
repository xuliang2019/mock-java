package models;

public class Car {
    private String name;
    private Manufacture manufacture;

    public Car(String name, Manufacture manufacture) {
        this.name = name;
        this.manufacture = manufacture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }
}
