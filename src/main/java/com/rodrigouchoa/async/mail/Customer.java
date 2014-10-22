package com.rodrigouchoa.async.mail;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/* Instances of this entity will be persisted in a transaction */
@Entity
@Table(name = "TB_CUSTOMER")
public class Customer {
	
	@Id
	@Column(name = "id_customer")
	private Long id;
	
	/*This property has the unique flag set to 'true', so we get a unique constraint
	 * in the database level. */
	@Column(name = "name", unique = true)
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
