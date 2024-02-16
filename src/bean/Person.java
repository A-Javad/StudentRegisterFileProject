package bean;

import java.io.Serializable;

public abstract class Person implements Serializable {
    private String name;
    private String surname;
    private int Age;


     Person(){
    }

     Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        Age = age;
    }
    @Override
    public String toString() {
        return
                "Ad:=" + name +'\''+  "Soyad:=" + surname;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
