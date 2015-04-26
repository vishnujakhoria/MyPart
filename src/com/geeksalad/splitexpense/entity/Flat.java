package com.geeksalad.splitexpense.entity;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;


@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Flat {
	@PrimaryKey //
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	Long id;
	
	@Persistent
	Long Number;
	
	@Persistent
	Long OwnerName;
	
	@Persistent
	Long FlatType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumber() {
		return Number;
	}

	public void setNumber(Long number) {
		Number = number;
	}

	public Long getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(Long ownerName) {
		OwnerName = ownerName;
	}

	public Long getFlatType() {
		return FlatType;
	}

	public void setFlatType(Long flatType) {
		FlatType = flatType;
	}
}
