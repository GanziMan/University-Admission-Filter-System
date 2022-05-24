package Pj.Bumsu.Kim;

public class RuralArea {
	private int seq;
	private String name;
	private String major;
	private String area;

	private int during_area;
	private int during_school_middle;
	private int during_school_high;
	
	private int student_score;
	private int student_interview_score;

	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq=seq;
	}
	
	public String getName() {return name;}
	public void setName(String name) {this.name=name;}
	
	public String getMajor() {return major;}
	public void setMajor(String major) {this.major=major;}
	
	public String getarea() {return area;}
	public void setarea(String area) {this.area=area;}
	
	
	public int getduring_area() {return during_area;}
	public void setduring_area(int during_area) {this.during_area=during_area;}
	
	public int getduring_middle() {return during_school_middle;}
	public void setduring_middle(int during_school_middle) {this.during_school_middle=during_school_middle;}
	
	public int getduring_high() {return during_school_high;}
	public void setduring_high(int during_school_high) {this.during_school_high=during_school_high;}
	
	public int getstudent_score() {return student_score;}
	public void setstudent_score(int student_score) {this.student_score=student_score;}
	
	public int getstudent_interview_score() {return student_interview_score;}
	public void setstudent_interview_score(int student_interview_score) {this.student_interview_score=student_interview_score;}
	
	

	

	

	
}
