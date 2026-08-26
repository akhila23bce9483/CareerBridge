package com.careerbridge.controller;
import com.careerbridge.model.Role;import com.careerbridge.repository.RoleRepository;import org.springframework.web.bind.annotation.*;import java.util.*;
@RestController @RequestMapping("/api/roles") @CrossOrigin public class RoleController {private final RoleRepository repo;public RoleController(RoleRepository repo){this.repo=repo;}@GetMapping public List<Role> all(){return repo.findAll();}@PostMapping public Role create(@RequestBody Role role){return repo.save(role);}}
