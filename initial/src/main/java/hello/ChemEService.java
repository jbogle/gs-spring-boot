package hello;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by janet.bogle on 7/27/17.
 */
public class ChemEService {

    @Autowired
    public ChemERepository chemERepository;

    public List<String> getJobsMain() {

       // Map<String, List<String>> jobMap = new HashMap<>();
        List<String> jobs = new ArrayList<>();
        jobs.add("energy");
        jobs.add("food");
        jobs.add("pharmaceuticals");
        jobs.add("miscellaneous");

        //jobMap.put("jobs", jobs);
        return jobs;
    }
}
