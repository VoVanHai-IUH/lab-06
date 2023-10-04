package vn.edu.iuh.fit.services;

import vn.edu.iuh.fit.repositories.PostRepository;

public class PostServices {
    private PostRepository postRepository;

    public PostServices(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
}
