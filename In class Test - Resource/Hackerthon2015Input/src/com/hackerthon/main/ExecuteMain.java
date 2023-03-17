package com.hackerthon.main;

import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import com.hackerthon.common.UtilTRANSFORM;
import com.hackerthon.service.EmployeeService;

public class ExecuteMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();
		try {
			UtilTRANSFORM.rEQUESTtRANSFORM();
			employeeService.EmployeeXml();
			employeeService.EmployeeCreate();
			employeeService.EmployeeAdd();
			employeeService.EmployeeGetById("EMP10004");
 		    employeeService.EmployeeDelete("EMP10001");
			employeeService.EmployeeDisplay();
		} catch (Exception e) {
		}

	}

}
