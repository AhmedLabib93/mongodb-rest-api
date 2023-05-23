package mongodb.restapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import mongodb.restapi.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {

}
