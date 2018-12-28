package sherif.spring.NatterFrank.Controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sherif.spring.NatterFrank.Model.Jobs;
import sherif.spring.NatterFrank.Model.Repositry.JobsRepositry;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

    @Autowired
    JobsRepositry PR;

    //Get all Member users

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<Jobs> getAllJobs(){
        return PR.findAll();
    }

    //Get Job by Id

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Jobs getJobsById(@PathVariable("id") ObjectId id){
        return PR.findBy_id(id);
    }

    //Update Jobs by Id

    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public void updateJobsById(@PathVariable("id") ObjectId id, @Valid @RequestBody Jobs UpdatedJobs){
        UpdatedJobs.set_id(id);
        PR.save(UpdatedJobs);
    }

    //Post New Jobs

    @RequestMapping(value ="/", method = RequestMethod.POST)
    public Jobs createJobs(@Valid @RequestBody Jobs newJobs) {
        PR.save(newJobs);
        return newJobs;
    }

    //Delete a Jobs

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteJobs(@PathVariable ObjectId id){
        PR.delete(PR.findBy_id(id));
    }

}
