package org.makesystem;


import org.makesystem.model.dao.DaoFactory;
import org.makesystem.model.dao.PersonDao;
import org.makesystem.model.entities.Person;

import java.util.Set;

public class Apagar {
    public static void main(String[] args) {

        PersonDao personDao = DaoFactory.createPersonDao();
        Set<Person> personSet = personDao.findAll();
        for (Person person : personSet) {
            personDao.deleteById(person.getId());
        }
    }

}