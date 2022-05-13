package com.example.todoapp.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String username;
    private String password;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Todo> todoList = new ArrayList<>();

    public User() {
    }

    public User(Long id, String username, String password, List<Todo> todoList) {
        Id = id;
        this.username = username;
        this.password = password;
        this.todoList = todoList;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Todo> getTodoList() {
        return todoList;
    }

    public void setTodoList(List<Todo> todoList) {
        this.todoList = todoList;
    }
}
