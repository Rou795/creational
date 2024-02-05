package hw.creational;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;
    protected boolean isKnownAge = false;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        this.isKnownAge = true;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        String params = "";
        if (age < 0 || age > 200) {
            throw new IllegalArgumentException(age);
        }
        if (name == null) {
            params += "имя";
        }
        if (surname == null) {
            params += (params.equals("")) ? "фамилия" : ", фамилия";
        }
        if (!params.equals("")) {
            throw new IllegalArgumentException(params);
        }
        Person person = (isKnownAge) ? new Person(name, surname) : new Person(name, surname, age);
        if (address != null) {
            person.setAddress(address);
        }
        return person;
    }
}
