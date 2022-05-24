package Pj.Bumsu.Kim;

public class subject {
	private int seq;
	private String name;
	private String major;
	private String highschool;

	private int student_score;
	private int low_sat;

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
	
	public String gethighschool() {return highschool;}
	public void sethighschool(String highschool) {this.highschool=highschool;}
	

	public int getstudent_score() {return student_score;}
	public void setstudent_score(int student_score) {this.student_score=student_score;}
	
	public int getlow_sat() {return low_sat;}
	public void setlow_sat(int low_sat) {this.low_sat=low_sat;}
	
}
