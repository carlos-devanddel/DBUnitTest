package dyd.pocs.dbunittest.daos;

import dyd.pocs.dbunittest.exceptions.NotFoundException;
import dyd.pocs.dbunittest.models.TheModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TheDAO {

	@Autowired
	private JdbcTemplate jdbcTemlate;

	public TheModel getDataById(Integer id) throws NotFoundException {
		try {
			return jdbcTemlate.queryForObject("SELECT * FROM MODELS WHERE id = " + id,(rs, rowNum) ->
				 new TheModel(rs.getInt("ID"), rs.getString("DESCRIPTION"))
			);
		}catch (EmptyResultDataAccessException e){throw new NotFoundException();}
	}
}
