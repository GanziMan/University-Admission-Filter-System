package Pj.Bumsu.Kim.db;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import Pj.Bumsu.Kim.disabled;
public class disabledMapper implements RowMapper<disabled>{

	@Override
	public disabled mapRow(ResultSet rs1,int rowNum) throws SQLException{
	disabled std_disabled=new disabled();
		
		std_disabled.setName(rs1.getString("name"));
		std_disabled.setMajor(rs1.getString("major"));
		std_disabled.setdisabledtype(rs1.getString("disabledtype"));
		std_disabled.setdisablescore(rs1.getInt("disablescore"));
		std_disabled.sethighschool(rs1.getString("highschool"));
		std_disabled.setstudent_score(rs1.getInt("student_score"));
		std_disabled.setstudent_interview_score(rs1.getInt("student_interview_score"));
		std_disabled.setdocument_confirm(rs1.getString("document_confirm"));
		return std_disabled;
		
	}
	}
