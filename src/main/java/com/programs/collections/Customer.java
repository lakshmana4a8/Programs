package com.programs.collections;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Customer {
	private String name;
	private String address;
	private int age;

	public Customer(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 19).append(this.name).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		Customer other = (Customer) obj;
		return new EqualsBuilder().append(this.name, other.name).isEquals();
		/*
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;*/
	}

	@Override
	public String toString() {
		return name + ", " + address + ", " + age;
	}
}
