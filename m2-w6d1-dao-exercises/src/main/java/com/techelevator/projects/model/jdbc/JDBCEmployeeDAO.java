//Exercises
//JDBCEmployeeDAO

package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

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

		List<Employee> employees = new ArrayList<Employee>();
		String getAllEmployees = "SELECT (last_name||', '||first_name) as full_name from employee"
;
		SqlRowSet result = jdbcTemplate.queryForRowSet(getAllEmployees);

		while (result.next()) {
			employees.add(mapRowToEmployee(result));
		}

		return employees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		return new ArrayList<>();
	}

	@Override
	public List<Employee> getEmployeesByDepartmentId(long id) {
		return new ArrayList<>();
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		return new ArrayList<>();
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
		return new ArrayList<>();
	}

	@Override
	public void changeEmployeeDepartment(Long employeeId, Long departmentId) {
		
	}

	private Employee mapRowToEmployee(SqlRowSet result) {
		Employee employees = new Employee();
		employees.setId(result.getLong("employee_id"));
		employees.setFirstName(result.getString("last_name" + "," + "first_name"));
		return employees;
	}
}

