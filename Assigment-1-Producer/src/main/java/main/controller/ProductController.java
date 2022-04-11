package main.controller;

import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import main.config.RabbitMQConfiguration;
import main.models.Product;
import main.models.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@PostMapping("/products")
	public void saveprdouct(@RequestBody Product product)
	{
		productRepository.save(product);
	}
	
	@GetMapping("/products")
	public String getallproducts(){
		String msg = null;
		List<Product> list=productRepository.findAll();
		for (Product product : list) {
			if(product.getQuantity()<=10)
			{
				rabbitTemplate.convertAndSend(RabbitMQConfiguration.EXCHANGE,"", product);
				return msg="message sent to the retail service";
			}
			else
			{
				return msg="no product with less than 10 quantity";
			}
		}
		return msg;
		
	}
	
	@GetMapping("/news")
	public String getnews() {
		rabbitTemplate.convertAndSend(RabbitMQConfiguration.EXCHANGE1, "queue.sports", "message sent to sportsqueue");
		return "Message sent to subcriber list";
	}


}
