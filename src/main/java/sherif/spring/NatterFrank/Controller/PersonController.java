package sherif.spring.NatterFrank.Controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sherif.spring.NatterFrank.Model.Person;
import sherif.spring.NatterFrank.Model.Repositry.PersonRepositry;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
    @Autowired
    PersonRepositry PR;

    //Get all persons
    @RequestMapping(value="/",method = RequestMethod.GET)
    public List<Person> getAllPersons(){
        return PR.findAll();
    }

    //Get Person by Id
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Optional<Person> getPersonById(@PathVariable("id") ObjectId id){
        return PR.findById(id);
    }

    //Update Person by Id

    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public void updatePersonById(@PathVariable("id") ObjectId id, @Valid @RequestBody Person UpdatedPerson){
        PR.save(UpdatedPerson);
    }

    //Post New Person

    @RequestMapping(value ="/", method = RequestMethod.POST)
    public Person createPerson(@Valid @RequestBody Person newPerson) {
        PR.save(newPerson);
        return newPerson;
    }

}
