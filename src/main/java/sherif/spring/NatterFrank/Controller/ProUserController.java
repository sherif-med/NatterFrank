package sherif.spring.NatterFrank.Controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sherif.spring.NatterFrank.Model.ProUser;
import sherif.spring.NatterFrank.Model.Repositry.ProUserRepositry;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/proUser")
public class ProUserController {

    @Autowired
    ProUserRepositry PR;

    //Get all Member users

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<ProUser> getAllProUsers(){
        return PR.findAll();
    }

    //Get ProUser by Id

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ProUser getProUserById(@PathVariable("id") ObjectId id){
        return PR.findBy_id(id);
    }

    //Update ProUser by Id

    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public void updateProUserById(@PathVariable("id") ObjectId id, @Valid @RequestBody ProUser UpdatedProUser){
        UpdatedProUser.set_id(id);
        PR.save(UpdatedProUser);
    }

    //Post New ProUser

    @RequestMapping(value ="/", method = RequestMethod.POST)
    public ProUser createProUser(@Valid @RequestBody ProUser newProUser) {
        PR.save(newProUser);
        return newProUser;
    }

    //Delete a ProUser

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteProUser(@PathVariable ObjectId id){
        PR.delete(PR.findBy_id(id));
    }

}
