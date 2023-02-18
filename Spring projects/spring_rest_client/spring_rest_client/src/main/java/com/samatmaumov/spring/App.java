package com.samatmaumov.spring;

import com.samatmaumov.spring.configuration.MyConfig;
import com.samatmaumov.spring.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

        //List<Employee> allEmployees = communication.getAllEmployees();
        //System.out.println(allEmployees);

        //Employee employeeById = communication.getEmployee(2);
        //System.out.println(employeeById);

        //Employee employee = new Employee("Laura", "Maratova", "Sales", 450);
        //communication.saveEmployee(employee);

        communication.deleteEmployee(15);
    }
}
