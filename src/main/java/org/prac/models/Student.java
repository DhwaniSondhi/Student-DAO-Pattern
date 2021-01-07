package org.prac.models;

public class Student {

	private String id;
	private String fName;
	private String lName;
	private String address;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", fName=" + fName + ", lName=" + lName + ", address=" + address + "]";
	}
	public Student() {
		super();
	}
	public Student(String id, String fName, String lName, String address) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public static class StudentBuilder{
		
		private String id;
		private String fName;
		private String lName;
		private String address;
		public StudentBuilder setId(String id) {
			this.id = id;
			return this;
		}
		public StudentBuilder setfName(String fName) {
			this.fName = fName;
			return this;
		}
		public StudentBuilder setlName(String lName) {
			this.lName = lName;
			return this;
		}
		public StudentBuilder setAddress(String address) {
			this.address = address;
			return this;
		}
		public Student build() {
			return new Student(id, fName, lName, address);
		}
	}
}
