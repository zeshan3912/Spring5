package ca.medroad.spring.springWeb.service;

import ca.medroad.spring.springWeb.model.User;
import ca.medroad.spring.springWeb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Transactional
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    public User getUser(Long id) {
        try {
            return userRepository.getOne(id);
        } catch (NullPointerException ex) {
            throw new UserException("User not found with id ${id}");
        }

    }


    public User updateUser(Long id, User user) {
        if (user.getId() != id) {
            throw new UserException("action not allowed");
        }
        getUser(id);//check if user exist in db

        return createUser(user);
    }


    public void deleteUser(Long id) {
        User user = getUser(id);
        userRepository.delete(user);
    }


    public static class UserException extends RuntimeException {
        private HttpStatus httpStatusCode;

        public UserException(String message) {
            super(message);
            this.httpStatusCode = HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }


}

