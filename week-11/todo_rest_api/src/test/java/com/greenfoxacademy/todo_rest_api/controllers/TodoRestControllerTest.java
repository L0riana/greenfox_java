package com.greenfoxacademy.todo_rest_api.controllers;

import com.greenfoxacademy.todo_rest_api.models.Todo;
import com.greenfoxacademy.todo_rest_api.services.ApplicationUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.greenfoxacademy.todo_rest_api.TodoRestApiApplication;
import com.greenfoxacademy.todo_rest_api.services.ApplicationUserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.core.Is.is;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TodoRestApiApplication.class)
@WebAppConfiguration
@EnableWebMvc
@ActiveProfiles("test")
public class TodoRestControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;

    @Autowired
    private ApplicationUserService applicationUserService;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() {
        List<Todo> todoList = new ArrayList<>();
        todoList.add(new Todo("shopping"));
        todoList.add(new Todo("hiking"));
    }

    @Test
    //not working
    public void listTodos() throws Exception {
        List<Todo> todoList = new ArrayList<>();
        todoList.add(new Todo("shopping"));
        todoList.add(new Todo("hiking"));
        MvcResult result =
                mockMvc.perform(get("/todo/list"))
                        .andDo(print())
                        .andExpect(jsonPath("$", hasSize(todoList.size())))
                        .andExpect(jsonPath("$.[*].title", hasItems("shopping", "hiking")))
                        .andExpect(status().isOk())
                        .andReturn();
        String content = result.getResponse().getContentAsString();
    }
}