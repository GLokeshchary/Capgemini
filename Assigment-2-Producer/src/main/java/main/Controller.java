package main;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	@PostMapping("/news")
	public String getnews(@RequestBody Message message) {
		rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE, "queue.sports", message);
		return "Message sent to subcriber list";
	}
}
