package org.checkconsulting;

public class Person2 {
    private String firstName;
    private String lastName;
    private int age;


    public Person2(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int hashCode() {
        return this.firstName.hashCode() + this.lastName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || obj.getClass() != this.getClass())
            return false;

        Person2 p = (Person2) obj;
        return (p.firstName.equals(this.firstName) && lastName.equals(p.lastName)) && p.age == this.age;
    }

    @Override
    public String toString() {
        return "Person(firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", age=" + this.getAge() + ")";
    }
}