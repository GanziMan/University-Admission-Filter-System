package Pj.Bumsu.Kim.db;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



import Pj.Bumsu.Kim.expat12;
public class expat12Mapper implements RowMapper<expat12>{

	@Override
	public expat12 mapRow(ResultSet rs1,int rowNum) throws SQLException{
	expat12 std_ex12=new expat12();
		
	std_ex12.setName(rs1.getString("name"));
	std_ex12.setMajor(rs1.getString("major"));
	std_ex12.setschoolcountry(rs1.getString("schoolcountry"));
	std_ex12.setduring_school(rs1.getInt("during_school"));
	std_ex12.setduring_1year_per(rs1.getInt("during_1year_per"));
	std_ex12.setduring_1year_per_parent(rs1.getInt("during_1year_per_parent"));
	std_ex12.setstudent_score(rs1.getInt("student_score"));
	return std_ex12;
		
	}
	}
