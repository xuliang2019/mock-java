import models.Person;

public class PersonUtils {
    private Person person;

    public PersonUtils(Person person) {
        this.person = person;
    }

    public String getManufactureName() {
        return this.person.getCar().getManufacture().getName();
    }

}
