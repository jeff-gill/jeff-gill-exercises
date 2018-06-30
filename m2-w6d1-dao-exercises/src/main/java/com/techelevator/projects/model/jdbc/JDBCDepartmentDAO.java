//Exercises
//JDBCDepartment

package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.DepartmentDAO;

public class JDBCDepartmentDAO<HandleDepartmentSearch> implements DepartmentDAO {

	private JdbcTemplate jdbcTemplate;
	public JDBCDepartmentDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Department> getAllDepartments() {

		List<Department> departments = new ArrayList<Department>();
		String selectAllDepartments = "select * from department";
		SqlRowSet result = jdbcTemplate.queryForRowSet(selectAllDepartments);

		while (result.next()) {
			departments.add(mapRowToDepartment(result));
		}

		return departments;
	}

	@Override
	public List<Department> searchDepartmentsByName(String nameSearch) {

		String findAName = "SELECT * from department WHERE NAME LIKE ?";
		List<Department> departments = new ArrayList<Department>();
		SqlRowSet result = jdbcTemplate.queryForRowSet(findAName, "%" + nameSearch + "%");

		while (result.next()) {
			departments.add(mapRowToDepartment(result));
		}
		return departments;
	}

	@Override
	public void saveDepartment(Department updatedDepartment) {
		String query = "UPDATE department SET name = ? WHERE department_id = ?";
		this.jdbcTemplate.update(query, updatedDepartment.getName(), updatedDepartment.getId());
}

	@Override
	public Department createDepartment(Department newDepartment) {
		String query = "INSERT INTO department (name) VALUES(?)";
		this.jdbcTemplate.update(query, newDepartment.getName());
		return newDepartment;
	}

	@Override
	public Department getDepartmentById(Long id) {
		String query = "SELECT * from department WHERE id = ?";
		SqlRowSet result = this.jdbcTemplate.queryForRowSet(query, id);
		while (result.next()) {
			return mapRowToDepartment(result);
		}
		return null;
	}

	private Department mapRowToDepartment(SqlRowSet result) {
		Department department = new Department();
		department.setId(result.getLong("department_id"));
		department.setName(result.getString("name"));
		return department;
	}
}
