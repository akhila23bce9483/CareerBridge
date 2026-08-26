package com.careerbridge.repository;
import com.careerbridge.model.Skill;import org.springframework.data.jpa.repository.JpaRepository;import java.util.*;
public interface SkillRepository extends JpaRepository<Skill,Long>{Optional<Skill> findByNameIgnoreCase(String name);}
