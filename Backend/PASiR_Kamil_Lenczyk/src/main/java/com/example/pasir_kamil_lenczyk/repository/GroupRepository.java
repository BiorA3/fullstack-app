package com.example.pasir_kamil_lenczyk.repository;

import com.example.pasir_kamil_lenczyk.model.Group;
import com.example.pasir_kamil_lenczyk.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group, Long> {
    List<Group> findByMemberships_User(User user);
}
