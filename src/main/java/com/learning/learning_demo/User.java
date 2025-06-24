package com.learning.learning_demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;
@Entity
@Table(name = "users")  // ← Cambiar a plural
public class User {
    @Id
    private Integer id;
    private String name;
    private String TechStack;


    public User() {

    }

    public User(Integer id, String name, String TechStack) {
        this.id = id;
        this.name = name;
        this.TechStack = TechStack;

    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechStack() {
        return this.TechStack;
    }

    public void setTechStack(String techStack) {
        this.TechStack = techStack;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(TechStack, user.TechStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, TechStack);
    }
}

