package com.cognizant.studentDaoImpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cognizant.entity.student;
import com.cognizant.studentDao.studentDao;

public class studentDaoImpl implements studentDao {
	private JdbcTemplate jdbcTemplate;

	public int insert(student student) {
		// TODO Auto-generated method stub
		String quary="INSERT INTO records(id,fname,lname) values(?,?,?)";
		int r=this.jdbcTemplate.update(quary,student.getId(),student.getFname(),student.getLname());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<student> getAllStudent() {
		// TODO Auto-generated method stub
		String quary="SELECT * FROM records";
		List<student> student=this.jdbcTemplate.query(quary, new RowMapperImpl());
		return student;
	}

	public int update(student student) {
		// TODO Auto-generated method stub
		String quary="update records set fname=?, lname=? where id=?";
		int r=this.jdbcTemplate.update(quary,student.getFname(),student.getLname(),student.getId());
		return r;
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		String quary="delete from records where id=?";
		int r=this.jdbcTemplate.update(quary,id);
		return r;
	}

	public student getStudent(int studentId) {
		// TODO Auto-generated method stub
		String quary="SELECT * FROM records where id=?";
		RowMapper<student> rowMapper=new RowMapperImpl();
		student student=this.jdbcTemplate.queryForObject(quary, rowMapper, studentId);
		return student;
	}
	
}
