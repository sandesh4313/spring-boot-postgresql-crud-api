package com.employeemanagement.mapper;

import com.employeemanagement.dto.EmployeeDto;
import com.employeemanagement.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        EmployeeDto employeeDto=new EmployeeDto(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getEmail());
        return employeeDto;
    }

    public static Employee maptoEmployee(EmployeeDto employeeDto){
        Employee employee=new Employee(employeeDto.getId(),employeeDto.getFirstName(), employeeDto.getLastName(), employeeDto.getEmail());
        return employee;
    }
}
