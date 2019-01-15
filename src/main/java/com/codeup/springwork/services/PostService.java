package com.codeup.springwork.services;

import com.codeup.springwork.models.Post;
import com.codeup.springwork.models.PostRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
//        private List<Post> posts;

        private PostRepository repo;


        public PostService(PostRepository repo) {
        this.repo = repo;
//        createPosts();
    }

    public List<Post> all() {

            return (List<Post>) repo.findAll();
    }



    public Post create(Post post) {
        repo.save(post);
        return post;
    }

    public Post findOne(int id) {
        return repo.findOne(id);
    }

    public Post edit(Post post) {
           return repo.save(post);
    }

    public void delete(Post post) {
            repo.delete(post);
    }
//
//    private void createPosts() {
////    create(new Post("New Post 1", "lorem ipsum dolor set amit"));
////    create(new Post("New Post 2", "lorem ipsum dolor set amit"));
////    create(new Post("New Post 3", "lorem ipsum dolor set amit"));
////    create(new Post("New Post 4", "lorem ipsum dolor set amit"));
//    }
}

