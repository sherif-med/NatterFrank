package sherif.spring.NatterFrank.Controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sherif.spring.NatterFrank.Model.MemberUser;
import sherif.spring.NatterFrank.Model.Repositry.MemberUserRepositry;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/memberUser")
public class MemberUserController {

    @Autowired
    MemberUserRepositry PR;

    //Get all Member users

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<MemberUser> getAllMemberUsers(){
        return PR.findAll();
    }

    //Get MemberUser by Id

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public MemberUser getMemberUserById(@PathVariable("id") ObjectId id){
        return PR.findBy_id(id);
    }

    //Update MemberUser by Id

    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public void updateMemberUserById(@PathVariable("id") ObjectId id, @Valid @RequestBody MemberUser UpdatedMemberUser){
        UpdatedMemberUser.set_id(id);
        PR.save(UpdatedMemberUser);
    }

    //Post New MemberUser

    @RequestMapping(value ="/", method = RequestMethod.POST)
    public MemberUser createMemberUser(@Valid @RequestBody MemberUser newMemberUser) {
        PR.save(newMemberUser);
        return newMemberUser;
    }

    //Delete a MemberUser

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteMemberUser(@PathVariable ObjectId id){
        PR.delete(PR.findBy_id(id));
    }

}
