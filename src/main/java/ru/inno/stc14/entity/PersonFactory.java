package ru.inno.stc14.entity;

 public class PersonFactory {
    public static Person getPerson(String personType) {
        switch (personType) {
            case "test":
                return new TestPerson();
            case "product":
                return new ProductPerson();
            default:
                return null;
        }
    }
}
