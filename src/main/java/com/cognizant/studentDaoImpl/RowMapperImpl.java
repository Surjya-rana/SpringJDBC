package com.cognizant.studentDaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cognizant.entity.student;

public class RowMapperImpl implements RowMapper<student> {
	public student mapRow(ResultSet rs, int rowNum) throws SQLException {
		student student=new student();
		student.setId(rs.getInt(1));
		student.setFname(rs.getString(2));
		student.setLname(rs.getString(3));
		return student;
	}
}
