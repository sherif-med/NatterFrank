package sherif.spring.NatterFrank.Controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sherif.spring.NatterFrank.Model.Person;
import sherif.spring.NatterFrank.Model.Repositry.PersonRepositry;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    PersonRepositry PR;

    //Get all persons

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<Person> getAllPersons(){
        return PR.findAll();
    }

    //Get Person by Id

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Person getPersonById(@PathVariable("id") ObjectId id){
        return PR.findBy_id(id);
    }

    //Update Person by Id

    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public void updatePersonById(@PathVariable("id") ObjectId id, @Valid @RequestBody Person UpdatedPerson){
        UpdatedPerson.set_id(id);
        PR.save(UpdatedPerson);
    }

    //Post New Person

    @RequestMapping(value ="/", method = RequestMethod.POST)
    public Person createPerson(@Valid @RequestBody Person newPerson) {
        PR.save(newPerson);
        return newPerson;
    }

    //Delete a user

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deletePerson(@PathVariable ObjectId id){
        PR.delete(PR.findBy_id(id));
    }

}
