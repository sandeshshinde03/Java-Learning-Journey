package com.map.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Country {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int cid;
		private String cname;
		@OneToOne   //
		private Capital cap;
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
		public Capital getCap() {
			return cap;
		}
		public void setCap(Capital cap) {
			this.cap = cap;
		}
		public Country() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Country(int cid, String cname, Capital cap) {
			super();
			this.cid = cid;
			this.cname = cname;
			this.cap = cap;
		}
		@Override
		public String toString() {
			return "Country [cid=" + cid + ", cname=" + cname + ", cap=" + cap + "]";
		}
		
		
}
