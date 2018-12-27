package sherif.spring.NatterFrank.Controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sherif.spring.NatterFrank.Model.Application;
import sherif.spring.NatterFrank.Model.Repositry.ApplicationRepositry;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/application")
public class ApplicationController {

    @Autowired
    ApplicationRepositry AR;

    //Get All applications

    @JsonIgnore
    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<Application> getAllApplication(){
        return AR.findAll();
    }

    //Get Application by Id

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Application getApplicationById(@PathVariable("id") ObjectId id){
        return AR.findBy_id(id);
    }

    //Update Application by Id

    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public void updateApplicationById(@PathVariable("id") ObjectId id, @Valid @RequestBody Application UpdatedApplication){
        UpdatedApplication.set_id(id);
        AR.save(UpdatedApplication);
    }

    //Post New Application

    @RequestMapping(value ="/", method = RequestMethod.POST)
    public Application createApplication(@Valid @RequestBody Application newApplication) {
        AR.save(newApplication);
        return newApplication;
    }

    //Delete a Application

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteApplication(@PathVariable ObjectId id){
        AR.delete(AR.findBy_id(id));
    }

    //Get Applications by Job Id


    @RequestMapping(value="/job/{id}", method = RequestMethod.GET)
    public List<Application> getApplicationByJobId(@PathVariable("id") ObjectId id){
        return AR.findApplicationByJobId(id);
    }


    //Get Applications by Candidate Id


    @RequestMapping(value="/candidate/{id}", method = RequestMethod.GET)
    public List<Application> getApplicationByCandidateId(@PathVariable("id") ObjectId id){
        return AR.findApplicationByCandidateId(id);
    }

    //Get Applications by Employer Id


    @RequestMapping(value="/employer/{id}", method = RequestMethod.GET)
    public List<Application> getApplicationByEmployerId(@PathVariable("id") ObjectId id){
        return AR.findApplicationByEmployerId(id);
    }


}
