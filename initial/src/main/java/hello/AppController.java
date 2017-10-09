package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by janet.bogle on 7/21/17.
 */
//@Controller
@RestController
public class AppController {

    @Autowired
    public ChemERepository chemERepository;

    @RequestMapping(method = RequestMethod.GET, value = "/getJobChoices")
    public ModelAndView getJobChoices() {

        //ModelMap model = new ModelMap();

        //List<String> jobs;
        //jobs = chemERepository.fetchJobs();

        ChemEJobForm form = new ChemEJobForm();
        form.setMainfield("got it");
        //model.addAttribute("form", form);
        //model.addAttribute("jobs", jobs);
        // model.addAttribute("tryIt", "Got here");

        //ModelAndView mv = new ModelAndView("", model);

        return new ModelAndView("/jobChoices.html", "chemejobform", form);
        //return "form";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/saveJobChoice")
    //@ResponseBody
    public void saveJobChoice(@ModelAttribute("chemEJobForm") ChemEJobForm jobForm
                              //javax.servlet.http.HttpServletRequest request
    ) {
        //return "in nowWhat";  // to return just data to the browser: use @ResponseBody on the method and return String

        //System.out.println(jobForm.getMainField());
        //System.out.println(jobForm.getSubField());


    }

    @RequestMapping("/endpoint")
    public String endpoint() {
        return "in AppController.endpoint\n";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getOneJob")
    public ModelAndView getOneJob() {

        //ModelMap model = new ModelMap();
        //List<String> jobs;
        //jobs = chemERepository.fetchJobs();

        ChemEJobForm form = new ChemEJobForm();
        form.setMainfield("got it");
        //model.addAttribute("form", form);
        //model.addAttribute("jobs", jobs);
        // model.addAttribute("tryIt", "Got here");

        //ModelAndView mv = new ModelAndView("", model);

        return new ModelAndView("/jobFind.js", "chemejobform", form);
        //return "form";
    }
}