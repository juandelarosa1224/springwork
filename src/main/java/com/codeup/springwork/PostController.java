package com.codeup.springwork;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class PostController {
    @GetMapping("/posts")
    public String post() {
        return "Posts index page!";
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
