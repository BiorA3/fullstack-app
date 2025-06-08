package com.example.pasir_kamil_lenczyk.repository;

import com.example.pasir_kamil_lenczyk.model.Transaction;
import com.example.pasir_kamil_lenczyk.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUser(User user);
}
