package Pj.Bumsu.Kim.db;
import java.util.List; 



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Date;
import java.text.SimpleDateFormat;

import Pj.Bumsu.Kim.RuralArea;
import Pj.Bumsu.Kim.Student;
import Pj.Bumsu.Kim.disabled;
import Pj.Bumsu.Kim.document;
import Pj.Bumsu.Kim.expat12;
import Pj.Bumsu.Kim.expat3;
import Pj.Bumsu.Kim.specialhigh;
import Pj.Bumsu.Kim.subject; 

@Controller
@Component
public class StdDb {
	private JdbcTemplate jdbcTemplate;
	Date nowTime = new Date();
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd, HH:mm:ss");
	

	
	@Autowired
	public void setDataSource(DataSource datasource) {
		this.jdbcTemplate=new JdbcTemplate(datasource);
	}

	public void create_disabled(disabled disable) {
		String sql="insert into disabled (name,major,disabledtype, disablescore,highschool, student_score, student_interview_score, document_confirm, datetime ) values (?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,disable.getName(),disable.getMajor(),disable.getdisabledtype(),disable.getdisablescore(),disable.gethighschool(),disable.getstudent_score(),disable.getstudent_interview_score(),disable.getdocument_confirm(),nowTime);
	}
	public void create_document(document docu) {
		String sql="insert into document (name, major, highschool, student_score, student_interview_score, document_confirm,low_sat, datetime ) values (?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,docu.getName(),docu.getMajor(),docu.gethighschool(),docu.getstudent_score(),docu.getstudent_interview_score(),docu.getdocument_confirm(),docu.getlow_sat(),nowTime);
	}
	public void create_expat12(expat12 ex12) {
		String sql="insert into expat12 (name,major,schoolcountry, during_school, during_1year_per,during_1year_per_parent, student_score, datetime ) values (?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,ex12.getName(),ex12.getMajor(),ex12.getschoolcountry(),ex12.getduring_school(),ex12.getduring_1year_per(),ex12.getduring_1year_per_parent(),ex12.getstudent_score(),nowTime);
	}
	public void create_expat3(expat3 ex3) {
		String sql="insert into expat3 (name,major,schoolcountry, during_school, during_1year_per,during_1year_per_parent, student_score,student_interview_score, datetime ) values (?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,ex3.getName(),ex3.getMajor(),ex3.getschoolcountry(),ex3.getduring_school(),ex3.getduring_1year_per(),ex3.getduring_1year_per_parent(),ex3.getstudent_score(),ex3.getstudent_interview_score(),nowTime);
	}
	public void create_Rural(RuralArea ru) {
		String sql="insert into RuralArea (name,major,area, during_area, during_school_middle,during_school_high, student_score, student_interview_score, datetime ) values (?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,ru.getName(),ru.getMajor(),ru.getarea(),ru.getduring_area(),ru.getduring_middle(),ru.getduring_high(),ru.getstudent_score(),ru.getstudent_interview_score(),nowTime);
	}
	public void create_special(specialhigh sp) {
		String sql="insert into specialhigh (name,major,school_industry, during_school_industry, industry_people, student_score, student_interview_score, datetime ) values (?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,sp.getName(),sp.getMajor(),sp.getschool_industry(),sp.getduring_school_industry(),sp.getindustry_people(),sp.getstudent_score(),sp.getstudent_interview_score(),nowTime);
	}
	public void create_subject(subject sub) {
		String sql="insert into subject (name,major,highschool, student_score, low_sat, datetime ) values (?,?,?,?,?,?)";
		jdbcTemplate.update(sql,sub.getName(),sub.getMajor(),sub.gethighschool(),sub.getstudent_score(),sub.getlow_sat(),nowTime);
	}


	

	
	public List<disabled> select1(){
		String sql="select * from disabled";
		List<disabled> std_di=jdbcTemplate.query(sql, new disabledMapper());
		System.out.println("select 값:"+ std_di);
		return std_di;
	}
	public List<disabled> select1_1(){
		String sql="select * from disabled where disablescore > 3 or student_score + student_interview_score <100 or document_confirm = 'no' ";
		List<disabled> std_di=jdbcTemplate.query(sql, new disabledMapper());
		System.out.println("select 값:"+ std_di);
		return std_di;
	}
	public List<document> select2(){
		String sql="select * from document";
		List<document> std_do=jdbcTemplate.query(sql, new documentMapper());
		System.out.println("select 값:"+ std_do);
		return std_do;
	}
	public List<document> select2_1(){
		String sql="select * from document where student_score + student_interview_score < 170 or low_sat <70 or document_confirm  = 'no' ";
		List<document> std_do=jdbcTemplate.query(sql, new documentMapper());
		System.out.println("select 값:"+ std_do);
		return std_do;
	}
	public List<expat12> select3(){
		String sql="select * from expat12";
		List<expat12> std_ex12=jdbcTemplate.query(sql, new expat12Mapper());
		System.out.println("select 값:"+ std_ex12);
		return std_ex12;
	}
	public List<expat12> select3_1(){
		String sql="select * from expat12 where schoolcountry='국내' or during_school <12 or student_score <80 ";
		
		List<expat12> std_ex12=jdbcTemplate.query(sql, new expat12Mapper());
		System.out.println("select 값:"+ std_ex12);
		return std_ex12;
	}
	
	public List<expat3> select4(){
		String sql="select * from expat3";
		List<expat3> std_ex3=jdbcTemplate.query(sql, new expat3Mapper());
		System.out.println("select 값:"+ std_ex3);
		return std_ex3;
	}
	public List<expat3> select4_1(){
		String sql="select * from expat3 where schoolcountry='국내' or during_school <3 or during_1year_per >=91 or during_1year_per_parent >=122 or student_score <80";
		List<expat3> std_ex3=jdbcTemplate.query(sql, new expat3Mapper());
		System.out.println("select 값:"+ std_ex3);
		return std_ex3;
	}
	public List<RuralArea> select5(){
		String sql="select * from RuralArea";
		List<RuralArea> std_ru=jdbcTemplate.query(sql, new RuralAreaMapper());
		System.out.println("select 값:"+ std_ru);
		return std_ru;
	}
	public List<RuralArea> select5_1(){
		String sql="select * from RuralArea where during_area <6 or during_school_middle <3 or during_school_high <3 or student_score + student_interview_score <140";
		List<RuralArea> std_ru=jdbcTemplate.query(sql, new RuralAreaMapper());
		System.out.println("select 값:"+ std_ru);
		return std_ru;
	}
	public List<specialhigh> select6(){
		String sql="select * from specialhigh";
		List<specialhigh> std_sp=jdbcTemplate.query(sql, new specialhighMapper());
		System.out.println("select 값:"+ std_sp);
		return std_sp;
	}
	public List<specialhigh> select6_1(){
		String sql="select * from specialhigh where during_school_industry <3 or (school_industry='industry' and industry_people<5) or student_score + student_interview_score <130 ";
		List<specialhigh> std_sp=jdbcTemplate.query(sql, new specialhighMapper());
		System.out.println("select 값:"+ std_sp);
		return std_sp;
	}
	public List<subject> select7(){
		String sql="select * from subject";
		List<subject> std_sub=jdbcTemplate.query(sql, new subjectMapper());
		System.out.println("select 값:"+ std_sub);
		return std_sub;
	}
	public List<subject> select8(){
		String sql="select * from subject where student_score <80 or low_sat< 85";
		List<subject> std_if_sub=jdbcTemplate.query(sql, new subjectMapper());
		System.out.println("select 값:"+ std_if_sub);
		return std_if_sub;
	}
	
	
	
	
	public disabled select1(int seq) {
		String sql="select * from disabled where seq=?";
		disabled std_di=jdbcTemplate.queryForObject(sql,new Object[] {seq}, new disabledMapper());
		return std_di;
	}
	public disabled select1_1(int seq) {
		String sql="select * from disabled where seq=?";
		disabled std_di=jdbcTemplate.queryForObject(sql,new Object[] {seq}, new disabledMapper());
		return std_di;
	}
	public document select2(int seq) {
		String sql="select * from document where seq=?";
		document std_do=jdbcTemplate.queryForObject(sql,new Object[] {seq}, new documentMapper());
		return std_do;
	}
	public document select2_1(int seq) {
		String sql="select * from document where student_score + student_interview_score < 30 or low_sat >10 or document_confirm  = 'yes' ";
		document std_do_if=jdbcTemplate.queryForObject(sql,new Object[] {seq}, new documentMapper());
		return std_do_if;
	}
	public expat12 select3(int seq) {
		String sql="select * from expat12 where seq=?";
		expat12 std_ex12=jdbcTemplate.queryForObject(sql,new Object[] {seq}, new expat12Mapper());
		return std_ex12;
	}
	public expat12 select3_1(int seq) {
		String sql="select * from expat12 where seq=?";
		expat12 std_ex12_if=jdbcTemplate.queryForObject(sql,new Object[] {seq}, new expat12Mapper());
		return std_ex12_if;
	}
	public expat3 select4(int seq) {
		String sql="select * from expat3 where seq=?";
		expat3 std_ex3=jdbcTemplate.queryForObject(sql,new Object[] {seq}, new expat3Mapper());
		return std_ex3;
	}
	public expat3 select4_1(int seq) {
		String sql="select * from expat3 where seq=?";
		expat3 std_ex3=jdbcTemplate.queryForObject(sql,new Object[] {seq}, new expat3Mapper());
		return std_ex3;
	}
	public RuralArea select5(int seq) {
		String sql="select * from RuralArea where seq=?";
		RuralArea std_ru=jdbcTemplate.queryForObject(sql,new Object[] {seq}, new RuralAreaMapper());
		return std_ru;
	}
	public RuralArea select5_1(int seq) {
		String sql="select * from RuralArea where seq=?";
		RuralArea std_ru=jdbcTemplate.queryForObject(sql,new Object[] {seq}, new RuralAreaMapper());
		return std_ru;
	}
	public specialhigh select6(int seq) {
		String sql="select * from specialhigh where seq=?";
		specialhigh std_sp=jdbcTemplate.queryForObject(sql,new Object[] {seq}, new specialhighMapper());
		return std_sp;
	}
	public specialhigh select6_1(int seq) {
		String sql="select * from specialhigh where seq=?";
		specialhigh std_sp=jdbcTemplate.queryForObject(sql,new Object[] {seq}, new specialhighMapper());
		return std_sp;
	}
	public subject select7(int seq) {
		String sql="select * from subject where seq=?";
		subject std_sub=jdbcTemplate.queryForObject(sql,new Object[] {seq}, new subjectMapper());
		return std_sub;
	}

	public subject select8(int seq) {
		String sql="select * from subject where seq =?";
		subject std_sub_if=jdbcTemplate.queryForObject(sql,new Object[] {seq}, new subjectMapper());
		return std_sub_if;
	}

	

}


