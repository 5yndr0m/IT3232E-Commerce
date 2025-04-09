package lk.ac.vau.fas.ict.model;

public class Course {

	private String name;
	private String code;
	private int credits;
	private String lecturer;
	
	public Course(String name, String code, int credits, String lecturer) {
		super();
		this.name = name;
		this.code = code;
		this.credits = credits;
		this.lecturer = lecturer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}
	
	
}
