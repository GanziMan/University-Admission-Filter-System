package Pj.Bumsu.Kim.db;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



import Pj.Bumsu.Kim.document;
public class documentMapper implements RowMapper<document>{

	@Override
	public document mapRow(ResultSet rs1,int rowNum) throws SQLException{
	document std_document=new document();
		
	std_document.setName(rs1.getString("name"));
	std_document.setMajor(rs1.getString("major"));
	std_document.sethighschool(rs1.getString("highschool"));
	std_document.setstudent_score(rs1.getInt("student_score"));
	std_document.setstudent_interview_score(rs1.getInt("student_interview_score"));
		std_document.setdocument_confirm(rs1.getString("document_confirm"));
		std_document.setlow_sat(rs1.getInt("low_sat"));

		return std_document;
		
	}
	}
