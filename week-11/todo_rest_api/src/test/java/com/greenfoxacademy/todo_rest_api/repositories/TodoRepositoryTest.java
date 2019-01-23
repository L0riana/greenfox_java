package com.greenfoxacademy.todo_rest_api.repositories;

import com.greenfoxacademy.todo_rest_api.TodoRestApiApplication;
import com.greenfoxacademy.todo_rest_api.models.Todo;
import com.greenfoxacademy.todo_rest_api.services.ApplicationUserService;
import com.greenfoxacademy.todo_rest_api.services.TodoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TodoRestApiApplication.class)
@WebAppConfiguration
@EnableWebMvc
@ActiveProfiles("test")
public class TodoRepositoryTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Autowired
    TodoService todoService;


    @Test
    public void testSaveNewTodoAndFindByTitle(){
        Todo todo = new Todo("go shopping");
        todoService.save(todo);
        Assert.assertNotNull(todoService.findByTitle("go shopping"));
    }



}