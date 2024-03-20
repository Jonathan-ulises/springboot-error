package com.jona.curso.springboot.error.springbooterror.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jona.curso.springboot.error.springbooterror.exceptions.UserNotFoundException;
import com.jona.curso.springboot.error.springbooterror.models.domain.User;
import com.jona.curso.springboot.error.springbooterror.services.UserService;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index() {
        // int value = 100 / 0;
        int value = Integer.parseInt("10x");
        System.out.println(value);
        return "ok 200";
    }

    @GetMapping("/show/{id}")
    public User show(@PathVariable(name = "id") Long id) {
        User user = userService.findById(id).orElseThrow(() -> new UserNotFoundException("Error el usuario no existe!"));
        System.out.println(user.getName());
        return user;
    }

    // Otra forma de hacer el metodo anterior
    // @GetMapping("/show/{id}")
    // public ResponseEntity<?> show(@PathVariable(name = "id") Long id) {
    //     Optional<User> optionalUser = userService.findById(id);
    //     if (optionalUser.isEmpty()) {
    //         return ResponseEntity.notFound().build();
    //     }
    //     return ResponseEntity.ok(optionalUser.get());
    // }
}
