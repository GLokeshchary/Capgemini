package main;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

	public static final String SPORTS_QUEUE = "Assignment2_queue_sports";
	public static final String NEWS_QUEUE = "Assignment2_queue_news";
	public static final String POLITICS_QUEUE = "Assignment2_queue_politics";
	public static final String ALL_QUEUE = "Assignment2_queue_all";
	public static final String EXCHANGE = "Topic_exchange";

	@Bean
	Queue sprotsQueue() {
		return new Queue(SPORTS_QUEUE);
	}

	@Bean
	Queue newsQueue() {
		return new Queue(NEWS_QUEUE);
	}

	@Bean
	Queue politicsQueue() {
		return new Queue(POLITICS_QUEUE);
	}

	@Bean
	Queue allQueue() {
		return new Queue(ALL_QUEUE);
	}
	
	@Bean
	TopicExchange topicExchange()
	{
		return new TopicExchange(EXCHANGE);
	}

	@Bean
	Binding sportsbinding(Queue sprotsQueue, TopicExchange topicExchange) {
		return BindingBuilder.bind(sprotsQueue).to(topicExchange).with("queue.sports");
	}

	@Bean
	Binding newsbinding(Queue newsQueue, TopicExchange topicExchange) {
		return BindingBuilder.bind(newsQueue).to(topicExchange).with("queue.news");
	}

	@Bean
	Binding politicsbinding(Queue politicsQueue, TopicExchange topicExchange) {
		return BindingBuilder.bind(politicsQueue).to(topicExchange).with("queue.politics");
	}

	@Bean
	Binding Allbinding(Queue allQueue, TopicExchange topicExchange) {
		return BindingBuilder.bind(allQueue).to(topicExchange).with("queue.*");
	}

	@Bean
	public MessageConverter messageConverter() {
		return new Jackson2JsonMessageConverter();
	}

	@Bean
	public AmqpTemplate template(ConnectionFactory connectionFactory) {
		RabbitTemplate template = new RabbitTemplate(connectionFactory);
		template.setMessageConverter(messageConverter());
		return template;
	}

}
