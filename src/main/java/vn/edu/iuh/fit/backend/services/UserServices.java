package vn.edu.iuh.fit.backend.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.backend.models.User;
import vn.edu.iuh.fit.backend.repositories.UserRepository;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class UserServices {
    private UserRepository userRepository;

    public User login(String email, String password) {
        return userRepository.findByEmailAndPasswordHash(email, password).orElse(null);
    }
}
