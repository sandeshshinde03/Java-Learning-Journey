package com.springcore.Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int eid;
	private String ename;
	private List<String> phones;
	private Set<String> address;
	private Map<Integer, String>project;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<Integer, String> getProject() {
		return project;
	}

	public void setProject(Map<Integer, String> project) {
		this.project = project;
	}

	public Employee(int eid, String ename, List<String> phones, Set<String> address, Map<Integer, String> project) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.phones = phones;
		this.address = address;
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", phones=" + phones + ", address=" + address
				+ ", project=" + project + "]";
	}
	

	
}
