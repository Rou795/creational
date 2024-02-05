package hw.creational;

import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;
    protected boolean isKnownAge = false;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isKnownAge = true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return this.address;
    }

    public boolean hasAddress() {
        return this.getAddress() != null;
    }

    public int getAge() {
        return hasAge() ? age : null;
    }

    public boolean hasAge(){
        return isKnownAge;
    }

    public void happyBirthday() {
        if (this.hasAge()) {
            age++;
        } else {
            System.out.println("Возраст неизвестен.");
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        String result =  "Person(name=" + this.getName()
                        + ", surname=" + this.getSurname();
        result += (this.hasAge()) ? ", age=" + this.getAge() : "";
        result += (this.hasAddress()) ? ", city=" + this.getAddress() : "";
        result += ")";
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder builder = new PersonBuilder();
        builder.setSurname(surname)
                .setAddress(address)
                .setAge(0);
        return builder;
    }
}
