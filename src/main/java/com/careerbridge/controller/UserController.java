package com.careerbridge.controller;
import com.careerbridge.model.User;import com.careerbridge.repository.UserRepository;import org.springframework.web.bind.annotation.*;import java.util.*;
@RestController @RequestMapping("/api/users") @CrossOrigin public class UserController {private final UserRepository repo;public UserController(UserRepository repo){this.repo=repo;}@GetMapping public List<User> all(){return repo.findAll();}@PostMapping public User create(@RequestBody User user){return repo.save(user);}}
