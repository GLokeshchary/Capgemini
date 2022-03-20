package main.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import main.Models.Employee;

public interface EmployeeRepository  extends MongoRepository<Employee, String>{

}
