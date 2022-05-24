package Pj.Bumsu.Kim.db;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



import Pj.Bumsu.Kim.expat3;
public class expat3Mapper implements RowMapper<expat3>{

	@Override
	public expat3 mapRow(ResultSet rs1,int rowNum) throws SQLException{
	expat3 std_ex3=new expat3();
		
	std_ex3.setName(rs1.getString("name"));
	std_ex3.setMajor(rs1.getString("major"));
	std_ex3.setschoolcountry(rs1.getString("schoolcountry"));
	std_ex3.setduring_school(rs1.getInt("during_school"));
	std_ex3.setduring_1year_per(rs1.getInt("during_1year_per"));
	std_ex3.setduring_1year_per_parent(rs1.getInt("during_1year_per_parent"));
	std_ex3.setstudent_score(rs1.getInt("student_score"));
	std_ex3.setstudent_interview_score(rs1.getInt("student_interview_score"));
	return std_ex3;
		
	}
	}
