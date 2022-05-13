package com.example.todoapp;

import com.example.todoapp.entity.Todo;
import com.example.todoapp.entity.User;
import com.example.todoapp.repository.UserRepository;
import com.example.todoapp.repository.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoAppApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User();
		user.setPassword("should be hashed");
		user.setUsername("Mustafa");

		Todo todo = new Todo();
		todo.setContent("Do homeworks");

		user.getTodoList().add(todo);


		userRepository.save(user);
	}
}
