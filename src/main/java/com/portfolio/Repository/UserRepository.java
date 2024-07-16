package com.portfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

