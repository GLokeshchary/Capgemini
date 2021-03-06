package main.controller;

import java.util.ArrayList;
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
		List<Product> list2=new ArrayList<>();
		for (Product product : list) {
			if(product.getQuantity()<=10)
			{
				list2.add(product);
			}
		}
		rabbitTemplate.convertAndSend(RabbitMQConfiguration.EXCHANGE,"", list2);
		return msg="message sent to the retail service";
		
	}
	
	


}
