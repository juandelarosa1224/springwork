package com.codeup.springwork.Controllers;

import com.codeup.springwork.models.Post;
import com.codeup.springwork.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    private PostService postService;

    public PostController(PostService ps) {
        this.postService = ps;
    }


    @GetMapping("/posts")
    public String index(Model model) {
        model.addAttribute("posts", postService.all());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String show(@PathVariable int id, Model model) {
        model.addAttribute("posts", "postService.one(id)");
        model.addAttribute("id", id);
        return "view an individual post";
    }

    @GetMapping("/posts/create")
    public String showCreateForm(Model model) {
        model.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/post/create")
    public String save(@ModelAttribute Post post) {
        postService.create(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String showEditForm(@PathVariable int id, Model model) {
        model.addAttribute("post", postService.one(id));
        return "/posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String editPost(@ModelAttribute Post post) {
        postService.edit(post);
        return "/posts/edit" + post.getId();
    }
}
