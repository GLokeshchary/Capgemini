package main.Question7_8_9.Controllers.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import main.Question7_8_9.models.Customer;


public interface CustomerRepository extends MongoRepository<Customer, Integer>{
	
	@Query("{'firstname':?0}")
	Optional<Customer> findByFirstName(String customerfirstname);
    @Query("{'products.productname':?0}")
	List<Customer> findByProductName(String productname);

	

}
