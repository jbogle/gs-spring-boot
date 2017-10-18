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

    public List<ChemEJob> getJobs() {

        List<ChemEJob> jobs = jdbcTemplate.query("select field from chemEJob", new ChemEJobRowMapper());
        return jobs;
    }

}
