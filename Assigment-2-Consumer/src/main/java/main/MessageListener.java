package main;

import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;



@Component
public class MessageListener {
	
	@RabbitListener(queues = RabbitMQConfig.ALL_QUEUE)
	public void Listener(Message message)
	{
		System.out.println(message);
	}

}
