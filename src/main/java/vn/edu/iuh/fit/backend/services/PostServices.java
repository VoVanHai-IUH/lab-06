package vn.edu.iuh.fit.backend.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.backend.repositories.PostRepository;

@Service
@NoArgsConstructor @AllArgsConstructor
public class PostServices {
    private PostRepository postRepository;
}

