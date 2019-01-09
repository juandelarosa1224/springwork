package com.codeup.springwork.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/posts")
    public String post() {
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String id() {
        return "view an individual post";
    }

    @GetMapping("/posts/create")
    public String create() {
        return "view the form for creating a post";
    }

    @PostMapping("/post")
    public String save() {
        return "create a new post";
    }
}
