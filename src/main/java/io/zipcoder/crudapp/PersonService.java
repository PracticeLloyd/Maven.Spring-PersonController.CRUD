package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public Person createPerson(Person p){
        return this.personRepository.save(p);
    }

    public Person getPerson(Long id){
        return this.personRepository.findOne(id);
    }

    public List getPersonList(){
        return (List<Person>) personRepository.findAll();
    }

    public Person updatePerson (Person p){
        return this.personRepository.save(p);
    }

    public Boolean deletePerson(Long id){
        personRepository.delete(id);
        return true;
    }

}
