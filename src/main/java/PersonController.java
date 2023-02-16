import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {
    private List<Person> personList = new ArrayList<>();

    @PostMapping
    public ResponseEntity <Person> createPerson(@Valid @RequestBody Person p){

    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable int id){

    }

    @GetMapping("/people")
    public ResponseEntity<List<Person>> getPersonList(){

    }

    @PutMapping("{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable int id, Person newPersonData){

    }

    @DeleteMapping("{id}")
    public ResponseEntity<Boolean> deletePerson(@PathVariable int id){

    }
}
