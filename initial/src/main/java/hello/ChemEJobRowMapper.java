package hello;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by janet.bogle on 6/30/17.
 * Used in query, to map each row queried using the fields from db.
 */
public class ChemEJobRowMapper implements RowMapper<ChemEJob> {

    @Override
    public ChemEJob mapRow(ResultSet resultSet, int rowNum) throws SQLException
    {
        ChemEJob chemEJob = new ChemEJob();
        chemEJob.setId(resultSet.getInt("id"));
        chemEJob.setField(resultSet.getString("field"));

        return chemEJob;
    }
}
