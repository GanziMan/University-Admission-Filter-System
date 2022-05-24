package Pj.Bumsu.Kim.db;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import Pj.Bumsu.Kim.subject;

public class subjectMapper implements RowMapper<subject>{

	@Override
	public subject mapRow(ResultSet rs1,int rowNum) throws SQLException{
	subject std_sub=new subject();
		
	std_sub.setName(rs1.getString("name"));
	std_sub.setMajor(rs1.getString("major"));
	std_sub.sethighschool(rs1.getString("highschool"));
	std_sub.setstudent_score(rs1.getInt("student_score"));
	std_sub.setlow_sat(rs1.getInt("low_sat"));
		return std_sub;
		
	}
	}
