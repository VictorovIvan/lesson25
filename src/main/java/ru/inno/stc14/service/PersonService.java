package ru.inno.stc14.service;

import ru.inno.stc14.entity.Person;
import ru.inno.stc14.entity.PersonFactory;

import java.util.Date;
import java.util.List;

public interface PersonService {

    List<Person> getList();

    boolean addPerson(String name, String birth);

    String constMode = "test";

    Person authorizationPerson = PersonFactory.getPerson(PersonService.constMode);

    Date safeParseDate(String birthStr);


}
