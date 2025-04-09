package lk.ac.vau.fas.ict.model;

public class Instructor {
	
	private String name;
	private int empID;
	private String subject;
	
	public Instructor(String name, int empID, String subject) {
		super();
		this.name = name;
		this.empID = empID;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	

}
