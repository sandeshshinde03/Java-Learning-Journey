package com.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class College {
	@Id
	private int cid;
	private String cname;
	@OneToMany
	private List<Student> stu;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Student> getStu() {
		return stu;
	}
	public void setStu(List<Student> stu) {
		this.stu = stu;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int cid, String cname, List<Student> stu) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.stu = stu;
	}
	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + ", stu=" + stu + "]";
	}
	
}
