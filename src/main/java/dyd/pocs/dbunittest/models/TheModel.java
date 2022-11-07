package dyd.pocs.dbunittest.models;


public class TheModel {
	private Integer id;
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
