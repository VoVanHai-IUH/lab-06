package vn.edu.iuh.fit.services;

import vn.edu.iuh.fit.repositories.UserRepository;

public class UserServices {
    private UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
