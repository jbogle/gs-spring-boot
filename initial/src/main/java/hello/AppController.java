package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by janet.bogle on 7/21/17.
 */
@Controller
//@RestController
public class AppController {

    @Autowired
    public ChemERepository chemERepository;

   // this works when using @RestController vs @Controller
    @RequestMapping("/endpoint")
    public String endpoint() {
        return "in AppController.endpoint\n";
    }



/*  Using this with React front end, this method gets called, but 404 is returned.
    Suspect the 'view' isn't correct. Look at View object, my ViewResolver, etc.
    Not even sure I want a 'view' though, so.....

    @RequestMapping(method = RequestMethod.GET, value = "/fetchJobs")
    public ModelAndView fetchJobs() {
        System.out.println("in /fetchJobs");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("JobsData.js");

        ChemEJobForm form = new ChemEJobForm();
        form.setMainfield("got it");

        modelAndView.addObject("form", form);

        return modelAndView;
    }
    */

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/fetchJobs")
    public List<String> fetchJobs() {
        System.out.println("in /fetchJobs");

        List<String> jobs = new ArrayList<>();
        jobs.add("try");
        jobs.add("this");

        return jobs;
    }

}








