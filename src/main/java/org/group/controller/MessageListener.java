package org.group.controller;

import org.group.config.MQConfig;
import org.group.dao.CustomMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomMessage message) {
        System.out.println(message);
    }

    public void computetest() {
        Map<Integer, List<Integer>> map1 = new HashMap<>();
        map1.compute()
    }
}
