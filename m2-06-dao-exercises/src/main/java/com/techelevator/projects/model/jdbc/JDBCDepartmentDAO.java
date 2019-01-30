package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.DepartmentDAO;

public class JDBCDepartmentDAO implements DepartmentDAO {
	
	private JdbcTemplate jdbcTemplate;

	public JDBCDepartmentDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Department> getAllDepartments() {
		BasicDataSource tadsSource = new BasicDataSource();
		tadsSource.setUrl("jdbc:postgresql://localhost:5432/new_business");
		tadsSource.setUsername("postgres");
		tadsSource.setPassword("postgres1");
		List<Department> departments = new ArrayList<Department>();
		
		JdbcTemplate departmentTemplate = new JdbcTemplate(tadsSource);
		
		String sql = "SELECT department_id, name FROM department";
		
		SqlRowSet results = departmentTemplate.queryForRowSet(sql);
		
		while(results.next()) {
			Department department = new Department();
			department.setId(results.getLong("department_id"));
			department.setName(results.getString("name"));
			
			departments.add(department);
		}
		return departments;
	}

	@Override
	public List<Department> searchDepartmentsByName(String nameSearch) {
		BasicDataSource tadsSource2 = new BasicDataSource();
		tadsSource2.setUrl("jdbc:postgresql://localhost:5432/new_business");
		tadsSource2.setUsername("postgres");
		tadsSource2.setPassword("postgres1");
		List<Department> departments2 = new ArrayList<Department>();
		
		JdbcTemplate departmentTemplate2 = new JdbcTemplate(tadsSource2);
		
		String departmentSql = "SELECT name FROM department WHERE name LIKE ? ";
		
		SqlRowSet results2 = departmentTemplate2.queryForRowSet(departmentSql, nameSearch);
		while(results2.next()) {
			Department depart = new Department();
			depart.setName(results2.getString("name"));
			
			departments2.add(depart);
		}
		return departments2;
	}

	@Override
	public void saveDepartment(Department updatedDepartment) {
	
		String sql = "UPDATE department SET name = ? WHERE department_id = ? ";
		jdbcTemplate.update(sql, updatedDepartment.getName(), updatedDepartment.getId());
	}

	@Override
	public Department createDepartment(Department newDepartment) {
		
		String sqlInsert = "INSERT INTO department(name) " + 
							"VALUES(?) RETURNING department_id"; 
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlInsert, newDepartment.getName());
		
		if(results.next()) {
			newDepartment.setId(results.getLong("department_id"));
		}
		
		return newDepartment;
	
	}

	@Override
	public Department getDepartmentById(Long id) {
		Department department = null;
		String sqlEx = "Select department_id From department WHERE id = ? ";
						
		
		SqlRowSet results7 = jdbcTemplate.queryForRowSet(sqlEx, id);
		while(results7.next()) {
			department.setId(results7.getLong("department_id"));
			department.setName(results7.getString("name"));
		}
	return department;
	}

//	private Department mapRowToCamp (SqlRowSet results) {
//		Department department;
//		department = new Department();
//		Department.setName(results.getString("name"));
//		
//		return department;
//	}
	
	
}
