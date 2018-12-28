package sherif.spring.NatterFrank.Controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sherif.spring.NatterFrank.Model.Company;
import sherif.spring.NatterFrank.Model.Repositry.CompanyRepositry;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    @Autowired
    CompanyRepositry PR;

    //Get all Companies

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<Company> getAllCompany(){
        return PR.findAll();
    }

    //Get Company by Id

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Company getCompanyById(@PathVariable("id") ObjectId id){
        return PR.findBy_id(id);
    }

    //Update Company by Id

    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public void updateCompanyById(@PathVariable("id") ObjectId id, @Valid @RequestBody Company UpdatedCompany){
        UpdatedCompany.set_id(id);
        PR.save(UpdatedCompany);
    }

    //Post New Company

    @RequestMapping(value ="/", method = RequestMethod.POST)
    public Company createCompany(@Valid @RequestBody Company newCompany) {
        PR.save(newCompany);
        return newCompany;
    }

    //Delete a Company

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteCompany(@PathVariable ObjectId id){
        PR.delete(PR.findBy_id(id));
    }

}
