package models;

import javax.persistence.*;

@Entity
public class TestEntity {
	@Id
	private long id;

	@Column
	private String data;

	@Column
	private String anotherField;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
