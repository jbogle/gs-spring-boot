package hello;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by janet.bogle on 7/21/17.
 */
@Controller
public class AppController {

    @Autowired
    public ChemERepository chemERepository;

/*
    @InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator();
    }
*/

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
}
