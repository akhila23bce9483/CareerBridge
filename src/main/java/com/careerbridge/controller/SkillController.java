package com.careerbridge.controller;
import com.careerbridge.model.Skill;import com.careerbridge.repository.SkillRepository;import org.springframework.web.bind.annotation.*;import java.util.*;
@RestController @RequestMapping("/api/skills") @CrossOrigin public class SkillController {private final SkillRepository repo;public SkillController(SkillRepository repo){this.repo=repo;}@GetMapping public List<Skill> all(){return repo.findAll();}@PostMapping public Skill create(@RequestBody Skill skill){return repo.save(skill);}}
