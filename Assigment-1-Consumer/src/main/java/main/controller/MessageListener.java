package main.controller;

import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import main.config.RabbitMQConfiguration;
import main.models.Product;


@Component
public class MessageListener {

	@RabbitListener(queues = RabbitMQConfiguration.QUEUE)
	public void Listener(List<Product> product)
	{
		for (Product product2 : product) {
			System.out.println(product2);
		}
	}
}
