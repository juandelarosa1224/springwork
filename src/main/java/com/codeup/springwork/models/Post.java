package com.codeup.springwork.models;


import javax.persistence.*;

@Entity
@Table(name="posts")
public class Post {

    @Id @GeneratedValue
    private int id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 10000)
    private String body;

    @ManyToOne @JoinColumn(name = "user_id")
    private User user;

    public Post() {}

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }
    public Post(String title, String body,int id) {
        this(title,body);
        this.setId(id);
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getBody() { return body; }

    public void setBody(String body) { this.body = body; }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }
}