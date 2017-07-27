package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by janet.bogle on 7/5/17.
 */
@Repository
public class ChemERepository {

    @Autowired
    protected JdbcTemplate jdbcTemplate;

    public void findAndPrintAll() {

        List<ChemEJob> jobs = jdbcTemplate.query("select * from chemEJob", new ChemEJobRowMapper());
        for (ChemEJob j : jobs)
        {
            System.out.println(j.getField());
        }
    }

/*
    public List<String> fetchJobs() {
        List<String> jobs = new ArrayList<>();
        jobs.add("energy");
        jobs.add("food");
        jobs.add("pharmaceuticals");
        jobs.add("miscellaneous");

        return jobs;
    }
*/

}
