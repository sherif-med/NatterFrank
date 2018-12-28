package sherif.spring.NatterFrank.Controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sherif.spring.NatterFrank.Model.Child;
import sherif.spring.NatterFrank.Model.Repositry.ChildRepositry;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/child")
public class ChildController {

    @Autowired
    ChildRepositry PR;

    //Get all children

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<Child> getAllChild(){
        return PR.findAll();
    }

    //Get Child by Id

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Child getChildById(@PathVariable("id") ObjectId id){
        return PR.findBy_id(id);
    }

    //Update Child by Id

    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public void updateChildById(@PathVariable("id") ObjectId id, @Valid @RequestBody Child UpdatedChild){
        UpdatedChild.set_id(id);
        PR.save(UpdatedChild);
    }

    //Post New Child

    @RequestMapping(value ="/", method = RequestMethod.POST)
    public Child createChild(@Valid @RequestBody Child newChild) {
        PR.save(newChild);
        return newChild;
    }

    //Delete a Child

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteChild(@PathVariable ObjectId id){
        PR.delete(PR.findBy_id(id));
    }

}
