package dyd.pocs.dbunittest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MODELS")
public class TheModel {

	@Id
	@Column(name = "ID")
	private Integer id;
	@Column(name = "DESCRIPTION")
	private String description;

	public TheModel() {}

	public TheModel(Integer id, String description) {
		this.id = id;
		this.description = description;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
