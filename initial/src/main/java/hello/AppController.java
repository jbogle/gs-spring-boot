package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


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


    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/fetchJobs")
    public List<String> fetchJobs() {
        System.out.println("in /fetchJobs");

        return chemERepository.getJobs().stream().map( job ->  job.getField())
                .collect(Collectors.toList());

    }

}








