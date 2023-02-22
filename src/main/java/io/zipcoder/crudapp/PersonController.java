package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {
    private List<Person> personList = new ArrayList<>();
    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }
    @PostMapping
    public ResponseEntity <Person> createPerson(@Valid @RequestBody Person p){
        personList.add(p);
        return new ResponseEntity<>(personService.createPerson(p), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable Long id){
        return new ResponseEntity<>(personService.getPerson(id), HttpStatus.OK);
    }

    @GetMapping("/people")
    public ResponseEntity<List<Person>> getPersonList(){
        return new ResponseEntity<>(personList, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Person> updatePerson(@RequestBody Person p){
        return new ResponseEntity<>(personService.createPerson(p),HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Boolean> deletePerson(@PathVariable Long id){
        personService.deletePerson(id);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
}
