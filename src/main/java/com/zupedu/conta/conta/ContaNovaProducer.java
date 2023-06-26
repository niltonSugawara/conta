package com.zupedu.conta.conta;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


@Component
public class ContaNovaProducer {

    Logger logger = LoggerFactory.getLogger(ContaNovaProducer.class);

    @Autowired
    private KafkaTemplate<String, Conta> kafkaTemplate;

    @Value("${spring.kafka.producer.topic}")
    private String topic;

    @Async
    public void enviar(Conta conta){
        kafkaTemplate.send(topic,conta);

        logger.info("nova conta criada: {}", conta.toString());
    }

}
