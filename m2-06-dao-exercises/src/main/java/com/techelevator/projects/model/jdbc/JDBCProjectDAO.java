package com.techelevator.projects.model.jdbc;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.ProjectDAO;

public class JDBCProjectDAO implements ProjectDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCProjectDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		
		
	}
	
	@Override
	public List<Project> getAllActiveProjects() {
		BasicDataSource new_businessDataSource = new BasicDataSource();
		new_businessDataSource.setUrl("jdbc:postgresql://localhost:5432/new_business");
		new_businessDataSource.setUsername("postgres");
		new_businessDataSource.setPassword("postgres1");
		List<Project> newProjects = new ArrayList<Project>();
		
		JdbcTemplate new_businessTemplate = new JdbcTemplate(new_businessDataSource);
		
		String activeProjects = "SELECT project_id, name, from_date, to_date " +
								"FROM project ";
		
		SqlRowSet results = new_businessTemplate.queryForRowSet(activeProjects);
		while(results.next()) {
			Project projects1 = new Project();
			projects1.setId(results.getLong("project_id"));
			projects1.setName(results.getString("name"));
			if(results.getDate("to_date")!= null) {
				LocalDate date = results.getDate("to_date").toLocalDate();	
				projects1.setEndDate(date);
			}
			if(results.getDate("from_date") != null) {
			LocalDate date2 = results.getDate("from_date").toLocalDate();
			projects1.setStartDate(date2);
			}
			newProjects.add(projects1);
		}
		
		return newProjects;
	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {
	//	JdbcTemplate projects = new JdbcTemplate(Projects);
		String infoToDelete = "DELETE FROM department(department_id, name) " +
							  "VALUEs (?, ?)";
		
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {
		
	}

}
