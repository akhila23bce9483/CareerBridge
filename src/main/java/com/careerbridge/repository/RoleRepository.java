package com.careerbridge.repository;
import com.careerbridge.model.Role;import org.springframework.data.jpa.repository.JpaRepository;import java.util.*;
public interface RoleRepository extends JpaRepository<Role,Long>{Optional<Role> findByNameIgnoreCase(String name);}
