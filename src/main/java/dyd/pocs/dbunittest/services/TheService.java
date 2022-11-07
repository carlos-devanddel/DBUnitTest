package dyd.pocs.dbunittest.services;

import dyd.pocs.dbunittest.daos.TheDAO;
import dyd.pocs.dbunittest.exceptions.NotFoundException;
import dyd.pocs.dbunittest.models.TheModel;
import org.springframework.stereotype.Service;

@Service
public class TheService {

	private final TheDAO repository;

	public TheService(TheDAO repository) {this.repository = repository;}

	public TheModel getData(Integer id ) throws NotFoundException {
		return repository.getDataById(id);
	}
}
