package com.careerbridge.controller;
import com.careerbridge.dto.SkillGap;import com.careerbridge.model.*;import com.careerbridge.repository.*;import com.careerbridge.service.*;import org.springframework.http.*;import org.springframework.web.bind.annotation.*;import java.util.*;
@RestController @RequestMapping("/api/career") @CrossOrigin
public class CareerController {private final UserRepository users;private final RoleRepository roles;private final SkillGapService gaps;private final RoadmapService roadmap;
 public CareerController(UserRepository users,RoleRepository roles,SkillGapService gaps,RoadmapService roadmap){this.users=users;this.roles=roles;this.gaps=gaps;this.roadmap=roadmap;}
 @GetMapping("/analyze/{userId}/{roleId}") public ResponseEntity<?> analyze(@PathVariable Long userId,@PathVariable Long roleId){User u=users.findById(userId).orElse(null);Role r=roles.findById(roleId).orElse(null);if(u==null||r==null)return ResponseEntity.notFound().build();List<SkillGap> result=gaps.analyze(u,r);return ResponseEntity.ok(Map.of("user",u.getName(),"targetRole",r.getName(),"matchPercent",gaps.matchPercent(result),"skillGaps",result,"roadmap",roadmap.createRoadmap(result)));}
}
