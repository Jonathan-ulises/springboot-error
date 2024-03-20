package com.jona.curso.springboot.error.springbooterror.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jona.curso.springboot.error.springbooterror.models.domain.User;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users;
    
    public UserServiceImpl() {
        this.users = new ArrayList<>();
        users.add(new User(1L, "Jonathan", "Sanchez"));
        users.add(new User(2L, "Luis", "Aranda"));
        users.add(new User(3L, "Oscar", "Ramirez"));
        users.add(new User(4L, "Leo", "Messi"));
        users.add(new User(5L, "Israel", "Edo"));
    }
    
    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        User user = null;
        for (User u: users) {
            if (u.getId().equals(id)) {
                user = u;
                break;
            }
        }
        return Optional.ofNullable(user);
    }

}
