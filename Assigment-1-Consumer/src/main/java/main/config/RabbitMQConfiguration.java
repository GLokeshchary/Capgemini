package main.config;


import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfiguration {

    public static final String QUEUE = "Assignment1_queue";
    public static final String EXCHANGE = "Assignment1_exchange";
    
    public static final String QUEUE1 = "Assignment2_queue_sports";
    public static final String QUEUE2 = "Assignment2_queue_news";
    public static final String QUEUE3 = "Assignment2_queue_politics";
    public static final String QUEUE4 = "Assignment2_queue_all";
    public static final String EXCHANGE1 = "Assignment1_exchange";
    public static final String ROUTING_KEY = "message_routingKey";

    @Bean
    public Queue queue() {
        return  new Queue(QUEUE);
    }

    @Bean
    public FanoutExchange exchange() {
        return new FanoutExchange(EXCHANGE);
    }

    @Bean
    public Binding binding(Queue queue, FanoutExchange exchange) {
        return BindingBuilder
                .bind(queue)
                .to(exchange);
    }
    
    /*@Bean
    public Queue sportsqueue() {
        return  new Queue(QUEUE1);
    }
    @Bean
    public Queue newsqueue() {
        return  new Queue(QUEUE2);
    }
    @Bean
    public Queue politicsqueue() {
        return  new Queue(QUEUE3);
    }
    @Bean
    public Queue allqueue() {
        return  new Queue(QUEUE4);
    }

    @Bean
    public TopicExchange exchange1() {
        return new TopicExchange(EXCHANGE1);
    }
    
    @Bean
    public Binding binding1(Queue queue1, TopicExchange topicexchange) {
        return BindingBuilder
                .bind(queue1)
                .to(topicexchange).with("queue.sports");
    }
    @Bean
    public Binding binding2(Queue queue1, TopicExchange topicexchange) {
        return BindingBuilder
                .bind(queue1)
                .to(topicexchange).with("queue.politics.science");
    }
    @Bean
    public Binding binding3(Queue queue1, TopicExchange topicexchange) {
        return BindingBuilder
                .bind(queue1)
                .to(topicexchange).with("queue.*");
    }*/
    

    @Bean
    public MessageConverter messageConverter() {
        return  new Jackson2JsonMessageConverter();
    }

    @Bean
    public AmqpTemplate template(ConnectionFactory connectionFactory) {
        RabbitTemplate template = new RabbitTemplate(connectionFactory);
        template.setMessageConverter(messageConverter());
        return  template;
    }

}