package com.restserver.web;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restserver.Model.employeeEntity;
import com.restserver.Model.loginEntity;
import com.restserver.Repository.EmployeeRepository;
import com.restserver.Repository.loginRepository;

@RestController
public class myController {
	@Autowired
	EmployeeRepository es;
	@Autowired
	loginRepository ls;
	
	 @GetMapping(path="/EmployeeSpring/Employee",produces = MediaType.APPLICATION_JSON_VALUE)
		public List<employeeEntity> getdata()
	    {
		 List<employeeEntity> employees=es.findAll();
			return employees;		
	    }
    @GetMapping(path="EmployeeSpring/login",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<loginEntity> GetData(loginEntity loginentity)
    {	
		List<loginEntity> logins=ls.findAll();
        return logins; 	
    }
	 @PostMapping(path="/EmployeeSpring/Employee/update",consumes = MediaType.APPLICATION_JSON_VALUE)
		public employeeEntity uploaddata(@RequestBody employeeEntity employee)
	    {
		 es.save(employee);	
		 return employee;
	    }
	 @PostMapping(path="/EmployeeSpring/Employee/saveorupdate",consumes = MediaType.APPLICATION_JSON_VALUE)
		public employeeEntity updatedata(@RequestBody employeeEntity employee)
	    {
		 es.delete(employee);
		 es.save(employee);	
		 return employee;
	    }
}
