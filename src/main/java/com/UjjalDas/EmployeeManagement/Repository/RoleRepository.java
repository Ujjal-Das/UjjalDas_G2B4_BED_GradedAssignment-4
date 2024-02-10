package com.UjjalDas.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UjjalDas.EmployeeManagement.Entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}

