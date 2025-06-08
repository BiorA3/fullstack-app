package com.example.pasir_kamil_lenczyk.repository;

import com.example.pasir_kamil_lenczyk.model.Debt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DebtRepository extends JpaRepository<Debt, Long> {
    List<Debt> findByGroupId(Long groupId);
}
