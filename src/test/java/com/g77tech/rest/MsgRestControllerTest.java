package com.g77tech.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.g77tech.controller.MsgRestController;
import com.g77tech.service.MsgService;

@WebMvcTest(controllers = MsgRestController.class)
public class MsgRestControllerTest {
	
	
	@MockBean
	private MsgService service;
	
	@Autowired
	private MockMvc mockMvc;

	
	@Test
	public void testWelcomeMsg() throws Exception {
		
		// define mock object behavior
		when(service.getWelcomeMsg()).thenReturn("Good Evening....");
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/welcome");
		
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
		
		MockHttpServletResponse response = mvcResult.getResponse();
		
		int status = response.getStatus();
		
		assertEquals(200, status);
	}

	@Test
	public void testGreetMsg() throws Exception {

		when(service.greetMsg()).thenReturn("Namaste World");
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/greet");
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = mvcResult.getResponse();
		int status = response.getStatus();
		assertEquals(200, status);
	}
	
}
