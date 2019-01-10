package com.codeup.springwork.services;

import com.codeup.springwork.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
        private List<Post> posts;


        public PostService() {
        posts = new ArrayList<>();
        createPosts();
    }

    public List<Post> all() {
        return posts;
    }

    public Post create(Post post) {
        post.setId(posts.size() + 1);
        posts.add(post);
        return post;
    }

    public Post one(int id) {
        return posts.get(id - 1);
    }

    public Post save(Post post) {
            post.setId(posts.size() + 1);
            posts.add(post);
            return post;
    }

    public Post edit(Post post) {
            Post pp = posts.get(post.getId() - 1);
            pp.setTitle(post.getTitle());
            pp.setBody(post.getBody());
            return pp;
    }

    private void createPosts() {
    create(new Post("New Post 1", "lorem ipsum dolor set amit"));
    create(new Post("New Post 2", "lorem ipsum dolor set amit"));
    create(new Post("New Post 3", "lorem ipsum dolor set amit"));
    create(new Post("New Post 4", "lorem ipsum dolor set amit"));
    }
}

