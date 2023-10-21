package vn.edu.iuh.fit.backend.services;

import vn.edu.iuh.fit.backend.repositories.UserRepository;

public class UserServices {
    private UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
