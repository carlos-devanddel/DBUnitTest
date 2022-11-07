package dyd.pocs.dbunittest.daos;

import dyd.pocs.dbunittest.exceptions.NotFoundException;
import dyd.pocs.dbunittest.models.TheModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
class TheDAOTest {

	@Autowired
	private TheDAO sut;

	@Test
	@Sql(statements = "INSERT INTO MODELS (ID, DESCRIPTION) VALUES(1, 'Descripcion')")
	void getDataById_should_returnModel_when_Exists() throws Exception {
		TheModel result = sut.getDataById(1);

		Assertions.assertNotNull( result);
		Assertions.assertEquals(1, result.getId());
		Assertions.assertEquals("Descripcion", result.getDescription());
	}

	@Test
	void getDataById_should_throw_NotFoundException_when_modelDoesntExists(){

		Assertions.assertThrows(NotFoundException.class, () -> sut.getDataById(2));
	}
}