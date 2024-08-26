package com.g77tech.service;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class MsgServiceTest {

    @Autowired
    private MsgService msgService;

    @Test
    public void testGetWelcomeMsg(){
        String welcomeMsg = msgService.getWelcomeMsg();
        assertNotNull(welcomeMsg);
    }

    @Test
    public void testGreetMsg(){
        String greetMsg = msgService.greetMsg();
        assertNotNull(greetMsg);
    }
}
