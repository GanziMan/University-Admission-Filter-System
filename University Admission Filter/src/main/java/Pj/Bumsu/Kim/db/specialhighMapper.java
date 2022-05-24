package Pj.Bumsu.Kim.db;
import java.sql.ResultSet;


import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import Pj.Bumsu.Kim.specialhigh;

public class specialhighMapper implements RowMapper<specialhigh>{

	@Override
	public specialhigh mapRow(ResultSet rs1,int rowNum) throws SQLException{
	specialhigh std_sp=new specialhigh();
		
	std_sp.setName(rs1.getString("name"));
	std_sp.setMajor(rs1.getString("major"));
	std_sp.setschool_industry(rs1.getString("school_industry"));
	std_sp.setduring_school_industry(rs1.getInt("during_school_industry"));
	std_sp.setindustry_people(rs1.getInt("industry_people"));

	std_sp.setstudent_score(rs1.getInt("student_score"));
	std_sp.setstudent_interview_score(rs1.getInt("student_interview_score"));
	return std_sp;
		
	}
	}
