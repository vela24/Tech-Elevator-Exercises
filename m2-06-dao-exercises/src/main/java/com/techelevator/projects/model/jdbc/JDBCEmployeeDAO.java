package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.EmployeeDAO;

public class JDBCEmployeeDAO implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCEmployeeDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		BasicDataSource businessSource = new BasicDataSource();
		businessSource.setUrl("jdbc:postgresql://localhost:5432/new_business");
		businessSource.setUsername("postgres");
		businessSource.setPassword("postgres1");
		List <Employee> source1 = new ArrayList<Employee>();
		
		JdbcTemplate businessSourceTemplate = new JdbcTemplate(businessSource);
		
		String employee = "SELECT first_name, last_name " +
							"FROM employee";
		
		SqlRowSet results1 = businessSourceTemplate.queryForRowSet(employee);
		while(results1.next()) {
			Employee employee1 = new Employee();
			employee1.setFirstName(results1.getString("first_name"));
			employee1.setLastName(results1.getString("last_name"));
			
			source1.add(employee1);
		}
		return source1;
	}


	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		BasicDataSource businessSource = new BasicDataSource();
		businessSource.setUrl("jdbc:postgresql://localhost:5432/new_business");
		businessSource.setUsername("postgres");
		businessSource.setPassword("postgres1");
		List <Employee> source2 = new ArrayList<Employee>();
		
		JdbcTemplate businessSourceTemplate = new JdbcTemplate(businessSource);
		
		String employee2 = "SELECT first_name, last_name " +
							"FROM employee " +
							"WHERE first_name ILIKE ? AND last_name ILIKE ? ";
		
		SqlRowSet results2 = businessSourceTemplate.queryForRowSet(employee2, firstNameSearch, lastNameSearch);
		while(results2.next()) {
			Employee employeeName = new Employee();
			employeeName.setFirstName(results2.getString("first_name"));
			employeeName.setLastName(results2.getString("last_name"));
			
			source2.add(employeeName);
		}
		return source2;
	}

	@Override
	public List<Employee> getEmployeesByDepartmentId(long id) {
		BasicDataSource businessSource3 = new BasicDataSource();
		businessSource3.setUrl("jdbc:postgresql://localhost:5432/new_business");
		businessSource3.setUsername("postgres");
		businessSource3.setPassword("postgres1");
		List <Employee> source3 = new ArrayList<Employee>();
		
		JdbcTemplate businessSourceTemplate3 = new JdbcTemplate(businessSource3);
		
		String codeEmployees = "SELECT first_name, last_name, department_id " +
								"FROM employee " +
								"WHERE department_id ILIKE ? ";
		
		SqlRowSet results3 = businessSourceTemplate3.queryForRowSet(codeEmployees, id);
		
		while(results3.next()) {
			Employee projects3 = new Employee();
			projects3.setFirstName(results3.getString("first_name"));
			projects3.setLastName(results3.getString("last_name"));
			projects3.setId(results3.getLong("department_id"));
			
			source3.add(projects3);
		}
		return source3;
	}


	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		BasicDataSource businessSource4 = new BasicDataSource();
		businessSource4.setUrl("jdbc:postgresql://localhost:5432/new_business");
		businessSource4.setUsername("postgres");
		businessSource4.setPassword("postgres1");
		List <Employee> source4 = new ArrayList<Employee>();
		
		JdbcTemplate businessSourceTemplate4 = new JdbcTemplate(businessSource4);
		
		String noProject = "SELECT first_name, last_name, project_id " +
							"FROM employee e " +
							"LEFT OUTER JOIN project_employee pid " +
							"on pid.employee_id = e.employee_id " +
							"WHERE project_id is null ";
		SqlRowSet results4 = businessSourceTemplate4.queryForRowSet(noProject);
		while(results4.next()) {
			Employee project4 = new Employee();
			project4.setFirstName(results4.getString("first_name"));
			project4.setLastName(results4.getString("last_name"));
			project4.setId(results4.getLong("project_id"));
			
			source4.add(project4);
		}
		return source4;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
		BasicDataSource businessSource5 = new BasicDataSource();
		businessSource5.setUrl("jdbc:postgresql://localhost:5432/new_business");
		businessSource5.setUsername("postgres");
		businessSource5.setPassword("postgres1");
		List <Employee> source5 = new ArrayList<Employee>();
		
		JdbcTemplate businessSourceTemplate5 = new JdbcTemplate(businessSource5);
		
		String gotProjects = "SELECT first_name, last_name, project_id, project_name " +
							 "From employee " +
							 "join project_employee pid " + 
							 "on pid.employee_id = e.employee_id " + 
							 "WHERE project_id = ? ";
		
		SqlRowSet result5 = businessSourceTemplate5.queryForRowSet(gotProjects, projectId);
		while(result5.next()) {
			Employee employeeProjects = new Employee();
			employeeProjects.setFirstName(result5.getString("first_name"));
			employeeProjects.setLastName(result5.getString("last_name"));
			employeeProjects.setId(result5.getLong("project_id"));
			
			source5.add(employeeProjects);
			}
			return source5;
		}

	@Override
	public void changeEmployeeDepartment(Long employeeId, Long departmentId) {
		
		BasicDataSource businessSource6 = new BasicDataSource();
		businessSource6.setUrl("jdbc:postgresql://localhost:5432/new_business");
		businessSource6.setUsername("postgres");
		businessSource6.setPassword("postgres1");
		//List <Employee> source6 = new ArrayList<Employee>();
		
		//JdbcTemplate businessSourceTemplate6 = new JdbcTemplate(businessSource6);
		
		String changeDepartment = "UPDATE employee_id Set department_id = ? " +
								  "WHERE emoployee_id = ? ";
				
		jdbcTemplate.update(changeDepartment, employeeId, departmentId);
			
	}

}
