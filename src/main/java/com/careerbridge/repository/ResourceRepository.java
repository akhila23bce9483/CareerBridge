package com.careerbridge.repository;
import com.careerbridge.model.Resource;import org.springframework.data.jpa.repository.JpaRepository;import java.util.*;
public interface ResourceRepository extends JpaRepository<Resource,Long>{List<Resource> findBySkillId(Long skillId);}
