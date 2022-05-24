package Pj.Bumsu.Kim.db;
import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import Pj.Bumsu.Kim.RuralArea;

public class RuralAreaMapper implements RowMapper<RuralArea>{

	@Override
	public RuralArea mapRow(ResultSet rs1,int rowNum) throws SQLException{
	RuralArea std_ru=new RuralArea();
		
	std_ru.setName(rs1.getString("name"));
	std_ru.setMajor(rs1.getString("major"));
	std_ru.setarea(rs1.getString("area"));
	std_ru.setduring_area(rs1.getInt("during_area"));
	std_ru.setduring_middle(rs1.getInt("during_school_middle"));
	std_ru.setduring_high(rs1.getInt("during_school_high"));
	std_ru.setstudent_score(rs1.getInt("student_score"));
	std_ru.setstudent_interview_score(rs1.getInt("student_interview_score"));
	return std_ru;
		
	}
	}
